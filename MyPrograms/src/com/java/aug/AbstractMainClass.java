package com.java.aug;

public class AbstractMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//	AbstractClass ac = new AbstractClass(); this is not possible because, we cannot instantiate an abstract class
		
		AbstractClass ac = new AbstractSubClass();
		
		ac.print();
		ac.printabs();
	//	ac.printsub(); the printsub() is not visible because, it is a method of sub class, also the object is of the type super class
		
		if(ac instanceof AbstractClass){
			((AbstractSubClass) ac).printsub();
		}
	}

}
