package com.prog.prac;

public class Bank {
	String name = "Bank";
	
	public Bank()
	 {
		System.out.println("bank constructor");
	}
	public int getRateOfInterest()
	{
		return 0;
	}
	public int getRateOfInterest(int locId){
		
		return 2;
	}
	public int getRateOfInterest(int locId, int offerId){
		
		return 1;
	}
	
	
}
