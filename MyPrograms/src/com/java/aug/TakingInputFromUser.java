package com.java.aug;

import java.util.Scanner;

public class TakingInputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		//taking input as string
		System.out.println("enter a text: ");
		
		String text = input.nextLine();
		System.out.println("you have entered a text: " +text);
		
		//taking input as integer
		System.out.println("enter an integer: ");
		
		int num = input.nextInt();
		System.out.println("you have entered an integer: "+num);
		
		//taking input as a double
		System.out.println("enter a decimal value: ");
		double decimal=input.nextDouble();
		System.out.println("the decimal value you have entered is: "+decimal);
	}

}
