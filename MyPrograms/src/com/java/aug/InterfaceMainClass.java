package com.java.aug;

public class InterfaceMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceExample ie = new InterfaceSubClass();
		ie.getInterface("good");
		ie.printInterface();
		System.out.println("static variable from the main " +InterfaceExample.text);
	}

}
