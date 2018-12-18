package com.divit.ngoc.basics.math;

public class PrimeNumberChecker {

	/*
	 * returns true if the param is a prime
	 * 
	 * @param check the number
	 * 
	 * @return returns boolean
	 */
	public boolean isPrimeNumber(int number) {
		if (number <= 1) {
			return false;
		} else if (number == 2) {
			return true;
		}

		// If it's even, it's not a prime number
		if (number % 2 == 0) {
			return false;
		}

		// No need to check for multiples after the square root of the param.
		int sqrtOfNumber = (int) Math.sqrt(number);

		// Checks either the number could be divided...
		// Starts iterating odd numbers
		for (int i = 3; i <= sqrtOfNumber; i += 2) {
			if (number % i == 0) {
				// If it could be divided, it's not a prime number
				return false;
			}
		}

		return true;
	}
}