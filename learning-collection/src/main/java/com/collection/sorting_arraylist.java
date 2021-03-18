package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class sorting_arraylist {
	public static void main(String[] args) {
		ArrayList<String> mnc = new ArrayList<String>();
		mnc.add("yusata");
		mnc.add("google");
		mnc.add("yahoo");
		mnc.add("amazon");
		mnc.add("infosys");
		Collections.sort(mnc);
		System.out.println(mnc);

		for (String str : mnc) {
			System.out.println(str + ",");
		
		}
	}
}
