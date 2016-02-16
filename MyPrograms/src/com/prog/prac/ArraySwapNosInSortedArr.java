package com.prog.prac;

//import java.util.Scanner;

public class ArraySwapNosInSortedArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Please enter the length of the array: ");
//		int n = input.nextInt();
//		
//		System.out.println("Please enter "+n+" array elements:");
		
		int a[] ;
			a = new  int[] {1,2,5,6,4};
//		for(int i=0;i<n;i++){
//			a[i] = input.nextInt();
//		}

			
		for(int i=0;i<a.length;i++){       
			for(int j=i+1;j<=a.length-1;j++){
				if(a[i]>a[j]){		
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					break;
				}
				
			}

		}
		
		
		System.out.println("the sorted array is :");
		for(int i=0;i<a.length;i++){
			System.out.print(" "+a[i]);
		}
		
	}

}
