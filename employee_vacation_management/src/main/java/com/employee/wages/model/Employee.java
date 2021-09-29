package com.employee.wages.model;

import lombok.Data;

@Data
public abstract class Employee {
	private int employee_vacation;

	public Employee(int employee_vacation) {
		this.employee_vacation = 0;
	}
	
	abstract public double work (int noOfDaysWorked);
	
	abstract public double takeVacation (double noOfDaysVacationUsed);
	

}
