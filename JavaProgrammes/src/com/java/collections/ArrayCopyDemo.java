package com.java.collections;

public class ArrayCopyDemo {

	public static void main(String[] args) {
		
		String[] copyFrom = {
	            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
	            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
	            "Marocchino", "Ristretto" };
//		
//		String[] copyTo = new String[7];
//		
//		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		
		 String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9); 
		
		for(String coffee: copyTo)
			System.out.println(coffee);

	}

}
