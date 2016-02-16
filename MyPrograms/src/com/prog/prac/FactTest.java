package com.prog.prac;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FactTest {

	Factorial f;
	long exp;
	int input;
	
	public FactTest(int input,long exp){
		this.exp = exp;
		this.input = input;
	}
	
	@Before
	public void start(){
		f = new Factorial();
	}
	
	@Parameterized.Parameters
	public static Collection getData(){
		Object[][] data = new Object[][] {
				{2,2},
				{3,6},
				{4,24},
				{5,120}};
		return Arrays.asList(data);
	}
	@Test
	public void validateFact(){
		long actual = f.FactReccur(input);
		assertEquals(exp,actual);
	}
	
}
