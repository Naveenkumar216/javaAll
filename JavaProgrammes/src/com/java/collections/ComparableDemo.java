package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		
		List<Book> books = new ArrayList<Book>();
		
		books.add(new Book("Albert Camus","Title1",223));
		books.add(new Book("Heidegger","Being and Time",891));
		books.add(new Book("Michio Kaku","Quantum Physics",34));
		
//		Collections.sort(books);
//		System.out.println(books);
		
		//Comparator 
		Collections.sort(books, new BookComparator());
		System.out.println(books);
		
		

	}

}
