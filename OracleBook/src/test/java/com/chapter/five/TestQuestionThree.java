package com.chapter.five;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestQuestionThree {

	@Test
	void testTenDoubleValues() {
		QuestionThree three = new QuestionThree();
		double[] tenValues = {10,20,30,40,50,60,70,80,90,100};
		Assert.assertEquals(55, three.AverageOfTenNumbers(tenValues),0);
	}

}
