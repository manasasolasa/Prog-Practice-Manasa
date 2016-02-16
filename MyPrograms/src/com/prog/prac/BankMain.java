package com.prog.prac;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b1 = new Bank();
		
		System.out.println("rate of interest is " +b1.getRateOfInterest(1));
		
		Bank b2 = new BankChase();
		
		System.out.println("rate of interest is " +b2.getRateOfInterest());
		
		Bank b3 = new BankCiti();
		
		System.out.println("rate of interest is " +b3.getRateOfInterest());
		
		
	}

}
