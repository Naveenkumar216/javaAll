package com.java.programmes;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void removeDuplicates(int []a) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for(int i=0; i<a.length;i++) {
			set.add(a[i]);
		}
		System.out.println(set);
	}
	
	public static void main(String[] args) {
		int a[] = {5,2,6,8,6,7,5,2,8};
	
        removeDuplicates(a);
		

	}

}
