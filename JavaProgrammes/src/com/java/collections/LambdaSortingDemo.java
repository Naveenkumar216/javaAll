package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaSortingDemo {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<Person>();
		
		people.add(new Person("Adam", 33));
		people.add(new Person("Joe", 12));
		people.add(new Person("Michael", 25));
		people.add(new Person("Ana", 27));
		people.add(new Person("Katy", 78));
		people.add(new Person("Kavin", 45));
		
		Collections.sort(people,Comparator.comparing(Person::getName));
		
		for(Person p : people)
			System.out.println(p.getName()+"-"+p.getAge());
	}

}
