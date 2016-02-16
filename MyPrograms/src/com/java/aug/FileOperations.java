package com.java.aug;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class FileOperations {
	
	public static void main(String[] args){
		
//		String filePath = "/Users/sundeepece/Manasa/workspace/javafiles/samplefile.csv";
//		
//		int c = readDataFromCharacterFile(filePath);
//		System.out.println("******************EOF**********************");
//		System.out.println("the number of lines in the file are: "+c);
//		
//		
//		String opfilePath = "/Users/sundeepece/Manasa/workspace/javafiles/opfile.csv";
//		
//		int count = readAndCopyData(filePath,opfilePath,"ERROR");
//		System.out.println("************eof**********");
//		System.out.println("the number of lines the word ERROR is present in the file is: "+count);
//		
//		
//		String filePathBinary = "/Users/sundeepece/Manasa/workspace/javafiles/abc.png";
//		String opfilePathBinary = "/Users/sundeepece/Manasa/workspace/javafiles/abcoutput.png";		
//		
//		System.out.println("***********EOF**********");
//		System.out.println("the number of bytes copied in the file are :" +readAndWriteBinaryFile(filePathBinary, opfilePathBinary));
//	
//	
//		System.out.println("********FILE DEMO METHOD******");
//		fileDemo();
	
		
		createObjectStream("/Users/sundeepece/Manasa/workspace/javafiles/candidate.ser"); 
	
	
	}
	
	//This method uses character stream to read data from the file and returns the number of lines
	public static int readDataFromCharacterFile(String filePath){
		int count=0;
		BufferedReader buff = null;
		try {
			buff = new BufferedReader(new FileReader(filePath));
			String line = "";
			String word = "";
			//this loop will read all the lines in the file and counts no of lines until it reaches the end of the file
			while( (line = buff.readLine()) != null ){
				System.out.println(line);
				count++;
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			//closing the file if it is an the end
			if(buff != null){
				try {
					buff.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return count;
	}
	
	
	//this method will read a file and write the lines to another file which has a keyword 
	//also counts the number of lines the keyword is repeated
	public static int readAndCopyData(String filePath, String opfilePath, String key){
		int c = 0;
		
		BufferedReader buff = null;
		FileWriter fw = null;
		PrintWriter pw = null;
		
		try {
			buff = new BufferedReader(new FileReader(filePath));
			fw = new FileWriter(opfilePath);
			pw = new PrintWriter(fw);
			String line ="";
			
			while( (line = buff.readLine()) != null){
				if(line.contains(key)){
					c++;
					System.out.println(line);
					pw.write(line);
					pw.write("\n");
				}
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(buff != null && fw != null){
				try {
					buff.close();
					fw.close();
					pw.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		return c;
	}
	
	//Binary File
	//copy the contents of a binary file to another file
	public static long readAndWriteBinaryFile(String filePath, String ofilePath){
		long c=0;
		FileInputStream fin = null;
		FileOutputStream fout = null;
		int byTe = 0;
		try {
			fin = new FileInputStream(new File(filePath));
			fout = new FileOutputStream(new File(ofilePath));
			
			while( (byTe = fin.read()) != -1){
				
				fout.write(byTe);
				c++;
				
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		finally{
			try {
				if( fin != null && fout != null){
					fin.close();
					fout.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		}
		
		return c;
	}

	
	
	//this method demonistrates file operations
	//create a dir, print contents of dir, check the absolute file path,etc
	
	public static void fileDemo(){
		
		File myfile = new File("/Users/sundeepece/Manasa/workspace/javafiles/testfile.csv");
		
		if(myfile.exists()){
			System.out.println("the file is present");
		}else {
			System.out.println("the file is not present");
		}
		
		File mydir = new File("/Users/sundeepece/Manasa/workspace/javafiles");
		//mydir.mkdir();
		//reads the files in dir
		
		File[] allFiles = mydir.listFiles();
		for(File f: allFiles){
			System.out.println(f.getName());
			
		}
		
	}
	
	//THIS METHOD CREATES OBJECT OUTPUT STREAM for the Candidate object
	
	public static void createObjectStream(String filePath){
		
		Candidate C =  new Candidate(100, "Sam", "QA1");
		Candidate C1 =  new Candidate(101, "Manu", "QA1");
		
		
		ObjectOutputStream out = null;
		
		try {
			out = new ObjectOutputStream( new FileOutputStream(filePath));
			out.writeObject(C);
			out.writeObject(C1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if( out!=null ){
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream(filePath));
			
			Candidate c11 = null;
			c11 = (Candidate)in.readObject();
			System.out.println(c11.id);
			System.out.println(c11.name);
			System.out.println(c11.course1);
			System.out.println(c11.email);
			
			
			Candidate c12 = null;
			c12 = (Candidate)in.readObject();
			System.out.println(c12.id);
			System.out.println(c12.name);
			System.out.println(c12.course1);
			System.out.println(c12.email);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally{
			if( in != null){
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
		
	}
	
	
}
