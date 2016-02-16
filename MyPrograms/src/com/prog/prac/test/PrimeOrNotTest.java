package com.prog.prac.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.prog.prac.PrimeOrNot;

public class PrimeOrNotTest {

	PrimeOrNot prime = new PrimeOrNot();
	
	@Test(dataProvider = "PrimeData")
	public void TestCase1( int num, boolean expected){
		Assert.assertEquals(prime.checkPrime(num), expected);
	}
	
	@DataProvider(name = "PrimeData")
	public Object[][] getData(){
		return new Object[][]{
				{1,true},
				{7,true},
				{11,true},
				{4,false},
				{6,false},
				{-4,false},
				{-11,false},
				{0,false}
				
		};
	}
}
