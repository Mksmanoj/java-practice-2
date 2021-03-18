package com.collection;

import java.util.ArrayList;
import java.util.List;

public class get_method {
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("ups");
		al.add("cpu");
		al.add("monitor");
		al.add("keyboard");
		al.add("mouse");
		al.add("printer");
		al.add("wifi");
		al.add("router");
		al.add("router");

		List<String> al2 = new ArrayList<>();
		al2.add("ups1");
		al2.add("cpu1");
		al2.add("MONITOR1");
		al2.add("keyboard1");
		al2.add("mouse1");

		al.addAll(al2);
		System.out.println(al);
//		System.out.println(al2);
//		System.out.println("First element of the ArrayList: " + al.getClass());
//		System.out.println("First element of the ArrayList: " + al.get(0));
//		System.out.println("Third element of the ArrayList: " + al.get(2));
//		System.out.println("Sixth element of the ArrayList: " + al.get(5));
//		System.out.println("Fourth element of the ArrayList: " + al.get(3));
		
	}
}
