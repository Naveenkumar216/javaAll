package com.java.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Adam");
		set.add("Mary");
		set.add("Katy");
		set.add("Ana");
		
		for(String s : set)
			System.out.println(s);

	}

}
