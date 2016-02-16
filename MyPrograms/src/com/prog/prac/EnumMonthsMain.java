package com.prog.prac;

public class EnumMonthsMain {

	public enum month{
		jan,feb,march,april,may,june,july,august,sep,oct,nov,dec
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		month m = month.april;	
		printNoOfDays(m);
		
	}
	
	static void printNoOfDays(month m){
		if((m == month.jan)|| (m == month.march) ||(m == month.may)
				||(m == month.july)||(m == month.august)
				||(m == month.oct)||(m == month.dec))
			System.out.println("31 days");
		else
			if((m == month.feb))
				System.out.println("28 days");
			else
				System.out.println("30 days");
		}    	
	}


