package com.prog.prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrList {

	static void addToList(){
//ADDING ELEMENTS TO THE LIST		
		ArrayList list = new ArrayList();
		list.add("jan");
		list.add("feb");
		list.add("mar");
		list.add(Integer.valueOf(100));
		list.add("apr");
		
		accessElements(list);
		findElement(list,"mar");
		findElement(list,"may");
		reverseList(list);
	}
	static void accessElements(ArrayList list){
//		for(Object obj: list){
//			System.out.println("the elements in the list are: " +obj);
//		}
		
//PRINTING ELEMENTS USING ITERATOR
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println("elements are: " +itr.next());
		}
	}
	
	static void reverseElements(ArrayList list){
		Iterator itr = list.iterator();
		
	}
	
//SEARCHING FOR AN ELEMENT IN THE LIST
	static void findElement(ArrayList list,String ele){
//		boolean flag = true;
//		for(Object obj: list){
//			if (ele.equals(obj)){
//				System.out.println("Element found " +ele);
//				flag = false;
//			}	
//		}
//		if(flag)
//			System.out.println("element not found");
		
		Iterator itr = list.iterator();
		boolean flag = true;
		while(itr.hasNext()){
			if(ele.equals(itr.next())){
				System.out.println("element found " +ele);
				flag = false;
			}
		}	
		if(flag)
			System.out.println("element not found " +ele);
		
		
	}
	
//PRINT ELEMENTS IN REVERSE ORDER USING LISTITERATOR	
	static void reverseList(ArrayList a){
//		Collections.reverse(list);
//		System.out.println("reverse order is ");
//		accessElements(list);
		ListIterator li =  a.listIterator(a.size());
	
		System.out.println("list in reverese order using listIterator:");
		while(li.hasPrevious()){
			System.out.println(li.previous());
		}
	}
	
	
	public static void main(String[] args){
		// TODO Auto-generated method stub

		ArrList.addToList();
	}
}
