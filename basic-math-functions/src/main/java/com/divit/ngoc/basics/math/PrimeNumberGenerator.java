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
	 * @return List of prime numbers, otherwise it'll return an empty list
	 * This can never be null.
	 */
	public List<Integer> generate(int number) {
		if (number <= 1) {
			return new ArrayList<>();
		}

		// To flag if the number is a prime number or not
		boolean isPrime = false;

		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		// Check every number starting from 3 to see if it's a prime or not...
		for (int i = 3; i <= number; i++) {

			// No need to check for multiples after the square root of the number we're
			// checking...
			int sqrtOfi = (int) Math.sqrt(i);
			isPrime = true;

			// If it can be divided, it sets isPrime to false and exits that loop.
			if (i % 2 == 0) {
				isPrime = false;
			}
			else {
				for (int k = 3; k <= sqrtOfi; k += 2) {
					if (i % k == 0) {
						isPrime = false;
						break;
					}
				}
			}

			if (isPrime) {
				list.add(i);
			}
		}
		return list;
	}
}
