package com.java.aug;

import java.util.Scanner;

public class CountWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
	
		System.out.println("Please enter some text: ");
		
		String line = input.nextLine();
		
		int count=1;
		for(int i=0;i<line.length();i++){
			char A = line.charAt(i);
			if(A == ' '){
				count++;
			} 
			
		}
		System.out.println("the number of words in the given text is: "+count);
		
	}

}
