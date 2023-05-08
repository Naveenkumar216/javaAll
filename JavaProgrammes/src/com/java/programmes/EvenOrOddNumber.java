package com.java.programmes;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter a number");

		int n = sc.nextInt();
		ArrayList<Integer> evenNumber = new ArrayList<Integer>();
		ArrayList<Integer> oddNumber = new ArrayList<Integer>();
		
		for(int i=0; i<=n;i++) {
			if(i%2==0) {
			  evenNumber.add(i);
			} else 
			{
				oddNumber.add(i);
			}
		}
 
		System.out.print("Even numbers : "+evenNumber);
		System.out.println();
		System.out.print("Odd Numbers : "+oddNumber);
	}

}
