package com.java.aug;

public class TestLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getLimit(true);
		getLimit(25);
		getLimit(30,true);

	}

	static int getLimit(int age){
		
		int limit =0;
		if(age>20){
			limit = 25;
			System.out.println("good fit");
			}
		else {
			limit = 25;
			System.out.println("under fit");
		}
		
		return limit;
		
		
	}
	static int getLimit(int age,boolean status){
		
		int limit =0;
		
		if(age>25 && status ==true) {limit =25;
		System.out.println("perfect age");
		}
		else{
			limit = 25;
			System.out.println("not fit");
		}
		
		return limit;
		
		
	}
	static int getLimit(boolean status){
		
		int limit =0;
		
		if(status ==true) {limit =25;
		System.out.println("perfect age");
		}
		else{
			limit = 25;
			System.out.println("not fit");
		}
		
		return limit;
	}
}
