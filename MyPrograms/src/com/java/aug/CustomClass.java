package com.java.aug;

public class CustomClass {
	
	public String emp_name;
	public int emp_id;
	
	public void printEmpDet(){
		
		System.out.println("hello, "+emp_name+" your id is "+emp_id);
		
	}
	
	public CustomClass(){//default constructor
		emp_name="no name";
		emp_id=0;
		
	}
	//INIT CONSTRUCTOR
	public CustomClass(String name){
		emp_name=name;

	}
	public CustomClass(int id){
		emp_id = id;
	}
	public CustomClass(String name, int id){
		emp_name=name;
		emp_id = id;
	}

	
}
