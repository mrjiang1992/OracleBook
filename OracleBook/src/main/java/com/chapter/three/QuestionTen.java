package com.chapter.three;

public class QuestionTen {
	String ConvertCharacter(String convert){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < convert.length(); i++) {
			if(convert.charAt(i) >= 'a' && convert.charAt(i) <= 'z') {
				sb.append(LowerToUpper(convert.charAt(i)));
			} else if (convert.charAt(i) >= 'A' && convert.charAt(i) <= 'Z') {
				sb.append(UpperToLower(convert.charAt(i)));
			} else {
				sb.append(convert.charAt(i));
			}
			
		}
		return sb.toString();
	}
	
	private char UpperToLower(char c) {
		return (char) (c+32);
	}
	
	private char LowerToUpper(char c) {
		return (char) (c-32);
	}
	
}
