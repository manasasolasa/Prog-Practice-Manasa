package com.java.aug;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*int i=0;
		do{
			
			System.out.println("i = "+i);
			i++;
		}while(i<10);
		
		System.out.println("program ends");
		*/
		
		int evensum=0, i=0;
		do{
			if(i%2==0){
				evensum+=i;
			}
			i++;
		}while(i<=20);
		
		System.out.println("evensum is "+evensum);
	}

}
