package com.java.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		map.put("aaa", 1);
		map.put("bbb", 2);
		map.put("ccc", 3);
		map.put("ddd", 4);
		map.put("eee", 5);
		map.put("fff", 6);
		map.put("ggg", 7);
		map.put("hhh", 7);
		map.put("iii", 8);
		map.put("jjj", 9);

		
		for(String key :map.keySet())
			System.out.println(key +"_"+map.get(key));
	}

}
