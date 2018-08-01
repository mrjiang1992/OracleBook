package com.chapter.three;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestQuestionTen {

	@Test
	void testWithOnlyLetters() {
		QuestionTen ten = new QuestionTen();
		Assert.assertEquals("ABcdsedSGf", ten.ConvertCharacter("abCDSEDsgF"));
	}
	
	@Test
	void testWithSpecialCharacters() {
		QuestionTen ten = new QuestionTen();
		Assert.assertEquals("ABcds'e9d0(S)Gf", ten.ConvertCharacter("abCDS'E9D0(s)gF"));
	}

}
