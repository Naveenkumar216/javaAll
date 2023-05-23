package com.java.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeAndHash {

	public static void main(String[] args) {
		Map<Integer,Integer> map = new TreeMap<Integer, Integer>();
		
		long now = System.currentTimeMillis();
		
		for(int i=0;i<500000;i++)
			map.put(i,i);
		
		for(int i=0;i<500000;i++)
			map.get(i);
		
		System.out.println("Time taken with TreeMap"+(System.currentTimeMillis()-now));
		
		
    Map<Integer,Integer> map2 = new HashMap<Integer, Integer>();
		
	      now = System.currentTimeMillis();
		
		for(int i=0;i<500000;i++)
			map2.put(i,i);
		
		for(int i=0;i<500000;i++)
			map2.get(i);
		
		System.out.println("Time taken with HashMap"+(System.currentTimeMillis()-now));

	}

}
