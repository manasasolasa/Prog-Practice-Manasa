package com.java.basic.fileio;

import java.io.*;

public class CopyContentsofaFiletoAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String oldFilePath = "/Users/sundeepece/Manasa/workspace/javafiles/oldfile.txt";
		String newFilePath = "/Users/sundeepece/Manasa/workspace/javafiles/newfile.txt";
		try{
		BufferedReader brOld = new BufferedReader(new FileReader(oldFilePath));
		
		String content = "";
		String line = "";
		
		while((line = brOld.readLine())!= null){
			content += line +"\n";
			
		}
		brOld.close();
		
		BufferedWriter bwNew = new BufferedWriter( new FileWriter(newFilePath));
		
		bwNew.write(content);
		bwNew.close();
		
		System.out.println("coping success!!");
		
		}catch(FileNotFoundException e){
			System.out.println("file not found " +e.getMessage());
		}catch(IOException e){
			System.out.println("error: " +e.getMessage());
		}
	}

}
