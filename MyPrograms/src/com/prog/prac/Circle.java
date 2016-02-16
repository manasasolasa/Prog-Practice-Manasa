package com.prog.prac;

public class Circle extends Shape implements  ShapeConstant{

	double area(){
		return (pi*s*s/2);
	}
	double perimeter(){
		return (2*pi*s); 
	}
	void side(){	
	}
	
	Circle(){
	//default constructor	
	}
	Circle(int sides){
		this.s = sides;
	}
}
