public class PrimeNumberChecker {

	public static void main(String[] args) {
		System.out.println(primeNumberChecker(37)); // returns true
	}

	/*
	 * returns true if the param is a prime
	 * @param check the number
	 * @return returns boolean
	 */
	public static boolean primeNumberChecker(int number) {
		if (number <= 1) {
			return false;
		} else if (number % 2 == 0) {
			// If it's even, this is not a prime number 
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
