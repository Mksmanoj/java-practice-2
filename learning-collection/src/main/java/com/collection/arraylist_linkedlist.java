package com.collection;

import java.util.*;

public class arraylist_linkedlist {

	public static void main(String args[]) {

		List<String> al = new ArrayList<String>();// creating arraylist
		al.add("manoj");// adding object in arraylist
		al.add("rajesh");
		al.add("mks");
		al.add("mmms");

		List<String> al2 = new LinkedList<String>();// creating linkedlist
		al2.add("manoj");// adding object in linkedlist
		al2.add("rajesh");
		al2.add("mks");
		al2.add("mmms");

		System.out.println("arraylist: " + al);
		System.out.println("linkedlist: " + al2);
	}
}