package com.chapter.two;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestQuestionTen {
	QuestionTen ten = new QuestionTen();

	@Test
	void testQuestionTen() {
		Assert.assertEquals(25, ten.findPrime(2, 100).size());
	}
}
