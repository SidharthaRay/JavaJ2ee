package com.employee.endpoint;

import java.util.Map;

import org.springframework.ws.server.endpoint.AbstractDomPayloadEndpoint;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.employee.service.EmployeeService;

public class EmployeeDetailsEndpoint extends AbstractDomPayloadEndpoint{

	private EmployeeService employeeService;
	
	public EmployeeDetailsEndpoint(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@Override
	protected Element invokeInternal(Element requestElement, Document responseDocument)
			throws Exception {
		String empId = requestElement.getTextContent();
		
		//Invoke service component
		Map<String, String> empDetails = employeeService.getEmployeeDetails(empId.trim());
		
		Element response = responseDocument.createElementNS("http://spring_ws.trg/employee", "EmployeeDetailsResponse");
		Element name = responseDocument.createElement("name");
		name.setTextContent(empDetails.get("name"));
		response.appendChild(name);
		Element email = responseDocument.createElement("email");
		email.setTextContent(empDetails.get("email"));
		response.appendChild(email);
		Element serviceLine = responseDocument.createElement("serviceLine");
		serviceLine.setTextContent(empDetails.get("serviceLine"));
		response.appendChild(serviceLine);
		return response;
	}

}
