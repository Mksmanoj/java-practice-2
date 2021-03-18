
package com.arraylist.constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraylist_methods {

	public static void main(String[] args) {
		List<String> letters = new ArrayList<String>();

		// add()
		letters.add("A");
		letters.add("C");
		letters.add("D");
		
		for (String string : letters) {
			
			
		}
		
		for(String a:letters) {
			System.out.println(a);
		}
		for(int i= 0;i<letters.size();i++) {
			System.out.println(letters.get(i));
		}

		// inserting B between A and C
//		letters.add(1, "B");
//		System.out.println(letters);
//
//		List<String> list = new ArrayList<String>();
//		list.add("E");
//		list.add("H");
//
//		// appending list elements to letters
//		// addAll()
//		letters.addAll(list);
//		System.out.println(letters);
//
//		// clear();
//		// clear(); removes all element
//		list.clear();
//
//		list.add("F");
//		list.add("G");
//
//		// .addAll()
//		// inserting list inside letters for getting right sequence
//		letters.addAll(5, list);
//		System.out.println(letters);
//
//		// contains()
//		System.out.println("Letters list contains E ? " + letters.contains("E"));
//		System.out.println("Letters list contains Z ? " + letters.contains("Z"));
//
//		// ensureCapacity()
//		// ensureCapacity it's ArrayList method, so object should be defined
//		// like below.
//		ArrayList<String> objectdefined = new ArrayList<>();
//		objectdefined.ensureCapacity(1000);
//
//		// get()
//		String e = letters.get(4);
//		System.out.println("Letter at 5th place: " + e);
//
//		// .isEmpty()
//		System.out.println("tempList is empty ? " + objectdefined.isEmpty());
//
//		// indexOf()
//		System.out.println("First index of D = " + letters.indexOf("D"));
//		System.out.println("Last index of D = " + letters.lastIndexOf("D"));
//
//		// remove(int index)
//		System.out.println(letters);
//		String removed = letters.remove(3);
//		System.out.println("After removing '" + removed + "' letters contains " + letters);
//
//		// remove(object o)
//		// remove first occurrence of H
//		boolean isRemoved = letters.remove("H");
//		System.out.println("H removed? " + isRemoved + ". Letters contains " + letters);
//		System.out.println("list contains " + list);
//
//		// .removeAll()
//		// remove all matching elements between letters and list
//		letters.removeAll(list);
//		System.out.println(letters);
//
//		// retainAll()
//		list.clear();
//		list.add("A");
//		list.add("B");
//		list.add("C");
//		letters.retainAll(list);
//		System.out.println("letters elements after retainAll operation: " + letters);
//
//		// size()
//		System.out.println("letters ArrayList size = " + letters.size());
//
//		// set ()
//		letters.set(2, "D");
//		System.out.println(letters);
//
//		// toArray()
//		String[] strArray = new String[letters.size()];
//		strArray = letters.toArray(strArray);
//		System.out.println(Arrays.toString(strArray));
	}
}
