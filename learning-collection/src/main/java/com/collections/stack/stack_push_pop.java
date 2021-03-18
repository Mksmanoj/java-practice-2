package com.collections.stack;

import java.util.Stack;

public class stack_push_pop {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		System.out.println(stack);
		stack.pop();
		System.out.println("After pop : " + stack);
		System.out.println("Head of stack : " + stack.peek());
	}
}
