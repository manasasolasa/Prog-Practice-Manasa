package com.prog.prac;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringReverseEachWordTest {
	
	@Test
	public void TestString1(){
		String orig = "hello";
		String Rev = StringReverseEachWord.ReverseEachWord(orig);
		assertEquals(" olleh", Rev);
		
	}
	@Test	
	public void TestString2(){
		String orig = "hello there";
		String Rev = StringReverseEachWord.ReverseEachWord(orig);
		assertEquals("olleh ereht", Rev);
		
	}
	@Test	
	public void TestString3(){
		String orig = "hello there,";
		String Rev = StringReverseEachWord.ReverseEachWord(orig);
		assertEquals("olleh ,ereht", Rev);
		
	}
	
}
