package com.prog.prac;

import java.util.HashSet;
import java.util.Iterator;

public class SetEx {

	static void createSet(){
		
		HashSet myset = new HashSet();
		myset.add("sunday");
		myset.add("monday");
		myset.add("sunday");
		myset.add("tuesday");
		accessElement(myset);
	}
	static void accessElement(HashSet myset){
		Iterator itr = myset.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	//remove duplicate elements from an array
	static void removeDuplicates()
	{
		int[] a = {1,2,3,4,5,6,2,3,6,7,9};
		HashSet<Integer> myset = new HashSet<Integer>();
		
		for(int i =0;i<a.length;i++){
			myset.add(a[i]);		
		}
		myset.toArray();
		
		accessElement(myset);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		SetEx.createSet();
		SetEx.removeDuplicates();
	}

}
