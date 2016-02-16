package com.prog.prac.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.prog.prac.ArrayLinearSearch;

public class ArrayLinearSearchTest {

	ArrayLinearSearch als = new ArrayLinearSearch();
	
	@Test
	public void TesCase1(){
		int[] a = {1,2,3,4,5,6};
		int snum = 4;
		boolean actual = als.ArrSearch(a,snum);
		Assert.assertEquals(actual, true);
	}
	@Test
	public void TesCase2(){
		int[] a = {1,2,3,4,5,6};
		int snum = 9;
		boolean actual = als.ArrSearch(a,snum);
		Assert.assertEquals(actual, false);
	}
	@Test
	public void TesCase3(){
		int[] a = {-1,-2,-3,-4,-5,-6};
		int snum = -4;
		boolean actual = als.ArrSearch(a,snum);
		Assert.assertEquals(actual, true);
	}
	@Test
	public void TesCase4(){
		int[] a = {-1,-2,-3,-4,-5,-6};
		int snum = 4;
		boolean actual = als.ArrSearch(a,snum);
		Assert.assertEquals(actual, false);
	}
	
}
