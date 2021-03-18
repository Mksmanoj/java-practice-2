package com.linkedlist.methods;

import java.util.LinkedList;
import java.util.List;

public class Object_To_Array {
	public List<String> getdata() {
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("Hi");
		llist.add("I");
		llist.add("Love");
		llist.add("java");
		System.out.println("Linked List:" + llist);
		// creating array and copy the list in it
		Object[] array = llist.toArray();
		// printing the array
		for (int i = 0; i < llist.size(); i++) {
			System.out.println("Array:" + array[i]);
		}
		return null;
	}
}
