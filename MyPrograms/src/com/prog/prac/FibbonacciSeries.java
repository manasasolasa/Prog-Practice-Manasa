package com.prog.prac;
import java.util.Scanner;


public class FibbonacciSeries {

	public  static void main(String[] args)  {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int n,x=0,y=1,temp=0;
		System.out.print("Please enter how many fibbonacci numbers do you want: ");
		
		n = input.nextInt();
//		
//		if(n<0){
//			System.out.println("please enter a positive number");
//		}
//		else{
//			System.out.println(fib(n));
//			int a[] = new int[n];
//
//			for (int i = 0; i < n; i++) {
//				a[i] = fib(i);
//			}
//
//			for (int i = 0; i < n; i++)
//				System.out.print(" " + a[i]);
//		}
	}
	
	public static int fib(int n) {
		
		if(n < 0){
			throw new IllegalArgumentException("negative number");
			
		}else{
			
		if(n == 0)
	        return 0;
		else if(n == 1)
			return 1;
		else
			return fib(n - 1) + fib(n - 2);
		}
	}
}
