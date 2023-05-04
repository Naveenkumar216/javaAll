package com.java.method;

public class OverLoading {

	public static void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("Result  is "+ result);
	}
	// method overloading
	public static void add(double num1 , double num2) {
		double result = num1 + num2;
		System.out.println("Result is " + result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      add(10,20);
      add(10.5,22.2);
	}

}
