package com.java.constructor;

class Animals{
	
	 // default or no-arg constructor of class Animal
	Animals(){
		System.out.println("i am an animal");
	}
	Animals(String type){
		System.out.println("Type :"+type);
		
	}
}

class Cat extends Animals{
	
	 // default or no-arg constructor of class Dog
   Cat() {
   	
   	super("Animal");
   	System.out.println("i am an Dog");
	}
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		Cat cat = new Cat(); 

	}

}
