package com.prog.prac;

public class ArraysMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,5,6};
		
		int b[] = {6,7,8};
		
		int newlen = a.length+b.length;
//		System.out.println(newlen);
		int c[] = new int[newlen];
		int i=0,k=0,j=0;
		try{
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
				c[k++] = a[i++];
			else
				c[k++] = b[j++];
		}
		while(i < a.length)
			c[k++] = a[i++];
		while(j<b.length)
			c[k++] = b[j++];
		}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}

		for( i=0;i<c.length;i++){
			System.out.print(" "+c[i]);	
		}

	}
}
