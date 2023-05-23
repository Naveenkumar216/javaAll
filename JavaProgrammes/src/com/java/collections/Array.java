package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		
     List<Integer> nums = new ArrayList<>();
     
     nums.add(1);
     nums.add(10);
     nums.add(5);
     nums.add(8);
     
     //we can reverse the order
     //Collections.reverse(nums);
     
     //min and max finding
     //System.out.println(Collections.max(nums));
     
     //we can shuffle the underlying collection
     //Collections.shuffle(nums);
     
     //Collections.rotate(nums, 2);
     
     //replace the items
     // Collections.replaceAll(nums, 1, 6);
     
     modify(nums);
     
     nums = Collections.unmodifiableList(nums);
     
     System.out.println(nums);
    
     
	}
	
	public static void modify(List<Integer> list){
		list.remove(0);
	}

}
