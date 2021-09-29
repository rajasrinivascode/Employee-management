package com.employee.wages.model;

import lombok.Data;

@Data
public class HourlyEmployee extends Employee {

	private String employee_name;
	private String employee_type;
	private int employee_vacation;
	private int workDays;

	private static final int MAX_ALLOWED_VACCATION = 10;

	public HourlyEmployee(String employee_name, String employee_type, int employee_vacation) {
		super(employee_vacation);
		this.employee_name = employee_name;
		this.employee_type = employee_type;
		this.employee_vacation = employee_vacation;

	}

	@Override
	public double work(int noOfDaysWorked) {
		
		if (noOfDaysWorked >= 265)
			return noOfDaysWorked * 265 + noOfDaysWorked * 2.65 * (noOfDaysWorked - 265);
		else
			return noOfDaysWorked / 265 + (noOfDaysWorked - 265);
	}

	@Override
	public double takeVacation(double noOfDaysVacationUsed) {
		 return noOfDaysVacationUsed * 265 + noOfDaysVacationUsed * 2.65 * (MAX_ALLOWED_VACCATION);
	}

	
}
