package com.prog.prac;

public class NumberSwap {

	public int a;
	public int b;

	public NumberSwap(){
		
	}
	public NumberSwap(int x, int y){
		this.a = x;
		this.b = y;
	}
	
	public void swap1(){
		a=a+b;
		b=a-b;
		a=a-b;
		
	}
	public void swap2(){
		int temp;
		temp = a;
		a = b;
		b = temp;
		
	}
	public void print(){
		System.out.println("a: "+a+ "b: "+b);
	}
}
