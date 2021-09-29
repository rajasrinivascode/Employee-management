package com.employee.wages.service;

import java.util.List;

import com.employee.wages.model.EmployeeDto;

public interface EmployeeService {

	public boolean saveEmployee(EmployeeDto Employee);

	public List<EmployeeDto> getEmployees();

}
