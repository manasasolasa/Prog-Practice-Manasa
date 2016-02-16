package com.prog.prac;

import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		
		int num = input.nextInt();

		if(Armstrong(num)){
			System.out.println("the given number is an armstrong number");
			
		}
		else {
			System.out.println("the given number is not an armstrong number");
		}
		input.close();
		
	}

	
	public static int power(int n, int d){
		int value=1;
		for(int i=0;i<d;i++){
			value*=n;
		}	
		return value;
	}
	public static boolean Armstrong(int num){
		//boolean flag = false;
		int sum = 0;
		try
		{	
		int temp, digits=0;
		temp = num;
		
		while(temp!=0){
			digits++;
			temp/=10;
		}
	//	System.out.println("the number of digits in "+num+ " is: "+digits );
		
		temp = num;
		int remainder;
		while(temp!=0){
			remainder = temp%10;
			sum+=power(remainder, digits);
			temp=temp/10;
			
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		if(sum == num)
			return true;
		else
			return false;
	}
}
