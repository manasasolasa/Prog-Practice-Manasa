package com.prog.prac.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.prog.prac.ArrayLargestNum;

public class ArrayLargestNumTest {

	ArrayLargestNum arr = new ArrayLargestNum();
	
	@Test
	public void TesCase1(){
		int[] a ={1,2,3,4,5,6};
		int actual = arr.large(a);
		Assert.assertEquals(6,actual);
	}
	@Test
	public void TesCase2(){
		int[] a ={6,5,4,3,2,1};
		int actual = arr.large(a);
		Assert.assertEquals(6,actual);
	}
	@Test
	public void TesCase3(){
		int[] a ={2,1,3,6,5,4};
		int actual = arr.large(a);
		Assert.assertEquals(6,actual);
	}
	@Test
	public void TesCase4(){
		int[] a ={6,6,6,6,6};
		int actual = arr.large(a);
		Assert.assertEquals(6,actual);
	}
	@Test
	public void TesCase5(){
		int[] a ={1,2,6,4,5,6};
		int actual = arr.large(a);
		Assert.assertEquals(6,actual);
	}
	@Test
	public void TesCase6(){
		int[] a ={-1,-2,-3,-4,-5,-6};
		int actual = arr.large(a);
		Assert.assertEquals(-1,actual);
	}
	@Test
	public void TesCase7(){
		int[] a ={1,-2,-3,4,-5,6};
		int actual = arr.large(a);
		Assert.assertEquals(6,actual);
	}
	@Test
	public void TesCase8(){
		int[] a ={-1,-2,-3,0};
		int actual = arr.large(a);
		Assert.assertEquals(0,actual);
		
	}
	@Test
	public void TesCase9(){
		int[] a ={};
		int actual = 0;
		Assert.assertEquals(0,actual);
		
	}
	@Test
	public void TesCase10(){
		int[] a =null;
		int actual = 0;
		Assert.assertEquals(0,actual);
		
	}
}
