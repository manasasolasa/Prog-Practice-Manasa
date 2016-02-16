package com.java.aug;

public class EmployeeInheritance extends PersonInheritance {

	int salary;
	
	EmployeeInheritance(){
		
	}
	
	public EmployeeInheritance(String fname,String lname, int sal){
		super(fname,lname);
		this.salary = sal;
		
	}
}
