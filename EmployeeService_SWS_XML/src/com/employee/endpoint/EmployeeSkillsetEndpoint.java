package com.employee.endpoint;

import java.util.Map;

import org.springframework.ws.server.endpoint.AbstractDomPayloadEndpoint;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.employee.service.EmployeeService;

public class EmployeeSkillsetEndpoint extends AbstractDomPayloadEndpoint{

	private EmployeeService employeeService;
	
	public EmployeeSkillsetEndpoint(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@Override
	protected Element invokeInternal(Element requestElement, Document responseDocument)
			throws Exception {
		String empId = requestElement.getTextContent();
		
		//Invoke service component
		Map<String, String> empDetails = employeeService.getEmployeeSkillSet(empId.trim());
		
		Element response = responseDocument.createElementNS("http://spring_ws.trg/employee", "EmployeeSkillsetResponse");
		Element language = responseDocument.createElement("language");
		language.setTextContent(empDetails.get("language"));
		response.appendChild(language);
		Element framework = responseDocument.createElement("framework");
		framework.setTextContent(empDetails.get("framework"));
		response.appendChild(framework);
		return response;
	}

}
