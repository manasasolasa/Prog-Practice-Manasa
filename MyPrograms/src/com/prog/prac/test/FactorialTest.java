package com.prog.prac.test;

import org.testng.Assert;
import org.testng.annotations.*;

import com.prog.prac.Factorial;

public class FactorialTest {

	Factorial f = new Factorial();
	//Factorial f1;
	
	//f1 = f;
	
	@Test(dataProvider = "FactData")
	public void TestCase1(int n, int expected){
		long actual = f.FactReccur(n);
		Assert.assertEquals(actual, expected);
		
	}
	
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void TestCase2(){
		long actual = f.FactReccur(-4);
	}
	
	
	@DataProvider(name = "FactData")
	public Object[][] getData(){
		return new Object[][]{
				{5,120},
				{1,1},
				{0,1},
				{10,3628800},
				{11,39916800},
				//{15,1307674368000}
		};
	}
}
