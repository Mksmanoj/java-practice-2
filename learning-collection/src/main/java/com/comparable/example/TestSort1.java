package com.comparable.example;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort1 {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(1, "manoj ", 21));
		al.add(new Student(2, "smruti", 23));
		al.add(new Student(3, "arpita", 17));

		Collections.sort(al);
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}

}
