package com.java.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
    
		Queue<String> queue = new LinkedList<String>();
		
		queue.add("Adam");
		queue.add("Kevin");
		queue.add("Ana");
		queue.add("Katy");
		
		for(String s : queue)
			System.out.println(s);

	}

}
