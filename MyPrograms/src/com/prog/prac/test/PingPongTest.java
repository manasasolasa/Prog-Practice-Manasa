package com.prog.prac.test;


import  org.testng.Assert;
import org.testng.annotations.*;


import com.prog.prac.PingPong;

public class PingPongTest {
	
	PingPong pp = new PingPong();

	@BeforeClass
	public void init(){
		System.out.println("****PingPongTest****");
	}
	
	@AfterClass
	public void Done(){
		System.out.println("****PingPongTestDone****");
	}
	
	@Test(dataProvider = "data")
	public void TestCase1(int num, String expected){
		
		Assert.assertEquals(pp.PingPongMethod(num),expected);
	}
	
		
	@DataProvider(name = "data")
	public Object[][] getData(){
		return new Object[][]{
				{10,"Pong"},
				{6,"Ping"},
				{15,"PingPong"},
				{-9,"Ping"},
				{-20,"Pong"},
				{-30,"PingPong"},
				{0,"PingPong"}
				
		};
	}
}
