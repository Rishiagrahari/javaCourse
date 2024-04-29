package com.altran.training.weekthird.exceptionhandling;

import java.io.*;

//Program to demonstrate finally block
class ExceptionDemoFinally {
	/**
	 * 
	 * @param args: Array of String
	 */
	public static void main(String[] args) {
		int total = 0;
		FileReader reader = null;
		try {
			//open the file if exists
			reader = new FileReader("MyFile.txt");
			//read the contents of the file
			while (reader.read() != -1)
				++total;
			System.out.println("Total characters in the file " + total);
		} catch (FileNotFoundException fe) {
			System.out.println("MyFile.txt not found...");
		} catch (IOException ie) {
			System.out.println("Cannot read from MyFile.txt...");
		} finally {
			System.out.println("Closing the reader in the finally block...");
			try {
				//close the file if opened
				reader.close();
			} catch (NullPointerException npe) {
				System.out.println("File is not existing,so can't close the file");
			} catch (IOException ie) {
				System.out.println("Unable to close the reader...");
			}
		}
	}
}
