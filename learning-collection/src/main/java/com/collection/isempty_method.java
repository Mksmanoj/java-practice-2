package com.collection;
import java.util.ArrayList;
import java.util.List;

public class isempty_method {
	public static void main(String[] args) {
		String myStr1 = "yusata";
        String myStr2 ="";
		System.out.println(myStr1.isEmpty());
		System.out.println(myStr2.isEmpty());

		List<Integer> al = new ArrayList<Integer>();
		System.out.println("is array empty: " + al.isEmpty());
		al.add(6);
		al.add(555);
		al.add(4);
		al.add(5);
		System.out.println("is array empty: " + al.isEmpty());
		System.out.println(al);

		for (Integer num : al) {
			System.out.println(num);
		}
	}

}
