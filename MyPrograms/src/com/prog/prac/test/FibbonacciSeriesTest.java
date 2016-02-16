package com.prog.prac.test;

import org.testng.Assert;
import org.testng.annotations.*;

import com.prog.prac.FibbonacciSeries;

public class FibbonacciSeriesTest {
	
	FibbonacciSeries fb = new FibbonacciSeries();
	
	@BeforeClass
	public void init(){
		System.out.println("*******Fibbonacci Test********");
	}
	
	@AfterClass
	public void AClass(){
		System.out.println("*******Fibbonacci Test Done********");
	}
	
	@Test(dataProvider = "FibData")
	public  void TestCase1(int n, int expected) {
	//testing for n = 0
	//	int n = 0;
		int actual = fb.fib(n);
		Assert.assertEquals(actual,expected);
	}


	@Test(expectedExceptions = IllegalArgumentException.class)
	public  void TestCase2() {
	//testing for n = 1
		int n = -1;
		int actual = fb.fib(n);
		//Assert.assertEquals(actual,"negative number");
	}
	
	@DataProvider(name = "FibData")
	public Object[][] getData(){
		
		return new Object[][]{
				
				{1,1},
				{2,1},
				{8,21},
				{5,5},
		};
	}
	
	
	
}
