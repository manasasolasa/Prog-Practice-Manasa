package com.prog.prac;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class PrimeOrNotTest {

	PrimeOrNot pn;
	int input;
	boolean expected;
	
	public PrimeOrNotTest(int input, boolean expected){
		this.input = input;
		this.expected = expected;
	}
	
	@Before
	public void start(){
		pn = new PrimeOrNot();
	}
	
	@Parameterized.Parameters
	public static Collection getData(){
		Object[][] data = new Object[][]
				{{2, true},
				{6,false},
				{7,true},
				{8,false}};
		return Arrays.asList(data);		
	}
	@Test
	public void validatePrimeNumbers(){
		boolean actual = pn.checkPrime(input);
		assertEquals(expected,actual);
	}
}
