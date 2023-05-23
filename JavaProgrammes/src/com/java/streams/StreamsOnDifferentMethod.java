package com.java.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsOnDifferentMethod {

	public static void main(String[] args) throws IOException {
		
//		String path = "C:\\Users\\NKURUMET\\git\\javaAll\\JavaProgrammes\\src\\com\\java\\streams\\names";
//        
//		Stream<String> namesStream = Files.lines(Paths.get(path));
//		
////	    namesStream.forEach(System.out :: println);
//		
//		List<String> name = namesStream.collect(Collectors.toList());
//		name.forEach(System.out :: println);
		
		//map() and flatMap() are similar to selecting a column in SQL
		//number of characters in every word 
		List<String> words =Arrays.asList("Adam","Ana","Daniel");
		
		List<Integer> lengths = words.stream().map(String::length).collect(Collectors.toList());
		lengths.stream().forEach(System.out::println);
		
		//create a list containing the squared values
		List<Integer> nums = Arrays.asList(1,2,3,4);
		nums.stream().map(x -> x * x ).collect(Collectors.toList())
		             .forEach(System.out::println);
		
		//flatMap() - mapping each array not with a stream but with the 
		//contents of that stream
		//[[1,3,5][5,13]] ->[1,3,5,5,13]
		//"hello" "shell" - get all the unique characters(h,e,l,o,s)
		
		String[] array = {"hello","shell"};
		
		List<String> unique = Arrays.stream(array).map(w -> w.split(""))
				             .flatMap(Arrays::stream)
				             .distinct().collect(Collectors.toList());  
		
		unique.stream().forEach(System.out::println);
		
//		
//		public List<List<Integer>> generatePairs() {
//	        
//	        List<Integer> nums1 = Arrays.asList(1, 2, 3);
//	        List<Integer> nums2 = Arrays.asList(4, 5);
//			
//			// implement your algorithm here (the pairs will be the result)
//	         List<List<Integer>> pairs =  nums1.stream().flatMap(i -> nums2.stream().map(j -> Arrays.                   asList(i, j))).collect(Collectors.toList());
//			
//			
//	        return pairs;
	}

}
