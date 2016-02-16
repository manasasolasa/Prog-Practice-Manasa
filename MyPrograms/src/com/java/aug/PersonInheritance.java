package com.java.aug;

public abstract class PersonInheritance {

	String fname;
	String lname;
	
	PersonInheritance(){
		
	}
	PersonInheritance(String first, String last){
		fname=first;
		lname=last;
	}
	public String concat(String fname,String lname){
		return fname+lname;
	}
	
}
