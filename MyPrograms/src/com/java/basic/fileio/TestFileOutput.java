package com.java.basic.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "/Users/sundeepece/Manasa/workspace/javafiles/testfile.txt";
		try{
			FileWriter fw = new FileWriter(fileName,true);
			fw.write("this is done on 5th, 2015");
			fw.close();
		}
		catch(IOException e){
			System.out.println("error is " +e.getMessage());
		}
		
	}
 
}
