package com.prog.prac;
import java.util.Scanner;
public class TakesInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter some input: ");
		String s = input.nextLine();
		System.out.println("you have entered: "+s);
	}

}
