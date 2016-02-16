package com.prog.prac.test;

import org.testng.Assert;
import org.testng.annotations.*;

import com.prog.prac.NumberSwap;

public class NumberSwapTest {

	NumberSwap ns = new NumberSwap();
	
	
	@Test(dataProvider = "subdata")
	public void TestCase1(int x, int y){
		
		ns.a = x;
		ns.b = y;
		ns.swap1();
		Assert.assertEquals(x, ns.b);
		Assert.assertEquals(y, ns.a);
		
	}
	@Test(dataProvider = "subdata")
	public void TestCase2(int x, int y){
		
		ns.a = x;
		ns.b = y;
		ns.swap2();
		Assert.assertEquals(x, ns.b);
		Assert.assertEquals(y, ns.a);
		
	}
	
	@DataProvider(name = "subdata")
	public Object[][] getData(){
		return new Object[][]{
				{3,4},
				{5,5},
				{0,6},
				{4,0},
				{0,0},
				{-1,-4},
				{-2,9},
				{4,-5}
		};
	}
	
}
