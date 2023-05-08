package com.java.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

	public static void main(String[] args) {
		
//		Deque<Integer> queue = new ArrayDeque<Integer>();
//		
//		queue.offer(1);
//		queue.offer(10);
//		queue.offer(100);
//		queue.offer(1000);
//		
//		while(!queue.isEmpty()) {
//			System.out.println(queue.poll());
//		}

    Deque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(1);
		stack.push(10);
		stack.push(100);
		stack.push(1000);
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	}

}
