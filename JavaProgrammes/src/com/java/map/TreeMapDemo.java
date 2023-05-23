package com.java.map;

import java.io.ObjectInputStream.GetField;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(10,"Ten");
		map.put(3,"Three");
		map.put(5,"Five");
		map.put(1,"One");
		map.put(8,"eight");
		
		for(Map.Entry<Integer,String> entry: map.entrySet())
			System.out.println(entry.getKey()+"_"+entry.getValue());

	}

}
