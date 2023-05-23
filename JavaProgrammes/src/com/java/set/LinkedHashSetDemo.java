package com.java.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		Set<String> set= new LinkedHashSet<String>();
		
		set.add("Adam");
		set.add("Kevin");
		set.add("Daniel");
		set.add("joe");
		set.add("Ana");
		
		for(String s : set)
			System.out.println(s);

	}

}
