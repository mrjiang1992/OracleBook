package com.chapter.six;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestQuestionSix {

	@Test
	void testReverseString() {
		QuestionSix six = new QuestionSix();
		Assert.assertEquals("olleh", six.displayStringInReverse("hello"));
		
	}

}
