package com.prog.prac;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringPalindromeTest {

	@Test
	public void TestMethod1(){
		String orig = "madam";
		boolean rev = StringPalindrome.Palindrome(orig);
		assertEquals(true,rev);
	}
	@Test
	public void TestMethod2(){
		String orig = "abc";
		boolean rev = StringPalindrome.Palindrome(orig);
		assertEquals(false,rev);
	}
}
