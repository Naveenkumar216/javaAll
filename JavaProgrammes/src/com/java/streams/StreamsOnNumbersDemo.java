package com.java.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamsOnNumbersDemo {

	public static void main(String[] args) {
		
		int[] nums = {1,3,4,-5,9,-8,12};
		
		//lambda expression
		//:: operator or method reference
		//Arrays.stream(nums).forEach(System.out::println);
		
//		int sum = Arrays.stream(nums).sum();
//		System.out.println(sum);
		
		IntStream.range(0, 5).filter(x ->x%2==0).forEach(x -> System.out.print(x+" "));

	}

}
