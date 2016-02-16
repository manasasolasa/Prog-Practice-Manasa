package com.java.aug;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char grade = 'Z';
		int gradepoints=0;
		
		switch(grade){
		case 'A': gradepoints = 500;
				System.out.println("your grade is A and your score is " +gradepoints);
				break;
		case 'B': gradepoints = 400;
				System.out.println("your grade is B and your score is " +gradepoints);
				break;
		case 'C': gradepoints = 300;
				System.out.println("your grade is C and your score is " +gradepoints);	
				break;
		case 'D': gradepoints = 200;
				System.out.println("your grade is A and your score is " +gradepoints);
				break;
		default: gradepoints = 100;
				System.out.println("your grade is not up to the mark");
		}
	}

}
