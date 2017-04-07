import java.util.Scanner;

public class PrimeNumbersCheckerAndGenerator {
	
	////// Prime number checker and generator //////
	///// PLEASE RUN PROGRAM //////
	
	
	public static void main(String[] args) {
		System.out.println("Type 1 to check prime number or type 2 to generate prime number list: ");
		
		boolean loop = true;
		Scanner typeInput = new Scanner(System.in);

		while (loop == true) {
			switch (typeInput.next()) {
			case "1":
				System.out.println("Please enter an integer you would like to check: ");
				primeNumberChecker();
				loop=false;
				break;
			case "2":
				System.out.println("Please enter an integer to generate a prime number list: ");
				primeNumberGenerator();
				loop=false;
				break;
			default:
				System.out.println("Please enter 1 or 2:");
			}
		}
		typeInput.close();
	}

	private static void primeNumberChecker() {
		Scanner input = new Scanner(System.in);

		if (input.hasNextInt()) {
			int number = input.nextInt();
			
			if (number > 0) {
			primeNumberChecker(number);
			System.out.println();
			System.out.println("Please enter another integer you would like to check: ");
			} else if (number <= 0) {
				System.out.println("Please enter a positive integer: ");
			}
		

		} else  {
			System.out.print("Not an integer. ");
		System.out.println("Please enter an integer: ");
		};

		primeNumberChecker();
		input.close();
		
	}

	private static void primeNumberChecker(int number) {
		int halfOfNumber = number / 2;
		boolean prime = true;

		if (number == 2) {
			System.out.println(number + " is a prime number");
		} else

			for (int i = 3; i <= halfOfNumber; i = i + 2) {
				if (number % i == 0) {
					System.out.println(number + " is not a prime number");
					prime = false;
					break;
				}
			}
		if (prime == true) {
			System.out.println(number + " is a prime number");
		}

	}

	private static void primeNumberGenerator() {
		Scanner input = new Scanner(System.in);

		if (input.hasNextInt()) {
			int number = input.nextInt();
			if (number > 0) {
				primeNumberGenerator(number);
			} else {
				System.out.println("Not a positive integer.");
				System.out.println("Please enter a positive integer: ");

				primeNumberGenerator();
			}

		} else {
			System.out.println("Not an integer.");
			System.out.println("Please enter an integer: ");

			primeNumberGenerator();
		}


		input.close();
	}

	private static void primeNumberGenerator(int number) {

		int i = 2;
		int halfOfi;
		int count = 0;

		boolean prime;

		for (i = 2; i <= number; i++) {
			halfOfi = i / 2;
			prime = true;

			for (int k = 2; k <= halfOfi; k++) {
				if (i % k == 0) {
					prime = false;
					break;
				}

			}
			if (prime == true) {

				System.out.printf("%4d, ", i);
				count++;
				if (count % 25 == 0) {
					System.out.println("");
				}
			}
		}
		System.out.println();
		System.out.println("prime numbers count: " + count);

	}

}
