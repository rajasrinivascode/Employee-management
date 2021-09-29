package com.employee.wages.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.wages.model.EmployeeDto;

@Service
@Transactional
public class EmployeeServiceImp implements EmployeeService {

	private static List<EmployeeDto> list = new ArrayList<>();

	@Override
	public boolean saveEmployee(EmployeeDto emp) {
		return true;
	}

	@Override
	public List<EmployeeDto> getEmployees() {
		return buildEmployeeList();
	}

	private List<EmployeeDto> buildEmployeeList() {

		EmployeeDto employee = new EmployeeDto();
		employee.setEmployee_id(1);
		employee.setEmployee_name("Albert Paul");
		employee.setEmployee_type("SALARIED");
		employee.setEmployee_vacation(15);
		
		EmployeeDto employee2 = new EmployeeDto();
		employee2.setEmployee_id(2);
		employee2.setEmployee_name("Raja Srinivas Sriram");
		employee2.setEmployee_type("HOURLY");
		employee2.setEmployee_vacation(10);
		
		EmployeeDto employee3 = new EmployeeDto();
		employee3.setEmployee_id(3);
		employee3.setEmployee_name("Chrissy Beggato");
		employee3.setEmployee_type("MANAGER");
		employee3.setEmployee_vacation(30);
		
		EmployeeDto employee4 = new EmployeeDto();
		employee4.setEmployee_id(4);
		employee4.setEmployee_name("Saun Jity");
		employee4.setEmployee_type("SALARIED");
		employee4.setEmployee_vacation(15);
		
		EmployeeDto employee5 = new EmployeeDto();
		employee5.setEmployee_id(5);
		employee5.setEmployee_name("Simon Reddy");
		employee5.setEmployee_type("HOURLY");
		employee5.setEmployee_vacation(10);
		
		EmployeeDto employee6 = new EmployeeDto();
		employee6.setEmployee_id(6);
		employee6.setEmployee_name("Pool Ravi");
		employee6.setEmployee_type("MANAGER");
		employee6.setEmployee_vacation(30);
		
		EmployeeDto employee7 = new EmployeeDto();
		employee7.setEmployee_id(7);
		employee7.setEmployee_name("Sohan Seth");
		employee7.setEmployee_type("SALARIED");
		employee7.setEmployee_vacation(15);
		
		EmployeeDto employee8 = new EmployeeDto();
		employee8.setEmployee_id(8);
		employee8.setEmployee_name("Simron Kaur");
		employee8.setEmployee_type("HOURLY");
		employee8.setEmployee_vacation(10);
		
		EmployeeDto employee9 = new EmployeeDto();
		employee9.setEmployee_id(9);
		employee9.setEmployee_name("Bryan DSouzza");
		employee9.setEmployee_type("MANAGER");
		employee9.setEmployee_vacation(30);
		
		EmployeeDto employee10 = new EmployeeDto();
		employee10.setEmployee_id(10);
		employee10.setEmployee_name("Shila Kumari");
		employee10.setEmployee_type("MANAGER");
		employee10.setEmployee_vacation(30);
		 
		list.add(employee);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);
		list.add(employee6);
		list.add(employee7);
		list.add(employee8);
		list.add(employee9);
		list.add(employee10);

		return list;

	}
	
	
	private EmployeeDto addNewEmployee(EmployeeDto emp){
		int employeeId = list.size()+1;
		emp.setEmployee_id(employeeId);
		return emp;
		
	}

/*EmployeeDto employee1 =EmployeeDto.builder().employee_id(1).employee_name("Albert Paul").employee_type("SALARIED")
	.employee_vacation(15).build();
EmployeeDto employee2 = EmployeeDto.builder().employee_id(2).employee_name("Raja Srinivas Sriram")
	.employee_type("HOURLY").employee_vacation(10).build();
EmployeeDto employee3 = EmployeeDto.builder().employee_id(3).employee_name("Chrissy Beggato").employee_type("MANAGER")
	.employee_vacation(30).build();
EmployeeDto employee4 = EmployeeDto.builder().employee_id(4).employee_name("Saun Jity").employee_type("SALARIED")
	.employee_vacation(15).build();
EmployeeDto employee5 = EmployeeDto.builder().employee_id(5).employee_name("Simon Reddy").employee_type("HOURLY")
	.employee_vacation(10).build();
EmployeeDto employee6 = EmployeeDto.builder().employee_id(6).employee_name("Pool Ravi").employee_type("MANAGER")
	.employee_vacation(30).build();
EmployeeDto employee7 = EmployeeDto.builder().employee_id(7).employee_name("Sohan Seth").employee_type("SALARIED")
	.employee_vacation(15).build();
EmployeeDto employee8 = EmployeeDto.builder().employee_id(8).employee_name("Simron Kaur").employee_type("HOURLY")
	.employee_vacation(10).build();
EmployeeDto employee9 = EmployeeDto.builder().employee_id(9).employee_name("Bryan DSouzza").employee_type("MANAGER")
	.employee_vacation(30).build();
EmployeeDto employee10 = EmployeeDto.builder().employee_id(10).employee_name("Shila Kumari").employee_type("MANAGER")
	.employee_vacation(30).build();*/
}
