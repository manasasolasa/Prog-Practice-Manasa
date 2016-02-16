package com.prog.prac;

public class ShapesMain {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		
		Shape c1 = new Circle();
		c1.s = 2;
		System.out.println("area of the circle is: " +c1.area());
		System.out.println("perimeter of the circle is: " +c1.perimeter());
	
		Shape c2 = new Circle(3);
		System.out.println("area of the circle is: " +c2.area());
		System.out.println("perimeter of the circle is: " +c2.perimeter());
	
	
	}
	

}
