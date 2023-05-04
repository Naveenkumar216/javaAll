package com.java.programmes;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       System.out.println("Enter n :");
	       int n = sc.nextInt();
	       for(int i=0;i<=n;i++) {
	    	   if(i%2==0) {
	    		   System.out.println(i);
	    	   }   
	       }
	       
	}
}
//		int a = 5;
//		int b = 7;
//
//		System.out.println("Before swapping:");
//		System.out.println("a = " + a);
//		System.out.println("b = " + b);
//
//		a = a ^ b;
//		b = a ^ b;
//		a = a ^ b;
//
//		System.out.println("After swapping:");
//		System.out.println("a = " + a);
//		System.out.println("b = " + b);
//
//		}
		
