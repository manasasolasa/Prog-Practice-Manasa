package com.java.aug;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int sum=0;
		for(int i=1;i<= 10;i++){	
			sum+=i;
		}
		
		System.out.println("sum of first 10 numbers is " +sum);
		*/
		/*
		int evensum=0;
		for (int i=0;i<=20;i++){
			if(i%2==0){
				evensum+=i;
			}
		}
		System.out.println("the sum of first 10 even numbers is "+evensum);
		*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("please enter a number:");
		
		int num = input.nextInt();
		int sum=0;
		for (int i=0;i<=num;i++){
			sum+=i;
		}
		System.out.println("the sum of first "+num+" numbers is "+sum);
	}

}
