package com.prog.prac;
import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer number: ");
		int num = input.nextInt();
		
		
		if(checkPrime(num)){
			System.out.println("the number "+num+" is a prime number" +checkPrime(num));
			
		}
		else{
			System.out.println("the number "+num+" is not a prime number" +checkPrime(num));

		}
	}

	public static boolean checkPrime(int n){
		
		boolean flag = true;
		if(n <= 0){
			flag = false;
			}
		else
		if(n == 1){
			flag = true;
		}
		else{	
		for(int i=2;i<=(n/2);i++)
		{
			if((n%i) == 0) {
				flag = false;
				break;
			}
		}
		}
		return flag;
	}
}
