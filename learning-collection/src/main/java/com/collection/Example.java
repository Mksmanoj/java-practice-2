package com.collection;
import java.util.*;

class Example {
	public static void main(String args[]) {
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("manoj");
		alist.add("rajesh");
		alist.add("arpita");
		alist.add("adarsh");
		alist.add("sonu");
		alist.add("smruti");

		// displaying elements
		System.out.println(alist);
		
		
		Collections.sort(alist);

	      for (String str : alist) {
	         System.out.println(str);
	      }


		// Adding "mks" at the position
		alist.add(5, "mks");
		System.out.println(alist);

		// removing element
		alist.remove(0);
		alist.remove(3);
		System.out.println(alist);

		// cloning array list
		alist.clone();
		System.out.println("i cloned this");
		System.out.println(alist);
		
		
		
		
		// Remove all of the elements from this list.
		alist.clear();
		System.out.println(alist);

	}

}