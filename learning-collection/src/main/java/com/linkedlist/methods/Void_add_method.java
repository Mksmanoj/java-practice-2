package com.linkedlist.methods;
import java.util.LinkedList;
import java.util.List;

class Void_add_method {
	public List<String> getdata() {
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("Hi");
		llist.add("i ");
		llist.add("Love");
		llist.add("java");
		System.out.println("LinkedList:" + llist);
		llist.add(1, "Element");
		System.out.println("Linked List:" + llist);
		return llist;
	}
}
