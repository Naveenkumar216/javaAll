package com.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsOnDifferentMethod1 {

	public static void main(String[] args) {	
		
//		List<Integer> nums = Arrays.asList(1,2,3,4);
////		Optional<Integer> result = nums.stream().reduce(Integer::min);
////		//System.out.println(result.get());
////		result.ifPresent(System.out::println);
//		
//		nums.stream().reduce(Integer::max).ifPresent(System.out::println);
		
		List<Book> books = new ArrayList<>();
		books.add(new Book("Being and Time", "Heidegger", 560, Type.PHILOSOPHY));
		books.add(new Book("The Trial", "Franz Kafka", 240, Type.NOVEL));
		books.add(new Book("Death on The Nile", "Agatha Christie", 370, Type.THRILLER));
		books.add(new Book("Ancient Greece", "Robert F.", 435, Type.HISTORY));
		books.add(new Book("Ancient Rome", "Robert F.", 860, Type.HISTORY));
		books.add(new Book("Death of Virgil", "Hermann Broch", 590, Type.NOVEL));
		books.add(new Book("The Stranger", "Albert Camus", 560, Type.NOVEL));
		
//		//the maximum number of pages
//		
//		books.stream().map(Book::getPages).reduce(Integer::max).ifPresent(System.out::println);
//		
//		//we want to get the longest book
//	Optional<Book> longest = books.stream().reduce((b1,b2)->
//	                               b1.getPages() > b2.getPages() ? b1:b2);
//	
//	longest.ifPresent(System.out::println);
//	
//	//sum all pages of all books
//	//we have to transform Stream<Integer> into an integer stream "list of integers"
//	int totalPages = books.stream().mapToInt(Book::getPages).sum();
//	System.out.println(totalPages);
//	
//	
//	//books.stream().mapToInt(Book::getPages).max().ifPresent(System.out::println);
		
		//allMatch() - checking if a predicate matches all elements
		boolean result = books.stream().allMatch(b -> b.getPages() >2000);
		System.out.println(result);
		
		//noneMatch() - opposite of allMatch() 
		boolean result2 = books.stream().noneMatch(b -> b.getPages() >2000);
		System.out.println(result2);
				
	  //findAny - returns arbitrary element
	  //parallelization
	  // findFirst() - sequential
	  // findAny() -  with parallelization	
	  books.stream().filter(b -> b.getType() == Type.HISTORY).findAny()  // or findFirst()
	        .ifPresent(System.out::println);
	}

}
