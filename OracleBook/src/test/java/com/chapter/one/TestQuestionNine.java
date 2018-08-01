package com.chapter.one;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestQuestionNine {
	
	QuestionNine nine = new QuestionNine();
	
	@Test
	void testQuestionNineWithWeight100() {
		Assert.assertEquals(17, nine.computeWeightOnMoon(100),0);
	}

}
