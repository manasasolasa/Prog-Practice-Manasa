package com.prog.prac;
import java.util.Scanner;

public class PingPong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		Scanner input= new Scanner(System.in);
//		
//		System.out.println("Please enter a number: ");
//
//		int num = input.nextInt();
		
//		System.out.println(PingPongMethod(num));
		
//		boolean i = false;
//		
//		if ((num % 3) == 0) {
//			System.out.print("Ping ");
//			i = true;
//		}
//		if ((num % 5) == 0) {
//			System.out.print("Pong");
//			i = true;
//		}
//		if (i == false)
//			System.out.print(num);
		

}
	public  String PingPongMethod(int num){
		boolean i = false;
		String str = "";
		
		if ((num % 3) == 0) {
			str = "Ping";
			i = true;
		}
		if ((num % 5) == 0) {
			str += "Pong";
			i = true;
		}
		if (i == false){
			str = Integer.toString(num);
		}
		
		return str;
		
	}
}
