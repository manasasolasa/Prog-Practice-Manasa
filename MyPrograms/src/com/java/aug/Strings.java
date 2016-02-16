package com.java.aug;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "hello all";
		String str1 = "hello all";
		String str2 = new String("hello all");
/*		if(str==str1){
			System.out.println("first strings are equal");
		}s
		if(str==str2){
			System.out.println("second strings are equal");
		}	
		*/
		
		
		//equals
		if(str.equals(str1)){
			System.out.println("strings are equal");
		}
		
		System.out.println(str.compareTo("heklo"));
	}

}
