package com.altran.training.weekthird.exceptionhandling;

// GUI layer
class GUIdemo {
	public static void GUI() {
		System.out.println("Login panel loaded");
		// calling controller layer method
		controlDemo.control();
	}
}

// Controller layer
class controlDemo {
	public static void control() {
		System.out.println("IN CONTROL()");
		System.out.println("User Name and password sent to BusinessLogic");
		try {
			// calling business logic layer method
			businessLogicDemo.businessLogic();
		} catch (ArithmeticException e) {
			System.out.println("Error handled in controlDemo.control().  Error Message is : " + e.getMessage());

		}
	}
}

// Business layer
class businessLogicDemo {
	public static void businessLogic() throws ArithmeticException {
		System.out.println("IN BUSINESSLOGIC()");
		System.out.println("User Name and password sent to database");
		// calling dao layer method
		databaseDemo.database();
	}
}

// Database layer
class databaseDemo {
	public static void database() throws ArithmeticException{
		System.out.println("IN DATABASE()");
		System.out.println("Some error occured in data retrieval");
		// throwing the exception
		throw new ArithmeticException("Error in retrieval from database");
	}
}

public class ThrowsDemo {
	/**
	 * Demonstration of Exception propagation
	 * 
	 * @param args:
	 *            Array of String
	 */
	public static void main(String[] args) {
		// calling static function
		GUIdemo.GUI();

	}
}
