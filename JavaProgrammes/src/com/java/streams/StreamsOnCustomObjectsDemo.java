package com.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsOnCustomObjectsDemo {
	
	public static void main(String[] args) {
		
		List<Book> books = new ArrayList<>();
		books.add(new Book("Being and Time", "Heidegger", 560, Type.PHILOSOPHY));
		books.add(new Book("The Trial", "Franz Kafka", 240, Type.NOVEL));
		books.add(new Book("Death on The Nile", "Agatha Christie", 370, Type.THRILLER));
		books.add(new Book("Ancient Greece", "Robert F.", 435, Type.HISTORY));
		books.add(new Book("Ancient Rome", "Robert F.", 860, Type.HISTORY));
		books.add(new Book("Death of Virgil", "Hermann Broch", 590, Type.NOVEL));
		books.add(new Book("The Stranger", "Albert Camus", 560, Type.NOVEL));
		
//	  List<String> result = books.stream().filter(t ->t.getType() == Type.NOVEL)
//			              .sorted(Comparator.comparing(Book::getAuthor))
//			              .map(Book::getAuthor)
//			              .collect(Collectors.toList());
//	  
//		//System.out.println(Arrays.toString(result.toArray()));
//	  
//	  result.stream().forEach(System.out::println);
		
		//grouping by type
//		Map<Type, List<Book>> booksByType = books.stream().collect(Collectors.
//				                                  groupingBy(Book::getType));
//		booksByType.entrySet().stream().forEach(System.out :: println);
		
		//finding 2 longest books (with more than 500 pages)
//		List<String> longestBooks= books.stream().filter(p ->p.getPages()> 500)
//				                        .map(Book::getTitle).limit(2).collect(Collectors.toList());
//		
//		longestBooks.stream().forEach(System.out::println);
		
		//external iteration (collections)
		List<String> titles = new ArrayList<String>();
		Iterator<Book> iterator = books.iterator();
		
		while(iterator.hasNext()) {
			titles.add(iterator.next().getTitle());
		}
		
		//Stream API - internal iteration
		
		List<String>  titles2 = books.stream().map(Book::getTitle).collect(Collectors.toList());
	    titles2.forEach(e -> System.out.println(e));
	}

}
