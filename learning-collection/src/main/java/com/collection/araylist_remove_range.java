package com.collection;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class araylist_remove_range extends ArrayList<Object> {

	
	public static void main(String[] args) {

		araylist_remove_range aList = new araylist_remove_range();

		aList.add(3);
		aList.add(5);
		aList.add(9);
		aList.add(11);	
		aList.add(15);
		aList.add(16);

		System.out.println("The Arraylist:" + aList);

		// using removerange() method to remove value of index 1 to index 2

		aList.removeRange(1, 3);

		System.out.println("Removing Element From Index 1 to Index 2 using removeRange(1,3)");
		System.out.println("The Arraylist after using removeRange:" + aList);

	}

}