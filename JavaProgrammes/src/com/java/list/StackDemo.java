package com.java.list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> names = new Stack<String>();
		
		names.push("Adam");
		names.push("Joe");
		names.push("Ana");
		names.push("Daniel");
		names.push("KatY");

		System.out.println(names.size());
		System.out.println(names.pop());
		System.out.println(names.size());
	}

}
