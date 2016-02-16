package com.prog.prac;

import static org.junit.Assert.*;

import org.junit.Test;

	public class TestFactorial {
		
		@Test
		public void TestPositiveNum(){
			
			assertEquals(120,Factorial.FactReccur(5));
		}

		@Test
		public void TestPositiveNum1(){
			
			assertEquals(1,Factorial.FactReccur(1));
		}
		
		@Test
		public void TestPositiveNum0(){
			
			assertEquals(1,Factorial.FactReccur(0));
		}
		
		@Test
		public void TestNegativeNum(){
			
			assertEquals(0,Factorial.FactReccur(-1));
		}


	}

