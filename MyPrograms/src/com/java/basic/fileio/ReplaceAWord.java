package com.java.basic.fileio;


import java.io.*;
import java.util.StringTokenizer;

public class ReplaceAWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String file = "/Users/sundeepece/Manasa/workspace/javafiles/replaceaword.txt";
		try{
			BufferedReader reader = new BufferedReader(new FileReader(file));

			String line;
			String oldtext = "";
			String searchword = "good";
			String replaceword = "very good";
			while((line = reader.readLine()) != null){
				oldtext += line + "\n";
			}
			reader.close();
			String replacedtext = oldtext;			
			replacedtext = replacedtext.replaceAll(searchword, replaceword);
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
						
			writer.write(replacedtext);
			writer.close();
			
			System.out.println("the file " +file+ " has the text");
			System.out.println(oldtext);
			System.out.println("is now changed to the text:");
			System.out.println(replacedtext);
			
			
			
		}catch(FileNotFoundException e){
			System.out.println("file is not present");
		}catch(IOException e){
			System.out.println("error" +e.getMessage());
		}
		
	}

}
