package com.java.list;

import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		
		//resizing the array takes 0(N)
		List<String> names = new java.util.ArrayList<>();
		names.add("naveen");
		names.add("Sunil");
		names.add("puneeth");
		
		//random indexing in 0(1)
		//System.out.println(names.get(0));
		
		//insert item into a given index -0(N)
		names.add(0,"Daniel");
		names.remove(0);
		
		//ARRATLIST (ARRAYS) ARE FAST IF WE MANIPULATE THE LASE ITEM
		
		//because of the Iterable interface
		for(String s:names) {
			System.out.println(s);
		}

	}

}
