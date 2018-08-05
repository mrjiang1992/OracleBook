package com.chapter.six;

public class QuestionSix {
	public String displayStringInReverse(String rev){
		if(rev.length() == 1) {
			return rev;
		} else {
			return displayStringInReverse(rev.substring(1)) + rev.charAt(0);
		}
	}
}
