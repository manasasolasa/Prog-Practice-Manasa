package com.prog.prac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class UtilEx {
	
	//read properties
	static void readProp()
	{
		FileInputStream  input = null;
		try{
			input = new FileInputStream("/Users/sundeepece/Manasa/workspace/javafiles/MyProps.properties");
			Properties prop = new Properties();
			
			prop.load(input);
			String property = prop.getProperty("username");
			System.out.println("the property value is: "+property);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	static void readDate()
	{
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
		Date d = new Date();
		System.out.println("current date is " +format.format(d));
		
	//	Calendar cal = new Calendar();
		
	}
		static void readRandom(){
			Random random = new Random();
			int r = random.nextInt(3);
			
			if(r==0)
				System.out.println("rock");
			else
				if(r==1)
					System.out.println("paper");
				else
					if(r==2)
						System.out.println("scissor");
			
		}
		
		static void readResource()
		{
			
			ResourceBundle bundle = ResourceBundle.getBundle("resource/MyResource", Locale.getDefault());
			System.out.println(bundle.getString("first_name") + "is Bharti");
			bundle = ResourceBundle.getBundle("resource/MyResource", Locale.ITALIAN);
			System.out.println(bundle.getString("first_name") + "is Bharti");
	
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		UtilEx.readProp();
//		UtilEx.readDate();
//		UtilEx.readRandom();
		UtilEx.readResource();
	}

}
