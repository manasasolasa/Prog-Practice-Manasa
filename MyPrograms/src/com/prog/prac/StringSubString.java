package com.prog.prac;

import java.util.Scanner;

public class StringSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("please enter a string: ");
		String originalString = input.nextLine();
		
		System.out.println("please enter a substring of the above string: ");
		String replaceString = input.nextLine();
		
		System.out.println("please enter the string you want to replace the substring with: ");
		String newString = input.nextLine();
		
		boolean flag = false;
//		if(originalString.contains(replaceString)){
//
//			System.out.println("The new String is "+ originalString.replace(replaceString,newString));		
//		}
//		else{
//			
//			System.out.println("Substring is not present");
//		}
		
		char a[] = originalString.toCharArray();
		char b[] = replaceString.toCharArray();
		
		int i=0, j=0;
		
		while(i<a.length && j<b.length){
		
			if(a[i]==b[j]){
				i++;
				j++;
			}
			else{
				i++;
				j=0;
			}
			
			if(j==b.length){
				flag = true;
//				System.out.println("index is " +(i+1-j));
				System.out.println("the new string is: " +replaceMethod(originalString,replaceString,newString));
			}
			
			if(i==a.length && flag == false){
				System.out.println("the substring is not present");
			}
			
		}
		
	}
	
	//my code
//	public static String replaceMethod(String original, String Replace, String newString, int index) {
//	
//		String result="";
//		int len = index + Replace.length();
//		int newlen = (original.length()-Replace.length()+newString.length());
//		int j=0;
//		
//		for(int i=0;i<index;i++){
//			
//			result += original.charAt(i);
//			System.out.println("i is "+i+ "result is" +result);
//			
//			if(i == (index-1)){		
//				for(;j<newString.length();j++){
//					result += newString.charAt(j);
//				}
//				
//				if(j==newString.length()){
//
//						for(int k = len; k< original.length() ; k++){
//							result +=original.charAt(k);
//						}
//
//					}
//				}
//				
//			}	
//		return result;	
//	}
	//copied from net, not my code
	public static String replaceMethod(String original, String toReplace,
	        String replacedWith) {
	    for(;;) {
	        int i = original.indexOf(toReplace);
	        if (i == -1) {
	            break;
	        }
	        original = original.substring(0, i) + replacedWith + original.substring(i + toReplace.length());
	    }
	    return original;
	}

}
