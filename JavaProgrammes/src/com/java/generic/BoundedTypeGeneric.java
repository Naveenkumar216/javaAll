package com.java.generic;

public class BoundedTypeGeneric {
	
	public static <T extends Comparable<T>> T calculateMin(T num1,T num2) {
		if(num1.compareTo(num2)<0) {
			return num1;
		}
		return num2;
	}
	
	public static <T extends Number> double add (T a,T b) {
		double result = a.doubleValue()+b.doubleValue();
		return result;
	}

	public static void main(String[] args) {
		
	//System.out.println(calculateMin("Kevin","Ana"));
		
		System.out.println(add(10,20));
	}

}
