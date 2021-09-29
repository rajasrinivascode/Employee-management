package com.employee.wages.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.wages.model.Employee;
import com.employee.wages.model.EmployeeDto;
import com.employee.wages.service.EmployeeService;




@RestController
@CrossOrigin
@RequestMapping(value="/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	@PostMapping("/save-Employee")
	public boolean saveEmployee(@RequestBody EmployeeDto Employee) {
		 return employeeservice.saveEmployee(Employee);
		
	}
	
	@GetMapping("/employees-list")
	public List<EmployeeDto> allEmployees() {
		 return employeeservice.getEmployees();
	}
	
	
	
}
