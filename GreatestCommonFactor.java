/*
 * Finds the greatest common factor of two numbers
 */
public class GreatestCommonFactor {

	public static void main(String[] args) {
		// Example: two numbers in memory
		int firstNumber = 44;
		int secondNumber = 77;

		System.out.println("The greatest common factor of "+ firstNumber + " and " + secondNumber + " is: "+ gcf(firstNumber, secondNumber));
		//prints The greatest common factor of 44 and 77 is: 11
	}
	
	public static int gcf(int firstNumber, int secondNumber) {
		if (firstNumber == secondNumber) {
			return firstNumber;
		}
		
		if (firstNumber > secondNumber) {
			firstNumber = factor(firstNumber);
		} else {
			secondNumber = factor(secondNumber);
		}
		
		return gcf(firstNumber, secondNumber);
	}
	
	private static int factor(int number) {
		for (int i = number - 1; i > 0; i--) {
			if (number % i == 0) {
				return i;
			}
		}
		return -1; // If there's no factor, return -1;
	}
}
