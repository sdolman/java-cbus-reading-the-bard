package org.wecancodeit.week3.bard;

import java.io.BufferedReader;

public class ShakespeareReadingApp {

	/**
	 * This is how we create a constant in Java.
	 * 
	 * TODO Replace this with the location of the Yorick.txt file in the
	 * src/main/resources folder of your local computer.
	 */
	public static String SHAKESPEARE_FILEPATH = "c:\\pathOnYourMacine\\src\\main\\resources\\Yorick.txt";

	/**
	 * TODO load the file at SHAKESPEARE_FILEPATH via a {@link BufferedReader}
	 */
	public static void main(String[] args) {
		readAndWriteToSystemOut();
		writeFileReplacingPunctuationWithLinebreaks();
		tryToReadAFileThatDoesntExist();
	}

	/**
	 * <p>
	 * TODO load the file at SHAKESPEARE_FILEPATH via a {@link BufferedReader}
	 * </p>
	 * 
	 * <p>
	 * TODO read each line of text, then write each line to System.out
	 * </p>
	 * 
	 * *
	 * <p>
	 * TODO Close the {@link BufferedReader} you use in a finally block
	 * <p>
	 */
	private static void readAndWriteToSystemOut() {

	}

	/**
	 * <p>
	 * TODO read the input file and write a new file
	 * </p>
	 * 
	 * <p>
	 * TODO create and use an instance of {@link PunctuationStripper} to replace
	 * punctuation with newlines and remove other newlines, trimming space at
	 * the beginning and ends of lines
	 * </p>
	 * 
	 * <p>
	 * TODO Close the {@link BufferedReader} you use in a finally block
	 * </p>
	 * 
	 * <p>
	 * Example:
	 * </p>
	 * 
	 * <pre>
	 * Now get you to my lady's chamber, and tell her, let her paint an
	 * inch thick, to this favour she must come; make her laugh at that.
	 * </pre>
	 * 
	 * <p>
	 * would become:
	 * </p>
	 * 
	 * <pre>
	 * Now get you to my lady
	 * s chamber
	 * and tell her
	 * let her paint an inch thick
	 * to this favour she must come
	 * make her laugh at that
	 * </pre>
	 */
	private static void writeFileReplacingPunctuationWithLinebreaks() {
	}

	/**
	 * <p>TODO try to read a file that doesn't exist, catch the exception that is
	 * thrown, then write an error to {@link System#err} (same syntax as writing
	 * to {@link System#out})</p>
	 * 
	 * <p>
	 * TODO Close the {@link BufferedReader} you use in a finally block
	 * </p>
	 */
	private static void tryToReadAFileThatDoesntExist() {
	}

}
