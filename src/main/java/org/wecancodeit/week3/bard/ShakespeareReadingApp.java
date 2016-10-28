package org.wecancodeit.week3.bard;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ShakespeareReadingApp {

	static String prose = "";
	/**
	 * This is how we create a constant in Java.
	 * 
	 * TODO Replace this with the location of the Yorick.txt file in the
	 * src/main/resources folder of your local computer.
	 */
	public static String SHAKESPEARE_FILEPATH = "C:\\Users\\WeCanCodeIT\\\\OneDrive\\Documents\\WeCanCodeIT\\Repo\\java-cbus-reading-the-bard\\src\\main\\resources\\Yorick.txt";

	/**
	 * TODO load the file at SHAKESPEARE_FILEPATH via a {@link BufferedReader}
	 */
	public static void main(String[] args) throws IOException {
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
	private static void readAndWriteToSystemOut() throws IOException {
		try (FileInputStream fis = new FileInputStream(SHAKESPEARE_FILEPATH);
				BufferedReader buffer = new BufferedReader(
						new InputStreamReader(fis))) {
			String line; // copied from CodeEval
			while ((line = buffer.readLine()) != null) { // copied from CodeEval
				System.out.println(line);
			}
		}
		// buffer.close(); // Try-with-resources closes automatically (new to
		// Java 7+)
		// fis.close();

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
	private static void writeFileReplacingPunctuationWithLinebreaks()
			throws IOException {
		try (FileInputStream fis = new FileInputStream(SHAKESPEARE_FILEPATH);
				BufferedReader buffer = new BufferedReader(
						new InputStreamReader(fis))) {
			String line; // copied from CodeEval
			while ((line = buffer.readLine()) != null) { // copied from CodeEval
				prose += line;
			}
		}
		// buffer.close();
		// fis.close();
		PunctuationStripper shakespeare = new PunctuationStripper(prose);
		shakespeare.stripPunctuation();
		// shakespeare.trimString(); // if stripPunctuation() isn't written to
		// also trim
		String newFileNameNoExt = SHAKESPEARE_FILEPATH.substring(0,
				(SHAKESPEARE_FILEPATH.length() - 4)); // As an alternative to
														// hardcoding a path to
														// a new file
		// http://stackoverflow.com/questions/2885173/how-to-create-a-file-and-write-to-a-file-in-java
		try (PrintWriter writer = new PrintWriter(newFileNameNoExt
				+ "_Stripped.txt")) {
			writer.println(shakespeare.getStrippedString());
		}
		// writer.close();

	}

	/**
	 * <p>
	 * TODO try to read a file that doesn't exist, catch the exception that is
	 * thrown, then write an error to {@link System#err} (same syntax as writing
	 * to {@link System#out})
	 * </p>
	 * 
	 * <p>
	 * TODO Close the {@link BufferedReader} you use in a finally block
	 * </p>
	 */

	// I tried the try-with-resources (Java 7+) to automatically close without
	// "finally"
	private static void tryToReadAFileThatDoesntExist() {
		try (FileInputStream fis = new FileInputStream(
				"C:\\Users\\WeCanCodeIT\\OneDrive\\Documents\\WeCanCodeIT\\Repo\\java-cbus-reading-the-bard\\src\\main\\resources\\YorickNoFile.txt");
				BufferedReader buffer = new BufferedReader(
						new InputStreamReader(fis))) {
			String line; // copied from CodeEval
			while ((line = buffer.readLine()) != null) { // copied from CodeEval
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// finally {
		// if (buffer != null) {
		// System.out.println("Closing BufferedReader");
		// buffer.close();
		// } else {
		// System.out.println("BufferedReader not open");
		// }
	}

}
