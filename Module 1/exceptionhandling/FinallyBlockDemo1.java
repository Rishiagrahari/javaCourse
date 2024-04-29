package com.altran.training.weekthird.exceptionhandling;

//Program to demonstrate finally block
public class FinallyBlockDemo1 {
	/**
	 * 
	 * @param args: Array of String
	 */
	public static void main(String[] args) {
		int quotient=0;
		//try-finally block
		try {
			/*
			 * JVM will throw ArithmeticException for this statement,
			 * which we are not handling using catch block,even then 
			 * finally block will get executed
			 */
			quotient = 10 / 0;
			System.out.println("Quotient is "+quotient);
		} 
		catch(ArithmeticException e)
		{
			System.out.println("Excp handled");
		}
		finally {
			System.out.println("I am from finally block");
		}
		System.out.println("main ends");
	}
}
