package com.java.aug;

public class InterfaceSubClass implements InterfaceExample{
	
	public void printInterface(){
		System.out.println(InterfaceExample.text);
	}
	
	public void getInterface(String args){
			System.out.println("inside the interface sub calss" +args);
	}
	

}
