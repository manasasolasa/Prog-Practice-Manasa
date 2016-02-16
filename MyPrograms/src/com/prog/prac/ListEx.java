package com.prog.prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class ListEx {

	static void addToList(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("jan");
		list.add("feb");
//		list.add(Integer.valueOf(3));
		list.add("apr");
		list.add("may");
		accessElements(list);
		sortList(list);
			
//		LinkedList<String> llist = new LinkedList<String>();
//		llist.add("sunday");
//		llist.add("monday");
//		llist.add("tuesday");
//		accessElements(llist);
		
//		Stack<String> s = new Stack<String>();
//		s.push("sun");
//		s.push("mon");
//		s.push("tue");
//		s.pop();
		
	}
	//sort elements in the list
	static void sortList(ArrayList<String> list)
	{
		Collections.sort(list);
		System.out.println("sorted");
		accessElements(list);
		
		
	}
	static void accessElements(ArrayList list){
//for each loop		
//		for(Object obj:list){
//			System.out.println("the elements in the list are: "+obj);
//		}
		
//Iterator
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println("elements in the list are:" +itr.next());
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListEx.addToList();
	}

}
