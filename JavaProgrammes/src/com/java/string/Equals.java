package com.java.string;

public class Equals {
	public static void main(String []args) {
		 
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		String s4 = new String("java").intern();
		System.out.println(s1==s2);
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		System.out.println(s3==s2);
		System.out.println(s1.equals(s4));
		System.out.println(s4==s1);
	 }
}
