package com.prog.prac;

import java.util.Scanner;
public class ArrayLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the length of the array: ");
		int n = input.nextInt();
		
		System.out.println("Please enter "+n+" array elements:");
		
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = input.nextInt();
		}
		
		System.out.print("Please enter a number you want to find in the array: ");
		int find = input.nextInt();
		
		boolean flag = ArrSearch(a,find);
		
		if(flag){
			System.out.println("the number "+find+" is in the array ");
		}
			else{
			System.out.println("the number "+find+" is not present in the array");
		}
		
	}

	
	public static boolean ArrSearch(int[] a, int find){
		//int index =0; 
		boolean flag = false;
		for(int i=0;i<a.length;i++){
			if(find == a[i]){
				flag = true;
			//	index = i;
				break;
			}
			else
				flag = false;		
		}
		return flag;
	}
}
