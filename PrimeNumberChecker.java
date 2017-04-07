public class PrimeNumberChecker {

	public static void main(String[] args) {
		System.out.println(primeNumberChecker(37)); // returns 
	}

	/*
	 * returns true if the param is a prime
	 * @param check the number
	 * @return returns a boolean
	 */
	private static boolean primeNumberChecker(int number) {
		int sqrtOfNumber = (int) Math.sqrt(number);	//No need to check for multiples after the square root of the param.

		//edge case
		if (number <= 1) {
			return false;
		}
		
		//checks either the number could be divided...
		//starts iterating from 2 since all numbers could be divided by 1;
		for (int i = 2; i <= sqrtOfNumber; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}
}
