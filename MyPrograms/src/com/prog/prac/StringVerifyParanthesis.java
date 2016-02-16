package com.prog.prac;

//import java.util.Scanner;

public class StringVerifyParanthesis {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//			String original="";
//			
//			Scanner input = new Scanner(System.in);
//					
//			System.out.println("enter a string: ");
//			original = input.nextLine();		
	
		public static boolean Par(String original){
			
		
			int countleft=0, countright=0;
			char c;
			boolean flag = false;
			for (int i = 0; i < original.length(); i++) {
				c = original.charAt(i);
				if(c == '('){
					countleft++;
					
				}
				else if(c == ')'){
					if(countleft !=0){
						countright++;
					}
				} 
				
			}
			if(countleft == countright){
				System.out.println("paranthesis balanced");
				flag = true; 
			}
			else{
				System.out.println("paranthesis not balanced");
			}
		return flag;
		}
}