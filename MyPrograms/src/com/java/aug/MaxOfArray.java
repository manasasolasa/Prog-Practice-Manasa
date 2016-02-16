package com.java.aug;

public class MaxOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				int[] a= new int[5];
				a[0]=10;
				a[1]=300;
				a[2]=20;
				a[3]=54;
				a[4]=2;
	//			a={10,300,20,54,2};
				int largest = a[0];
				
				for(int i=1;i<a.length;i++){
					if(largest<a[i]){
						largest=a[i];
					}
				}
				System.out.println("largest no of the array is: "+largest);
	}

}
