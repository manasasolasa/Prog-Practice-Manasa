package com.prog.prac;

public class StaticPriority {

	static int x;
	static{
		x=10;
		System.out.println("in the static block "+x );
	}
	static void fn(){
		x=20;
		System.out.println("in the static method " +x);
	}
	
	StaticPriority(int x){
		this.x=x;
		System.out.println("in the constructor " +x);
		
	}
	StaticPriority(){
		System.out.println("in the default constructor" +x);
	}

}
