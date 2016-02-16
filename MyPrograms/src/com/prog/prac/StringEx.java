package com.prog.prac;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "hello";
		String str1 = "hello";
		String str2 = new String("hello");
		
		if(str == str1)
			System.out.println("first strings are equal");
		if(str == str2)
			System.out.println("second strings are equal");
		
		if(str.equals(str2))
			System.out.println("strings are equal");
		
		System.out.println("char at 1 is "+str.charAt(1));
		System.out.println(str.compareTo("iello"));
		
		if(str.contains("e"))
			System.out.println("present");
			else
				System.out.println("not present");
		

		System.out.println("index is " + str.indexOf("o"));
		
		System.out.println(str.substring(0, 2));
		
		//stringBuffer and stringbuilder
		
		StringBuffer buff = new StringBuffer("jan");
		StringBuilder build = new StringBuilder("jan2");
		
		
	}

}
