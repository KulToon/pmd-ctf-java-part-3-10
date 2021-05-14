package com.thaiprogramer.ooplab;

public class Employee {
	public String firstName;
	public String lastName;
	private int salary;
	public String position;
	
	
	public Employee(String firstNameInput, String lastNameInput, int salaryInput, String positionInput) {
		firstName = firstNameInput;
		lastName = lastNameInput;
		position = positionInput;
		salary = salaryInput;
		
	}
	
	public void hello() {
		System.out.println("Hello" + firstName);
		
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String getPosition() {
		return position;
	}
	
}
