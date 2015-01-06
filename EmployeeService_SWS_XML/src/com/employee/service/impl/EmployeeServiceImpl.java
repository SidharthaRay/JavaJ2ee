package com.employee.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.employee.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public Map<String, String> getEmployeeDetails(String empId) {
		Map<String, String> result = new HashMap<String, String>(2);
		if(empId.equalsIgnoreCase("11111")) {
			result.put("name", "Sidhartha S. Ray");
			result.put("email", "sidhartha.ray533@gmail.com");
			result.put("serviceLine", "Systems Integration");
		} else {
			result.put("name", "Narendra Gandharva");
			result.put("email", "n.gandharva533@gmail.com");
			result.put("serviceLine", "Systems Integration");
		}
		return result;
	}

	@Override
	public Map<String, String> getEmployeeSkillSet(String empId) {
		Map<String, String> result = new HashMap<String, String>(2);
		if(empId.equalsIgnoreCase("11111")) {
			result.put("language", "Java");
			result.put("framework", "Spring");
		} else {
			result.put("language", "Java");
			result.put("framework", "JSF");
		}
		return result;
	}

}
