/***********************************************************************
Altran Technologies Proprietary

This source code is the sole property of Altran Technologies. Any form of utilization
of this source code in whole or in part is  prohibited without  written consent from
Altran Technologies

File Name				   :RunTimeExceptionDemo.java
Principal Author			   :Shivani
Subsystem Name                :Core Java Training
Module Name                   :
Date of First Release         :19-Mar-2020 9:10:00 a.m.
Author                           :Shivani
Description                : Example to demonstrate try-catch block


Change History

Version                      :1.0
Date(DD/MM/YYYY)            :19-Mar-2020
Modified by                 :Shivani
Description of change       :Initial Version

***********************************************************************/

package com.altran.training.weekthird.exceptionhandling;

/**
 * Example to demonstrate try-catch block
 * 
 * @see RunTimeExceptionDemo
 * @author GUR57489
 * @since 19-Mar-2020 9:10:00 a.m.
 *
 */
class RunTimeExceptionDemo {
	public static void main(String args[]) {
		// declaration and initialization of local variables
		int a = 0;
		int b = 10;
		int c;
		//try-catch block
		try {
			System.out.println("hi");
			c = b / a;
			// This line will not be executed if exception occurs
			System.out.println("Value of c is " + c); 
		
		} catch (ArithmeticException e) {
			System.out.println("Divided by zero");
		}
		System.out.println("After exception is handled");
	}
}
