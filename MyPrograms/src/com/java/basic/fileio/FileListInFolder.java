package com.java.basic.fileio;

import java.io.File;

public class FileListInFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String folderPath = "/Users/sundeepece/Manasa/workspace/javafiles/";
		
		File folder = new File(folderPath);
		
		File[] listOfFiles = folder.listFiles();
		
		for(int i=0;i<listOfFiles.length;i++){
			if(listOfFiles[i].isFile()){
				System.out.println("File " +listOfFiles[i].getName());
				
			}else if(listOfFiles[i].isDirectory()){
				System.out.println("Directory " +listOfFiles[i].getName());
			}
			
		}
	}

}
