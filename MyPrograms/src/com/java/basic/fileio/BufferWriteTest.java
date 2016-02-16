package com.java.basic.fileio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferWriteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			File tmpFile = new File("/Users/sundeepece/Manasa/workspace/javafiles/testop.txt");
			
			BufferedWriter bw1 = new BufferedWriter(new FileWriter(tmpFile.getPath()));
			
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream(tmpFile.getPath(),true)));
			bw.write("this is using buffered writer");
			bw.close();
		}
		catch(IOException e){
			System.out.println("exception" +e.getMessage());
		}
	}

}
