package com.prog.prac;

import java.util.Scanner;

public class ArrayLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("How many elements in the array?");
		int n = input.nextInt();
		
		int a[] = new int[n];
		
		
		System.out.println("Please enter "+n+" array numbers: ");
		for(int i=0;i<n;i++){
			 a[i] = input.nextInt();
		}
		
		System.out.println("the largest number in the array is :"+large(a));
		
		input.close();
	}
	
	public static int large(int a[])
	{
		int largest = 0;
		try{
		
		largest = a[0];
		for(int i=1;i<a.length;i++){
			if (largest < a[i]){
				largest = a[i];
			}
		}
		}catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(NullPointerException e){
			e.printStackTrace();
		}
		return largest;
	}

}
