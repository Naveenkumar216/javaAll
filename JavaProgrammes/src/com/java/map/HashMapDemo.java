package com.java.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		//insert into the map 
		map.put(1, "Adam");
		map.put(2, "Kevin");
		map.put(3, "Ana");
		map.put(40, "Lucy");
		
		//remove items 
		map.remove(3);
		
		//we can retrieve items based on keys
		//System.out.println(map.get(1));
		
//		for(Integer key : map.keySet())
//			System.out.println(map.get(key));
		
		for(Map.Entry<Integer,String> entry : map.entrySet())
			System.out.println(entry.getKey()+ "_"+entry.getValue());
	}

}
