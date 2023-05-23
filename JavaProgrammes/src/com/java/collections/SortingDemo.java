package com.java.collections;

import java.util.Arrays;

public class SortingDemo {

	public static void main(String[] args) {
		
		//QuickSort - to sort primitive types( int ,float etc..)
		//MergeSort - to sort reference types (Interger,String ...)
		
		int[] num = {1,2,30,5,3,6,9,7,0-5,10,-9,};
		Arrays.sort(num);
		
//		for(Integer n : num)
//			System.out.print(n+" ");
		
		for(int i=num.length-1;i>=0;i--)
			System.out.print(num[i]+" ");

	}

}
