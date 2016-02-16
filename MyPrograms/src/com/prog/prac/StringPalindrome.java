package com.prog.prac;

public class StringPalindrome {

	public static boolean Palindrome(String word){
		
		boolean flag = false;
		
		if(StringReverse.Rev(word).equals(word)){
			System.out.println("the given string is a palindrome");
			flag = true;
		}
		else{
			System.out.println("the given string is not a palindrome");
		}
		return flag;
	}
}
