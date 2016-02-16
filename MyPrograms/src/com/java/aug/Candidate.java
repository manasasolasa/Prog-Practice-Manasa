package com.java.aug;

public class Candidate implements java.io.Serializable {

	int id;
	String name;
	double sqlmarks;
	String email;
	char gender;
	boolean validUSstatus;
//	CourseType course;
	String course1;
	
	public Candidate(){
		
	}
	
	public Candidate(int id, String name, String course1){
		this. id = id;
		this. name = name;
		this. course1 = course1;
	}
	
	
}
