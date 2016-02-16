package com.prog.prac;

import java.util.Scanner;

public class StringReverse {

//	public static void main(String[] args) {
//				// TODO Auto-generated method stub
//
//		String original, reverse = "";
//		
//		Scanner input = new Scanner(System.in);
//				
//		System.out.println("enter a string: ");
//		original = input.nextLine();
	
	
		public static String Rev(String original){	
		String reverse = "";
		int length = original.length();
				
		for(int i=length-1;i>=0;i--)
		{
			reverse+=original.charAt(i);
					
		}
//		System.out.println("the reverse string is "+reverse);
		return reverse;		
	}
}
