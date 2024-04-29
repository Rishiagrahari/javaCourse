package com.altran.training.weekthird.exceptionhandling;

public class Rethrowing {
	public static void y() throws Exception {
		System.out.println("originating the exception in y()");
		//throwing an exception using throw
		throw new Exception("thrown from y()");
	}

	public static void x() throws Exception {
		try {
			//calling static method
			y();
		} catch (Exception e) {
			System.err.println("Inside x(),e.printStackTrace()");
			e.printStackTrace();
			//rethrowing the exception
			throw e;
		}

	}

	public static void main(String[] args) throws Throwable {
		try {
			//calling static method
			x();
		} catch (Exception e) {
			System.err.println("Caught in main, e.printStackTrace()");
			e.printStackTrace();

		}

	}
}