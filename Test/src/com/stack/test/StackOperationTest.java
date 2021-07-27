package com.stack.test;

import java.util.Stack;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StackOperationTest 
{
	@Test
	public void testEmptyStack() {
	    Stack<Integer> stack = new Stack<>();
	    assertEquals(true, stack.isEmpty());
	}
	
	@Test
	public void testStackSizeWhenElementsArePushed() {
	    Stack<Integer> stack = new Stack<>();
	    stack.push(42);
	    stack.push(66);
	    stack.push(99);
	    
	    assertEquals(3, stack.size());
	}
	
	@Test
	public void testStackSizeAndStackWhenPopOperationIsPerformed() {
	    Stack<Integer> stack = new Stack<>();
	    stack.push(42);
		stack.push(66);
		stack.push(99);

		// Last element is removed from the stack
	    Integer element = stack.pop();
	    
	    assertEquals(Integer.valueOf(99), element);
	    assertTrue(2, stack.size());
	}
}
