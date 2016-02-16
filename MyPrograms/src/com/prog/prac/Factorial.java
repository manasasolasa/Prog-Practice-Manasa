package com.prog.prac;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an integer number: ");
		int num = input.nextInt();
		
		//fact(num);//normal method

		long fa = FactReccur(num);
		
		if(num<0)
			System.out.println("please enter a valid number");
		else
			System.out.println(fa);
		
	}
			
//	public static void fact(int n){
//		int factn = 1;
//		for(int i=1;i<=n;i++){
//			factn*=i;
//		}
//		System.out.println("the factorial of "+n+ " is: "+factn );
//		
//	}
	
	public static long FactReccur(int n){
	
		if(n<0){
			throw new IllegalArgumentException("negative number");
		}
		if(n == 1){
			return 1;
		}	
		else if(n == 0){
			return 1;
		}
		else{
			return n * FactReccur(n-1); 
		}
		
		
	}
}
