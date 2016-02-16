package com.java.basic.fileio;

import java.util.Scanner;

public class ReadFromScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter a name: ");
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		System.out.println("name is "+str);
		
	}

}
