package com.java.aug;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original, reverse = "";
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter a String: ");
		original = input.nextLine();
		
		int length= original.length();
		for(int i=length-1;i>=0;i--){
			reverse+=original.charAt(i);
			
		}
		if(original.equalsIgnoreCase(reverse))
			System.out.println("entered string is a palindrome");
		else
			System.out.println("entered string is not a palindrome");
	}

}
