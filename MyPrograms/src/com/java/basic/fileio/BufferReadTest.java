package com.java.basic.fileio;

import java.io.*;
import java.util.StringTokenizer;

public class BufferReadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			File tmpFile = new File("/Users/sundeepece/Manasa/workspace/javafiles/testfile.txt");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(tmpFile)));
			//BufferedReader br1 = new BufferedReader(new FileReader(tmpFile));
			
			String str = null;
			
			System.out.println("data read from input file:");
			
			while((str = br.readLine()) != null){
				
				System.out.println("your line is " +str);
			
				StringTokenizer tokenizer = new StringTokenizer(str, "");
				int count = 0;
				while(tokenizer.hasMoreTokens()){
					count++;
					System.out.println("tokens are: "+tokenizer.nextToken());
					
				}
				
				System.out.println(count);
			}
			br.close();
			
		}
		catch(IOException e)
		{
			System.out.println("error " +e.getMessage());
		}
	}

}
