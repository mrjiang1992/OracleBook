package com.chapter.six;

import org.junit.jupiter.api.Test;

class TestQuestionThree {

	@Test
	void testStack() {
		Stack<Character> stack = new Stack<>(5);
		stack.push('a');
		stack.push('b');
		stack.push('c');
		stack.push('d');
		stack.push('e');
		stack.push('f');
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.pop();
		
	}

}
