package com.java.aug;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original, reverse = "";
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter a string: ");
		original = input.nextLine();
		
		int length = original.length();
		
		for(int i=length-1;i>=0;i--){
			reverse+=original.charAt(i);
			
		}
		System.out.println("the reverse string is "+reverse);
		
	}

}
