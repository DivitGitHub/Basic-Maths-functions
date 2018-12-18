package com.divit.ngoc.basics.math;

/*
 * Finds the greatest common factor of two numbers
 */
public class GreatestCommonFactor {

	public int getGcf(int firstNumber, int secondNumber) {
		if (firstNumber == secondNumber) {
			return firstNumber;
		}

		if (firstNumber > secondNumber) {
			firstNumber = factor(firstNumber);
		} else {
			secondNumber = factor(secondNumber);
		}

		return getGcf(firstNumber, secondNumber);
	}

	private int factor(int number) {
		for (int i = number - 1; i > 0; i--) {
			if (number % i == 0) {
				return i;
			}
		}
		return -1; // If there's no factor, return -1;
	}
}