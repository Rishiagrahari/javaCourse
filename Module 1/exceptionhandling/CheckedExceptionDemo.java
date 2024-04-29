package com.altran.training.weekthird.exceptionhandling;

/* Try compiling the given code after uncommenting. It will not compile because the code throws Checked Exceptions
which are not handled here. Try Exception Handling in the code
*/

import java.io.*;

class CheckedExceptionDemo {
	public static void main(String[] args) {
		int total = 0;
		FileReader reader = null;
		try {
			reader = new FileReader("MyFile.txt");
			while (reader.read() != -1)
				++total;
			System.out.println("Total characters in the file " + total);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
