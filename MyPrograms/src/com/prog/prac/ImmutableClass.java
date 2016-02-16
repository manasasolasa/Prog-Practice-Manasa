package com.prog.prac;

//The instance of this class is final. i.e., we cannot change the value after the object is created
//the class is final, so we can not create a subclass
//there is no setter method. so, we cannot change the value of the instance variable
public final class ImmutableClass {

	
	final String AccNumber;
	
	public ImmutableClass(String AccNumber){
		this.AccNumber = AccNumber;
		
	}
	public String getAccNumber(){
		return AccNumber;
	}

}
