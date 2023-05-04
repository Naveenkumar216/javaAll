package com.java.collections;

import java.util.Map;
import java.util.HashMap;

public class Hash {

	public static void main(String[] args) {
		 
		Map <String,Integer> map = new HashMap <String,Integer>();
		 map.put("naveen", 60);
		 map.put("kumar", 50);
		 map.put("ram", 45);
		 map.put("shiva", 49);
		 map.put("raja", 54);
		 
		 map.entrySet().stream().filter(e -> e.getValue() >= 50)
         .forEach(e -> {
             System.out.println( e.getKey() + " " + e.getValue());
          });
	}
}
