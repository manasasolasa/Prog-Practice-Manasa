package com.java.aug;

public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int i=0;
		while(i<10){
			
			System.out.println("the value of i is "+i);
			i++;
			
		}
		System.out.println("out of while loop");
		*/
		int evensum=0, i=0;
		while(i<=20){
			if(i%2==0){
				evensum+=i;
			}
			i++;
		}
		System.out.println("evensum is "+evensum);
	}

}
