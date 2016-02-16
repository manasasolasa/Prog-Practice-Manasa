package com.java.basic.fileio;

import java.io.*;

public class FileInputStreamEx {

	static void readFile(File path)
	{
		FileInputStream in;
		
		try {
			in = new FileInputStream(path);
			int i;
			while((i=in.read())!= -1){
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	static void readFileReader(File path)
	{
		FileReader in;
		
		try {
			in = new FileReader(path);
			int i;
			while((i=in.read())!= -1){
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

	static void writeFile()
	{
		FileOutputStream out = null;
		BufferedOutputStream bout = null;
		try {
			out = new FileOutputStream("/Users/sundeepece/Manasa/workspace/javafiles/boutput.txt");
			bout = new BufferedOutputStream(out);
			
			String s = "writing into the file";
			out.write(s.getBytes());
			System.out.println("write file success");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				bout.close();
				bout.flush();
				out.close();
				out.flush();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	static void writeFileWriter()
	{
		FileWriter out = null;
		BufferedWriter bout = null;
		try {
			out = new FileWriter("/Users/sundeepece/Manasa/workspace/javafiles/boutput.txt");
			bout = new BufferedWriter(out);
			
			String s = "writing into the file";
			
			out.write(s);//need not have to convert to bytes bcoz its character based
			System.out.println("write file success");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				bout.close();
//				bout.flush();
				out.close();
//				out.flush();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

		public static void writeToMultipleFiles()
		{
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			
			FileOutputStream out1 = null;
			FileOutputStream out2 = null;
			
			try {
				out1 = new FileOutputStream("/Users/sundeepece/Manasa/workspace/javafiles/out1.txt");
				out2 = new FileOutputStream("/Users/sundeepece/Manasa/workspace/javafiles/out2.txt");
				
				out.write(1000);
				out.writeTo(out1);
				out.writeTo(out2);
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				try {
					out.close();
					out.flush();

					out1.close();
					out1.flush();

					out2.close();
					out2.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
		
		//read from two files and write the data to one file
		
		static void copyData()
		{
			FileOutputStream out1 = null;
			FileInputStream in1 = null;
			FileInputStream in2 = null;
			SequenceInputStream sis = null;
			
			try {
				in1 = new FileInputStream("/Users/sundeepece/Manasa/workspace/javafiles/input1.txt");
				in2 = new FileInputStream("/Users/sundeepece/Manasa/workspace/javafiles/input2.txt");
				sis = new SequenceInputStream(in1, in2);
				out1 = new FileOutputStream("/Users/sundeepece/Manasa/workspace/javafiles/out1.txt");
				
				int i;
				while((i=sis.read())!= -1)
				{
					out1.write(i);
				}	
				
				System.out.println("success");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				try {
					in1.close();
					out1.close();
					out1.flush();
					
					in2.close();
					sis.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String path = "/Users/sundeepece/Manasa/workspace/javafiles/input1.txt";
		File file = new File("/Users/sundeepece/Manasa/workspace/javafiles/input1.txt");
//		
//		if(file.exists())
//			FileInputStreamEx.readFile(file);
//		else
//			System.out.println("file is not present");
//		
//		FileInputStreamEx.writeFile();
//		FileInputStreamEx.writeToMultipleFiles();
//		FileInputStreamEx.copyData();
//		FileInputStreamEx.readFileReader(file);
		FileInputStreamEx.writeFileWriter();

	}

}
