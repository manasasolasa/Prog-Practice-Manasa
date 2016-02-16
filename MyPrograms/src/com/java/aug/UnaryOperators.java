package com.java.aug;

public class UnaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int z=++x; //prefix x=x+1;z=(x=x+1);z=11,x=11
		
		int y = x++;//postfix y=x(and then x=x+1) y=11,x=12
		
		int z2=x;
		System.out.println("z= " +z+ " y= "+y+"z2= "+z2 );
		
	}

}
