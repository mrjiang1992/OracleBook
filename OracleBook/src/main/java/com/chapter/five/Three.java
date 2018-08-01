package com.chapter.five;

public class Three {
	double AverageOfTenNumbers(double[] values) {
		double sum = 0;
		for(int i = 0; i < values.length; sum+=values[i]);
		return sum/values.length;
	}
}
