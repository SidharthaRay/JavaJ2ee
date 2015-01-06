package com.employee.endpoint;

import java.util.Map;

import org.springframework.oxm.Marshaller;
import org.springframework.ws.server.endpoint.AbstractMarshallingPayloadEndpoint;

import com.employee.schema.EmployeeDetailsRequest;
import com.employee.schema.EmployeeDetailsResponse;
import com.employee.schema.ObjectFactory;
import com.employee.service.EmployeeService;

public class EmployeeDetailsEndpoint extends AbstractMarshallingPayloadEndpoint{

	private ObjectFactory objectFactory;
	private Marshaller marshaller;
	private EmployeeService employeeService;
	
	public EmployeeDetailsEndpoint(ObjectFactory objectFactory, Marshaller marshaller, EmployeeService employeeService) {
		super(marshaller);
		this.objectFactory = objectFactory;
		this.marshaller = marshaller;
		this.employeeService = employeeService;
	}
	
	@Override
	protected Object invokeInternal(Object request) throws Exception {
		EmployeeDetailsRequest employeeDetailsRequest = (EmployeeDetailsRequest) request;

		String empId = employeeDetailsRequest.getEmpId();
		
		//Invoke service component
		Map<String, String> empDetails = employeeService.getEmployeeDetails(empId);
		
		EmployeeDetailsResponse employeeDetailsResponse = objectFactory.createEmployeeDetailsResponse();
		employeeDetailsResponse.setName(empDetails.get("name"));
		employeeDetailsResponse.setEmail(empDetails.get("email"));
		employeeDetailsResponse.setServiceLine(empDetails.get("serviceLine"));
		return employeeDetailsResponse;
	}

}
