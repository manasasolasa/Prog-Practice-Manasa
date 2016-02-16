package com.prog.prac;

public class WrapperEx {

	public static void main(String[] args) {
		
		int i = 20;
		Integer I = Integer.valueOf(i); //converting primitive data type to wrapper class
		String currency = I.toString()+"$";
		System.out.println("op is " +currency);
	}
}
