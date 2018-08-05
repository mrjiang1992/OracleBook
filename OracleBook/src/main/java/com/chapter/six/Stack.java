package com.chapter.six;

public class Stack<T> {
	private int size = 0;
	private T[] stack;

	public Stack(int size) {
		this.stack = (T[]) new Object[size];
	}

	public Stack() {
		this.size = 0;
		this.stack = (T[]) new Object[10];
	}

	public void push(T elem) {
		if (size != stack.length) {
			stack[size] = elem;
			size++;
		} else {
			System.out.println("Stack is full");
		}
	}

	public T pop() {
		if (size != 0) {
			size--;
			return stack[size];
		} else {
			System.out.println("Stack is empty");
			return null;
		}
	}
}
