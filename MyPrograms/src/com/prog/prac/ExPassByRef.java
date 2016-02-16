package com.prog.prac;

public class ExPassByRef {

	public int a;
	public int b;

	public ExPassByRef(){
		
	}
	public ExPassByRef(int x, int y){
		this.a = x;
		this.b = y;
	}
	
	public void swap(){
		a=a+b;
		b=a-b;
		a=a-b;
		
	}
	public void print(){
		System.out.println("a: "+a+ "b: "+b);
	}
}
