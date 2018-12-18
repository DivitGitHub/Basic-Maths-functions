package com.divit.ngoc.basics.math;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator {

	/*
	 *
	 * Generates a list up to the parameter @number
	 *
	 * @param number
	 * 
	 * @return An ArrayList, it will return an empty list if there's no prime
	 * numbers
	 */
	public List<Integer> generate(int number) {
		List<Integer> list = new ArrayList<Integer>();

		// To flag if the number is a prime number or not
		boolean isPrime;

		// Check every number starting from 2 to see if it's a prime or not...
		for (int i = 2; i <= number; i++) {

			// No need to check for multiples after the square root of the number we're
			// checking...
			int sqrtOfi = (int) Math.sqrt(i);
			isPrime = true;

			// This checks if the int i can be divided(with no remainder)...
			// If it can be divided, it sets isPrime to false and exits that loop.
			for (int k = 2; k <= sqrtOfi; k++) {
				if (i % k == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				list.add(i);
			}
		}
		return list;
	}
}