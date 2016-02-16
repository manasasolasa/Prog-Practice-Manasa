package com.java.aug;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]a= new int [3][3];
		a[0][0] = 1;
		a[0][1] = 1;
		a[0][2] = 1;
		a[1][0] = 1;
		a[1][1] = 1;
		a[1][2] = 1;
		a[2][0] = 1;
		a[2][1] = 1;
		a[2][2] = 1;
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				
				System.out.println(+a[i][j]);
			}
			
		}
	}

}
