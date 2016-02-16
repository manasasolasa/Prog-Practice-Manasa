package com.prog.prac.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.prog.prac.ArmstrongNumber;

public class ArmstrongNumberTest {

	ArmstrongNumber an = new ArmstrongNumber();
	
	@Test(dataProvider = "ArmstrongData")
	public void TestCase1(int num, boolean expected){
		boolean actual = an.Armstrong(num);
		Assert.assertEquals(actual, expected);
	}
	
	@DataProvider(name = "ArmstrongData")
	public Object[][] getData(){
		return new Object[][]{
				{153,true},
				{370,true},
				{371,true},
				{407,true},
				{10,false},
				{1000,false}
		};
	}
}
