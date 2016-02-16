package com.java.basic.fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class createNewFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			File tmpFile = new File("/Users/sundeepece/Manasa/workspace/javafiles/newfile.txt");
			tmpFile.createNewFile();//creates a new file. if the file already exists, old file is used
			FileWriter fw = new FileWriter(tmpFile.getPath(), false);//false is to overwride the text in the file and true is to append
			fw.write("this is a test outputabc");
			fw.close();
		}
		catch(IOException e){
			System.out.println("exception");
		}
	}

}
