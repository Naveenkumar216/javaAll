package com.java.set;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		SortedSet<Integer> set = new TreeSet<>();
		
		set.add(12);
		set.add(1);
		set.add(9);
		set.add(5);
		set.add(120);
		set.add(87);
		set.add(55);
		set.add(44);
		set.add(44);
		
		//Set<Integer> subSet = set.subSet(1,5);
		//Set<Integer> subSet = set.tailSet(30);
		//Set<Integer> subSet = set.headSet(30);
		
		for(Integer num :set)
			System.out.println(num);

	}

}
