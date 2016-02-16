package com.java.aug;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "hello";
		System.out.println("Memory of str is "+str.hashCode());
		
		String str1 = "hello";
		System.out.println("Memory of str1 is "+str1.hashCode());
		
		str = "hello world";
		System.out.println("Memory of str is "+str.hashCode());
		
		String str2 = new String("hello");
		System.out.println("Memory of str2 is "+str2.hashCode());
		
		String str3 = new String("hello");
		System.out.println("Memory of str3 is "+str3.hashCode());
		
		
	}

}
