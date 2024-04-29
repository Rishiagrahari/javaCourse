package com.altran.training.weekthird.exceptionhandling;

/**
 * Demo of the exceptions being handled.
 * 
 * @author GUR40073
 *
 */
public class UncheckedExceptions {
	/**
	 * The divide() method is capable of throwing ArithmeticException (division by
	 * zero). The exception is handled here with the help of try-catch block try{
	 * Code which is capable of generating an exception } catch(<ExceptionClassName>
	 * obj){ Exception Handling Code } As soon as an exception is generated in try
	 * block, corresponding Exception class object is created and thrown to the
	 * matching catch.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static double divide(int a, int b) {
		double quotient = 0;
		try {
			quotient = (a) / b;
		} catch (ArithmeticException e) {
			System.out.println(" Divisor is zero");
		}

		return quotient;

	}

	/**
	 * Main is cabable of throwing two exceptions - if less than 2 arguments are
	 * passed through command prompt, ArrayIndexOutOfBoundsException if any of the
	 * passed String is not digit-based, can't be parsed - NumberFormatException One
	 * try can have multiple catches associated with it, But only one catch will be
	 * executed depending on which exception is generated. Once control goes to the
	 * catch block, it can never come back to try block.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			double ans = divide(a, b);
			System.out.println("The quotient is " + ans);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please enter commandline arguments");

		} catch (NumberFormatException e) {
			System.out.println(" Please enter an integer only ...");

		}
		catch (Exception e) {
			System.out.println(" Please enter an integer only ...");

		}
		System.out.println("Main ends");
	}
}
