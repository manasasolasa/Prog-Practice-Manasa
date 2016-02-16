package com.java.aug;
import java.util.Scanner;


public class CountVowelsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a word: ");
		
		String word = input.nextLine();
		
		word = word.toLowerCase();
		int count=0;
		for(int i=0;i<word.length();i++){
			char A= word.charAt(i);
			switch(A){
			case 'a': count++;
					break;
			case 'e': count++;
					break;
			case 'i': count++;
					break;
			case 'o': count++;
					break;
			case 'u': count++;
					break;
			}	
			
		}
		System.out.println("the number of vowels in the given word is: "+count );
		
	}

}
