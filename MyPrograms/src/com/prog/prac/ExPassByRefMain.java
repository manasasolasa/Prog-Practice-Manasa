package com.prog.prac;

public class ExPassByRefMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ExPassByRef ex = new ExPassByRef(3,4);
//		ex.a = 5;
//		ex.b = 8;
		ex.print();
		ex.swap();
	//	ex.swap();
		ex.print();
	}
//	public static void swap(int a, int b){
//		int temp;
//		temp = b;
//		b = a;
//		a = temp;
//	}

}
