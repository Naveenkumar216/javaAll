package com.java.map;

public class Person {

	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		//it calculates an array index baseb on the key (keys ==Person objects)
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	//THERE SOME RULES
	//if two objects are equal then they must have the same hash code
	//if two objects have the same hash code they may or may not be equal
	
	@Override
	public boolean equals(Object obj) {
		//because in a hashmap it may happen(collisions)
		//that we have to find the item(Person) in a linked list
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	
	
	
	
}
