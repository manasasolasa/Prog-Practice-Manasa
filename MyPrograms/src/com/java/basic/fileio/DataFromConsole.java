package com.java.basic.fileio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DataFromConsole {

	static void readFromConsole()
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		
//		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("please enter a name");
		try {
			String name = br.readLine();
			System.out.println("my name is "+ name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataFromConsole.readFromConsole();
	}

}
