package com.java.constructor;

class Animal{
	 // default or no-arg constructor of class Animal
	Animal(){
		System.out.println("i am an animal");
	}
}

class Dog extends Animal{
	 // default or no-arg constructor of class Dog
    Dog() {
    	
    	// calling default constructor of the superclass
    	//However, using super() is not compulsory. 
    	//Even if super() is not used in the subclass constructor, 
    	//the compiler implicitly calls the default constructor of the superclass.
    	//super();
    	System.out.println("i am an Dog");
	}
}
public class DefaultConstructor {

	public static void main(String[] args) {
		  Dog dog = new Dog();

	}

}
