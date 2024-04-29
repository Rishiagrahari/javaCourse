package com.altran.training.weekthird.exceptionhandling;

public class ThrowKeyword {
	/**
	 * 
	 * @param age:
	 *            Person's age
	 */
	static void validateAge(int age) {
		// condition check, if age is less than 18 ,then throw the exception
		if (age < 18)
			throw new ArithmeticException("not a valid age");
		else
			System.out.println("welcome to the voting application");
	}

	/**
	 * 
	 * @param args:
	 *            Array of String
	 */
	public static void main(String args[]) {
		// method call by passing age as an argument
		validateAge(15);
		System.out.println("other instructions...");
	}
}