package com.altran.training.weekthird.exceptionhandling;

//Program to demonstrate unchecked-exception propagation
public class ExceptionPropagationDemo {
	/**
	 * 
	 * @param args:Array
	 *            of String
	 */
	public static void main(String args[]) {
		// calling static method
		printAverage(100, 0);
		System.out.println("This message never gets printed as the exception is not handled");
	}

	/**
	 * 
	 * @param totalSum
	 * @param totalNumber
	 */
	public static void printAverage(int totalSum, int totalNumber) {
		// calling static function
		int average = computeAverage(totalSum, totalNumber);
		System.out.println("Average = " + totalSum + "/" + totalNumber + "=" + average);
		System.out.println("Exit printAverage()");
	}

	public static int computeAverage(int sum, int number) {
		System.out.println("Computing Average  ");
		return sum / number;// divide by 0 exception occurred.
		/*
		 * The exception is a unchecked exception and is not handled in this function so
		 * is propagated to the calling function which is printAverage.In printAverage,
		 * the exception is not handled thus throwing the exception back to main
		 * function finally terminating the program abruptly.
		 */
	}
}
