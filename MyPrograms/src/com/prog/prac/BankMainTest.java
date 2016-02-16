package com.prog.prac;


import static org.junit.Assert.*;

import org.junit.Test;


public class BankMainTest {
	
	@Test
	public void TestCase1(){
		Bank b1 = new Bank();
		int interest = b1.getRateOfInterest(1);
		assertEquals(2, interest);
	
	}

	@Test
	public void TestCase2(){
		Bank b1 = new Bank();
		int interest = b1.getRateOfInterest();
		assertEquals(0, interest);
	
	}
	@Test
	public void TestCase3(){
		Bank b1 = new Bank();
		int interest = b1.getRateOfInterest(1,1);
		assertEquals(1, interest);
	
	}
	@Test
	public void TestCase4(){
		Bank b1 = new Bank();
		int interest = b1.getRateOfInterest(2);
		assertEquals(2, interest);
	
	}
	
}
