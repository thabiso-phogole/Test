package com.stack;

import java.util.Stack;

public class StackOperation {

	public static void main(String[] args) 
	{	
		Stack<Integer> intStack = new Stack<>();
		intStack.push(42);
		intStack.push(66);
		intStack.push(99);

		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
	}
}
