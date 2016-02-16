package com.prog.prac.test;

import org.testng.Assert;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.prog.prac.ArraysCommonNo;

public class ArraysCommonNoTest {

	ArraysCommonNo acn = new ArraysCommonNo();
	
	@Test
	public void TestCase1(){
		int a1[] = {1,2,3,4,5,6};
		int a2[] = {9,8,7,6};
		int actual[] = acn.CommonNo(a1, a2);
		int expected[] = {6};
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void TestCase2(){
		int a1[] = {1,2,3,4,5,6};
		int a2[] = {9,8,7,6,3};
		int actual[] = acn.CommonNo(a1, a2);
		int expected[] = {3,6};
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void TestCase3(){
		int a1[] = {1,2,3,4,5,6};
		int a2[] = {1,2,3,4,5,6};
		int actual[] = acn.CommonNo(a1, a2);
		int expected[] = {1,2,3,4,5,6};
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void TestCase4(){
		int a1[] = {1,2,3,4,5,6};
		int a2[] = {9,8,7};
		int actual[] = acn.CommonNo(a1, a2);
		int expected[] = {};
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void TestCase5(){
		int a1[] = {1,2,3,4,5,9,8,7,6};
		int a2[] = {9,8,7,6};
		int actual[] = acn.CommonNo(a1, a2);
		int expected[] = {9,8,7,6};
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void TestCase6(){
		int a1[] = {1,2,3,4,5,6};
		int a2[] = {1,2,3,4,5,9,8,7,6};
		int actual[] = acn.CommonNo(a1, a2);
		int expected[] = {1,2,3,4,5,6};
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void TestCase7(){
		int a1[] = {1,2,3,4,5};
		int a2[] = {3,9,8,3,7,6};
		int actual[] = acn.CommonNo(a1, a2);
		int expected[] = {3,3};
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void TestCase8(){
		int a1[] = {1,2,3,4,5,3,6};
		int a2[] = {3,9,8,7,6};
		int actual[] = acn.CommonNo(a1, a2);
		int expected[] = {3,3,6};
		Assert.assertEquals(actual, expected);
	}
	
	
}
