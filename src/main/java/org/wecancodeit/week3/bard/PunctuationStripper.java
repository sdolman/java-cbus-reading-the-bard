package org.wecancodeit.week3.bard;

public class PunctuationStripper {

	String problemString = null;
	
	public PunctuationStripper (String testString) {
		problemString = testString;
	}

	public void trimString() {
		problemString = problemString.trim();
	}
	
	public void stripPunctuationNoNewLine() {
		// TODO Auto-generated method stub
		problemString = problemString.replaceAll("[^\\w\\s]", "");
	}
	
	public String getStrippedString() {
		// TODO Auto-generated method stub
		
		return problemString;
	}

	public void stripPunctuation() {
		// TODO Auto-generated method stub
		problemString = problemString.replaceAll("[^\\w\\s]", "\r\n").trim();
	}

	

	
	
	

}
