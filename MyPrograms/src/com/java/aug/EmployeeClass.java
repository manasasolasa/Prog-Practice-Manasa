package com.java.aug;

public class EmployeeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = new String("hello");
		
		CustomClass c = new CustomClass(); //object is created and default constructor is used
		c.printEmpDet();
		
		CustomClass c1 = new CustomClass("manasa", 111);
		c1.printEmpDet();
		
		CustomClass c2 = new CustomClass("tanvi");
		c2.printEmpDet();
		
		CustomClass c3 = new CustomClass(112);
		c3.emp_name = "sunny";
		c3.printEmpDet();
		
		
	}

}
