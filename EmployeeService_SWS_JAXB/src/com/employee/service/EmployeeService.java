package com.employee.service;

import java.util.Map;

public interface EmployeeService {
	Map<String, String> getEmployeeDetails(String empId);
	Map<String, String> getEmployeeSkillSet(String empId);
}
