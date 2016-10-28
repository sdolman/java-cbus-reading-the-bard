package org.wecancodeit.week3.bard;

import junit.framework.Assert;

import org.junit.Test;

/**
 * TODO satisfy one test at a time and in order -- remember to do the simplest thing that works.
 */
public class PunctuationStripperTest {
	
	@Test
	public void shouldReturnEmptyForAnEmptyString() {
		//TODO create PunctuationStripper and tell it to strip an empty string
		String testString = "";
		PunctuationStripper underTest = new PunctuationStripper(testString);
		Assert.assertEquals("", underTest.getStrippedString());
	}
	
	@Test
	public void shouldReturnStringUnchangedIfNoPunctuation() {
		//TODO create PunctuationStripper and tell it to strip a string without punctuation
		String testString = "This is a test string";
		PunctuationStripper underTest = new PunctuationStripper(testString);
		Assert.assertEquals("This is a test string", underTest.getStrippedString());
	}
	
	@Test
	public void shouldTrimWhitespaceFromTheBeginningAndEndOfAString() {
		//TODO create PunctuationStripper and tell it to strip a string with leading and trailing whitespace
		String testString = "    This is a string with whitespace at ends      ";
		PunctuationStripper underTest = new PunctuationStripper(testString);
		underTest.stripPunctuation();
		Assert.assertEquals("This is a string with whitespace at ends", underTest.getStrippedString());
	}
//	@Test
//	public void shouldStripPunctuationWithoutTrim() {
//		//TODO create PunctuationStripper and tell it to strip a string with leading and trailing whitespace
//		// Added without trim
//		String testString = "    This is a, string! with? white;space: at ends      ";
//		PunctuationStripper underTest = new PunctuationStripper(testString);
//		underTest.stripPunctuationNoNewLine();
//		Assert.assertEquals("    This is a string with whitespace at ends      ", underTest.getStrippedString());
//	}
	
	//TODO create additional tests if they make you feel more comfortable with your solution
	@Test
	public void shouldStripPunctuationAndTrim() {
		String testString = "    This is a, string! with? white;space: at ends      ";
		PunctuationStripper underTest = new PunctuationStripper(testString);
		underTest.stripPunctuationNoNewLine();
		underTest.trimString();
		Assert.assertEquals("This is a string with whitespace at ends", underTest.getStrippedString());
	}
	
	@Test
	public void shouldReplacePunctuationWithNewlineAndTrim() {
		String testString = "    This is a, string! with? white;space: at ends      ";
		PunctuationStripper underTest = new PunctuationStripper(testString);
		underTest.stripPunctuation();
		// underTest.trimString();
		Assert.assertEquals("This is a\r\n string\r\n with\r\n white\r\nspace\r\n at ends", underTest.getStrippedString());
	}
	
}
