package com.prog.prac;

import java.util.Scanner;
public class StringNumAfterEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner (System.in);
		
		System.out.println("please enter a string: ");
		String line = input.nextLine();
		String newString = "";
//		char arr[] = s.toCharArray();
		int count = 0;
		
		for(int i=0;i<line.length();i++){
			char A = line.charAt(i);
				
			if(A == ' ' || A=='\n'){
				count++;
				newString+=count;
				newString+=" ";
			} 
			else{
				newString+=line.charAt(i);
			}		
		}
		count++;
		newString+=count;
		
		System.out.println("the output is: "+newString);
	}

}
