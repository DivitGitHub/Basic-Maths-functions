package com.divit.ngoc.basics.math;

public class Factorial {

	/*
	 * Returns factorial of desired number Example 7! = 7*6*5*4*3*2...
	 * 
	 * @param finds the factorial of int
	 * 
	 * @return long, if integer is negative, it will return -1;
	 */
	public int getFactorial(int number) {
		int result = 1;
		for (int i = 2; i <= number; i++) {
			result = result * i;
		}
		return result;
	}
}