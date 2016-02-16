package com.prog.prac;

public class ExceptionEx {

	static int div(int a, int b){
		if(b==0){
			System.out.println("exception occured");
			throw new ArithmeticException();
			
		}
		else	
		return (a/b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 50;
		int b = 0;
		
		System.out.println("division is " +div(a,b));
		
	}

}
