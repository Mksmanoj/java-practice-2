package com.linkedlist.methods;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class List_Iterator {
	public List<String> getdata() {
		LinkedList<String> llist = new LinkedList<String>();

	
		  llist.add("a");

		  llist.add("b");

		  llist.add("c");

		  llist.add("d");

		  llist.add("e");

		  System.out.println("Linked List :" + llist);

		  // set Iterator at specified index

		  Iterator<String> itr = llist.listIterator(3);

		  while (itr.hasNext()) {

		  System.out.println(itr.next());

		  }
		
		
		return null;
	}

}
