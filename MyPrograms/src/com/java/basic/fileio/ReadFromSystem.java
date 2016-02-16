package com.java.basic.fileio;

import java.io.IOException;

public class ReadFromSystem {
//reading input from console
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter a name: ");
		byte[] b = new byte[100];
		
		try{
			
			System.in.read();
		
			String str = new String(b); //type casting byte variable to string variable
			System.out.println("the value entered is "+str);
		}
		catch(IOException e){
			System.out.println("exception occured");
		}
	}

}
