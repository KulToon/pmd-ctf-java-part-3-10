package com.thaiprogramer.ooplab;

public class Employee {
	public String firstName;
	public String lastName;
	private int salary;
	public String position;
	
	public static void main(String[] args) {
		Employee[] employees = new Employee[3];
		for(int i = 0; i < employees.length; i++) {
			employees[i] = new Employee("first" + i, "last" + i, 10000);
			System.out.println(employees[i].firstName);
		}
	}
	
	
	public Employee(String firstNameInput, String lastNameInput, int salaryInput) {
		firstName = firstNameInput;
		lastName = lastNameInput;
	
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
