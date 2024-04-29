package com.altran.training.weekthird.exceptionhandling;

//Program to demonstrate throw statement
class ThrowDivisionErrorDemo {
	public static double divide(int a, int b) {
		double quotient = 0;
		try {

			if (b == 0) {
				//if denominator is 0, throw  the exception
				throw new ArithmeticException(" Division By zero error thrown");
			}
			quotient = (a) / b;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage() + "\n Divisor is zero");
		}

		return quotient;

	}

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		try {

			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);

		} catch (NumberFormatException e) {
			System.out.println(" Please enter an integer only ...");
			System.exit(0);
		}
		double ans = divide(a, b);
		System.out.println("The quotient is " + ans);
	}
}
