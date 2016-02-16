package com.java.basic.fileio;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferStreamEx {

	static void writeFile()
	{
		FileOutputStream out = null;
		BufferedOutputStream bout = null;
		try {
			out = new FileOutputStream("/Users/sundeepece/Manasa/workspace/javafiles/coutput.txt");
			bout = new BufferedOutputStream(out);
			
			
			String s = "writing into the file1";
			bout.write(s.getBytes());
			System.out.println("write file success");
		
		} 
		catch (IOException e) {
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

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferStreamEx.writeFile();
	}

}
