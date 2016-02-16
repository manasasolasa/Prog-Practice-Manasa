package com.prog.prac;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueEx {

	static void createq(){
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("jan");
		queue.add("feb");
		queue.add("march");
		queue.add("apr");
		accessElement(queue);
		
//		System.out.println(queue.peek());
//		accessElement(queue);
		
//		System.out.println(queue.poll());
//		accessElement(queue);
		
		
	}
	static void accessElement(PriorityQueue q){
		Iterator itr = q.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueEx.createq();
	}

}
