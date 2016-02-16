package com.prog.prac;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringVerifyParanthesisTest {

	@Test
	public void TestCase1(){
		String text = "(())";
		assertEquals(true,StringVerifyParanthesis.Par(text));
		
	}
	@Test
	public void TestCase2(){
		String text = "))((";
		assertEquals(false,StringVerifyParanthesis.Par(text));
		
	}
	@Test
	public void TestCase3(){
		String text = "(()))";
		assertEquals(false,StringVerifyParanthesis.Par(text));
		
	}
	@Test
	public void TestCase4(){
		String text = "((())";
		assertEquals(false,StringVerifyParanthesis.Par(text));
		
	}
	@Test
	public void TestCase5(){
		String text = "()()";
		assertEquals(true,StringVerifyParanthesis.Par(text));
		
	}


}
