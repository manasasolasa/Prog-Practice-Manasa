package com.prog.prac;

import java.util.Arrays;
import java.util.Scanner;
public class ArraysCommonNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("How many elements in the first array?");
		int n1 = input.nextInt();
		int a1[] = new int[n1];
		
		System.out.println("Please enter "+n1+" numbers for first array: ");
		for(int i=0;i<n1;i++){
			 a1[i] = input.nextInt();
		}

		System.out.println("How many elements in the second array?");
		int n2 = input.nextInt();
		int a2[] = new int[n2];
		
		System.out.println("Please enter "+n2+" numbers for second array: ");
		for(int i=0;i<n2;i++){
			 a2[i] = input.nextInt();
		}
		
		int cArr[];
		cArr = CommonNo(a1,a2);
		
		if(cArr.length == 0){
			System.out.println("there are no common numbers");
			}
		else
		{
			System.out.println("common numbers are: ");
			for (int a:cArr){
		        System.out.print(a + ", ");
		    }
		    System.out.println();
		}
		
	}
	
	public static int[] CommonNo(int a1[], int a2[]){
		
		int[] temp = new  int[Math.min(a1.length,a2.length)] ;
		int tcount=0;
		for(int i=0;i<a1.length;i++){
		
			for(int j=0;j<a2.length;j++){
				if(a1[i]==a2[j]){
					temp[tcount] = a1[i];
					tcount++;
				}
			}
		}
		return Arrays.copyOf(temp,tcount);
	}
}
