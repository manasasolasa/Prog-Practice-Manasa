package com.java.basic.fileio;

import java.io.*;
import java.util.StringTokenizer;
//import com.prog.prac.StringSubString;
public class FilesOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		StringSubString ss = new StringSubString();
		
		String fileName = "/Users/sundeepece/Manasa/workspace/javafiles/testfile.txt";
		FileReader fReader;
		//FileWriter fWriter;
		try{
			
		//BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
		fReader = new FileReader(fileName);
		
		BufferedReader br = new BufferedReader(fReader);
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName,true));
		
		String cursor;
		String content = "";
		int lines = 0;
		int count = 0;
		int chars = 0;
		String searchword ="good";
		int searchOccurance = 0;
		String replaceword = "manasa";
		
		while((cursor = br.readLine()) != null){
			lines++;
			content += cursor +"\n";
			
//			String[] words = cursor.split(" ");
//			for(String w : words){
//				count++;
//				
//			}
			StringTokenizer tokenizer = new StringTokenizer(cursor," ");
//			StringTokenizer token = new StringTokenizer(cursor,searchword);
			
			
			while(tokenizer.hasMoreTokens()){
				count++;
				String words = tokenizer.nextToken();
				
				if(words.equalsIgnoreCase(searchword)){
					searchOccurance++;
					
				}
			}
			
//			for(int i=0;i<words.length;i++){
//				count++;
//				
//				if(words[i].equalsIgnoreCase(searchword)){
//					searchOccurance++;
//				}
//				
//			}
			
			chars = content.length();
		}
		System.out.println("File" +fileName+ " has");
		System.out.println(chars + " characters");
		System.out.println(count + " words");
		System.out.println(lines + " lines.");
		System.out.println(searchOccurance + " searchOccurance");
		System.out.println("the file content is :"+content);
//		br.close();

		
		}
		catch(FileNotFoundException e){
			System.out.println("file is not found");
		}
		catch(IOException e){
			System.out.println("error occured" +e.getMessage());
		}
		
		
	}

}
