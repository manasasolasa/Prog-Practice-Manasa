package com.prog.prac;


public class GenPrint1to10 {
	
	static int printnum(int i){
		
		if(i>10)
			return 0;
		else
		{
			System.out.print(i +" ");
			return printnum(++i);
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		printnum(1);

}
}