package com.java.list;

import java.util.List;

public class LinkedList {

	public static void main(String[] args) {
		
		List<Integer> list = new java.util.LinkedList<>();
		
		list.add(1);
		list.add(10);
		list.add(5);
		list.add(3);
		for(Integer num : list)
			System.out.println(num);
		

	}

}
