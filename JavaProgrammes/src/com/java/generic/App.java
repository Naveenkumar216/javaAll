package com.java.generic;

public class App {

	public static void main(String[] args) {
		GenericMethod method = new GenericMethod();
		
		//method.printItems("Hello Naveen", 216);
		//method.showItem(34.5);
		//System.out.println("Item is returned:" +method.showItem("Naveen"));
 
		 Integer[] nums = {1,2,5,4,3};
		 method.showItems(nums);
	}

}
