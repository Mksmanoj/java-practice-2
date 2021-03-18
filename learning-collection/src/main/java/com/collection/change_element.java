package com.collection;

import java.util.ArrayList;

public class change_element {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("manoj");
		names.add("rajesh");
		names.add("smruti");
		names.add("arpita");
		names.add("a j sir " + "trainer");
		System.out.println(names);
		names.set(4, "debaprasad sir " + "trainer");
		System.out.println(names);
	}
}