package com.prog.prac;

import java.util.HashSet;
import java.util.Iterator;

public class DuplicateSet {
	
//	static void createSet(){
//		HashSet<String> mySet = new HashSet<String> ();
//		mySet.add("jan");
//		mySet.add("feb");
//		mySet.add("mar");
//	}
	
	//ACCESS ELEMENTS
//	static void accessElements(HashSet<String> set){
//		
//		Iterator itr = set.iterator();
//		while(itr.hasNext()){
//			System.out.println("elements are: " +itr.next());
//		}
//		
//	}
	
	//REMOVE DUPLICATES FROM ARRAY
	
	static void removeDup(){
		int[] arr = {10, 12, 12, 4, 2, 6, 15,20};
		HashSet<Integer> myset = new HashSet<Integer> ();
		for(int i =0;i<arr.length;i++){
			myset.add(arr[i]);
		}
		myset.toArray();
	
		
		System.out.println("elements are :" );
		
		for(Integer integer: myset){
			System.out.print(integer+" " );
		}
//		for(int i=0;i<arr.length ; i++){
//			
//			System.out.print(arr[i]+ " ");
//		}
		
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		removeDup();
	}
	
	

}
