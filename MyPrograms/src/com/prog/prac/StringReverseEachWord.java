package com.prog.prac;

//import java.util.Scanner;

public class StringReverseEachWord {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub


//		String original="";
//		
//		Scanner input = new Scanner(System.in);
//				
//		System.out.println("enter a string: ");
//		original = input.nextLine();		
	
//		ReverseEachWord(original);
//	}
	
	public static String ReverseEachWord(String original){
		
		int length;
		String reverse = "";
		String word = "";
		for (int i = 0; i < original.length(); i++) {
			word += original.charAt(i);

			if (original.charAt(i) == ' ') {
				length = word.length();
				for (int j = length - 1; j >= 0; j--) {
					reverse += word.charAt(j);
				}
				word = "";
			}
		}
		if ((word != "")) {
			length = word.length();
			reverse += " ";
			for (int j = length - 1; j >= 0; j--) {
				reverse += word.charAt(j);
			}

		}
//		System.out.println("the output string is "+reverse);
		return reverse;
	}

}
