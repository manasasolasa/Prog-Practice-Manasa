package com.java.aug;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum, mul,div;
		sum=add();
//		mul=mul();
		div=div();
		
		int a=8, b=4;
		
		System.out.println("sum: "+sum);
		System.out.println("multiplication is: "+mul(a,b));
		System.out.println("div: "+div);
	
	}
	
	public static int add(){
		int a = 10;
		int b = 5;
		int sum = a+b;
		return sum;	
		
	}

	public static int mul(int a1,int b1){
		
		int mul = a1*b1;
		return mul;	
		
	}
	public static int div(){
		int a = 10;
		int b = 5;
		int div = a/b;
		return div;	
		
	}
}
