package com.chapter.five;

public class QuestionThree {
	double AverageOfTenNumbers(double[] values) {
		double sum = 0;
		for(int i = 0; i < values.length; sum+=values[i],i++);
		return sum/values.length;
	}
}
