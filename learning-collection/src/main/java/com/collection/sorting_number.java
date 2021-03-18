package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class sorting_number {
	public static void main(String[] args) {
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(21);
		list2.add(11);
		list2.add(51);
		list2.add(3);
		// Sorting the list
		Collections.sort(list2);
		// Traversing list through the for-each loop
		for (Integer number : list2)
			System.out.println(number);
		System.out.println("Number of elements in ArrayList:"+list2.size());
		
	}
}
