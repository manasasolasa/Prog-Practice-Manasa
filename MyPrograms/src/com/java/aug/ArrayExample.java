package com.java.aug;

public class ArrayExample {

	
	public static void testfunction(int[] a){
		
		for(int i=0;i<a.length;i++){
		System.out.println(a[i]);	
		}
		}
	
	public static void reverse(int[] a){
		
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		
		int []a =  new int[5];
		a[0]=1;
		a[1]=45;
		a[2]=3;
		a[3]=3;
		a[4]=2;
		
		for(int i=0;i<a.length;i++){
			
			System.out.println(+a[i]);
		}
		
		int []arr = {1,2,3,4,5,6};
		
		for(int j=0;j<arr.length;j++){
			System.out.println(+arr[j]);
		}
		*/
		
		//TO FIND THE LARGEST ELEMENT IN THE ARRAY
		int[] arr={8,2,31,4,5,6};
	/*
		int largest =arr[0];
	
		testfunction(arr);
		for (int i=1;i<arr.length;i++){
		if(largest<arr[i])
			largest = arr[i];
		}
		System.out.println(+largest);
		*/
		//reverse array
		reverse(arr);
	}

}



