package com.java.aug;

public class MethodOverRidingMainClass {

	public static void main(String[] args){
		
		MethodOverRidingSuperClass sc = new MethodOverRidingSuperClass();
		sc.print();
		
		MethodOverRiddingSubClass sc1 = new MethodOverRiddingSubClass();
		sc1.print();
//		sc1.print1();
	}
}
