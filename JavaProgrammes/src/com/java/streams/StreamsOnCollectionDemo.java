package com.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsOnCollectionDemo {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		
		names.add("Adam");
		names.add("Ana");
		names.add("Kevin");
		
		Stream<String> nameStream = names.stream();
		nameStream.forEach(System.out::println);

	}

}
