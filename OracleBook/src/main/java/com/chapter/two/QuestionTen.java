package com.chapter.two;

import java.util.LinkedList;
import java.util.List;

public class QuestionTen {
	List<Integer> findPrime(int low, int high) {
		List<Integer> primes = new LinkedList<>();
		for (int i = low; i < high; i++) {
			if (isPrime(i))
				primes.add(i);
		}
		return primes;
	}

	boolean isPrime(int value) {
		int valueCounter = (int) Math.floor(Math.sqrt(value));
		while (valueCounter > 1) {
			if (value % valueCounter == 0) {
				return false;
			}
			valueCounter--;
		}
		return true;
	}
}
