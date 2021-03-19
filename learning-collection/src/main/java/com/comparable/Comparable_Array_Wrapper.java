package com.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparable_Array_Wrapper {
	public static void main(String[] args) {

		int[] arr = { 11, 55, 22, 0, 89 };
		Arrays.sort(arr);
		System.out.print("Sorted Int Array: ");
		System.out.println(Arrays.toString(arr));
		System.out.print("Sorted String Array: ");
		String[] names = { "m", "a", "n", "o", "j" };
		System.out.println(Arrays.toString(names));
		Arrays.sort(names);
		System.out.println("Sorted String Array: " + Arrays.toString(names));

		List<String> Letters = new ArrayList<>();
		Letters.add("e");
		Letters.add("b");
		Letters.add("d");
		Letters.add("a");
		Letters.add("c");
		System.out.println(Letters);
		Collections.sort(Letters);
		System.out.println(Letters);
		Collections.reverse(Letters);
		System.out.println(Letters);

	}
}