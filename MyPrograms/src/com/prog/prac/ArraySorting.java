package com.prog.prac;

import java.util.Scanner;

public class ArraySorting {

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

		for(int i=0;i<n;i++){       
			for(int j=i+1;j<=n-1;j++){
				if(a[i]>a[j]){		
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				
			}
//			for(int k=0;k<n;k++){
//				System.out.print(" "+a[k]);
//			}
//			System.out.println();
		}
		
		
		System.out.println("the sorted array is :");
		for(int i=0;i<n;i++){
			System.out.print(" "+a[i]);
		}
		
	}

}
