package com.employee.endpoint;

import java.util.Map;

import org.springframework.oxm.Marshaller;
import org.springframework.ws.server.endpoint.AbstractMarshallingPayloadEndpoint;

import com.employee.schema.EmployeeDetailsRequest;
import com.employee.schema.EmployeeSkillsetRequest;
import com.employee.schema.EmployeeSkillsetResponse;
import com.employee.schema.ObjectFactory;
import com.employee.service.EmployeeService;

public class EmployeeSkillsetEndpoint extends AbstractMarshallingPayloadEndpoint{

	private ObjectFactory objectFactory;
	private Marshaller marshaller;
	private EmployeeService employeeService;
	
	public EmployeeSkillsetEndpoint(ObjectFactory objectFactory, Marshaller marshaller, EmployeeService employeeService) {
		super(marshaller);
		this.objectFactory = objectFactory;
		this.marshaller = marshaller;
		this.employeeService = employeeService;
	}
	
	@Override
	protected Object invokeInternal(Object request) throws Exception {
		EmployeeSkillsetRequest employeeSkillsetRequest = (EmployeeSkillsetRequest) request;

		String empId = employeeSkillsetRequest.getEmpId();
		
		//Invoke service component
		Map<String, String> empSkillset = employeeService.getEmployeeSkillSet(empId);
		
		EmployeeSkillsetResponse employeeSkillsetResponse = objectFactory.createEmployeeSkillsetResponse();
		employeeSkillsetResponse.setLanguage(empSkillset.get("language"));
		employeeSkillsetResponse.setFramework(empSkillset.get("framework"));
		return employeeSkillsetResponse;
	}

}
