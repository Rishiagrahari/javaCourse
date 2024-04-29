package com.altran.training.weekthird.exceptionhandling;

//Creating user-defined exception
class InvalidAgeException extends Exception {
	InvalidAgeException(String s) {
		super(s);
	}
}

class UserDefinedException {
	/**
	 * 
	 * @param age:
	 *            Person's age
	 * @throws InvalidAgeException
	 */
	static void validate(int age) throws InvalidAgeException {
		if (age < 18)
			// if age is less than 18 , then throw user-defined exception
			throw new InvalidAgeException("not valid age");
		else
			System.out.println("welcome to vote");
	}

	/**
	 * 
	 * @param args:Array
	 *            of String
	 */
	public static void main(String args[]) {
		// try-catch statement
		try {
			validate(13);
		} catch (InvalidAgeException m) {
			System.out.println("Exception occured: " + m.getMessage());
		}

		System.out.println("rest of the code...");
	}
}