package com.altran.training.weekthird.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceStatement {
	/**
	 * 
	 * @param args:
	 *            Array of String
	 */
	public static void main(String[] args) {
		int total = 0;
		/*
		 * try-with-resource statement: No need to use the finally block to close the
		 * resources
		 */
		try (FileReader reader = new FileReader("MyFile.txt")) {
			// read the contents of the file
			while (reader.read() != -1)
				++total;
			System.out.println("Total characters in the file " + total);
		} catch (FileNotFoundException fe) {
			System.out.println("MyFile.txt not found...");
		} catch (IOException ie) {
			System.out.println("Cannot read from MyFile.txt...");
		}
	}
}
