package com.prog.prac;

public class NullPtExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = null;
		try{
		System.out.println("converting to string again: " + s.toString());
		//expecting a null pointer exception
		}
		catch(NullPointerException e){
			System.out.println("Null pointer exception occured");
			e.printStackTrace();
		}
		
		System.out.println("an exception was caught");
		s = "hello";
		System.out.println(s.toString());
			
	}

}
