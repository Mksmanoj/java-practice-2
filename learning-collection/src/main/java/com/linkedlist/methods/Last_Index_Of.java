package com.linkedlist.methods;
import java.util.LinkedList;
import java.util.List;


public class Last_Index_Of {
	public List<String> getdata() {
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("Hi");
		llist.add("I");
		llist.add("Love");
		llist.add("java");
		llist.add("Hi");
		System.out.println("Linked List :" + llist);
// get the last index for "Hi"
		System.out.println("Last Index for Hi: " + llist.lastIndexOf("Hi"));
// get the index for "Android"
		System.out.println("Last Index for Android: " + llist.lastIndexOf("Android"));
		return llist;
	}
}
