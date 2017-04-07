import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator.OfDouble;

public class PrimeNumberGenerator {
	
	
	public static void main(String[] args) {
		
		//Example: find all the primes up to 40
		List<Integer> list = primeNumberGenerator(40);
		
		int count = 0;	//checking how prime numbers are there
		
		//iterate through the list
		for(Integer prime: list) {
			count++;
			System.out.print(prime+ " ");
		}
		
		System.out.println();
		System.out.println("Number of prime numbers: "+count);
		
	}
	
	/*
	 * generates a list up to the input
	 * @param check how many prime numbers are there up to the input
	 * @return list of prime numbers 
	 */
	public static List<Integer> primeNumberGenerator(int number) {
		List<Integer> list = new ArrayList<Integer>();
		
		boolean prime;	//To mark if the number is a prime number or not
		

		//check every number starting from 2 to see if it's a prime or not...
		for (int i = 2; i <= number; i++) {
			
			int sqrtOfi = (int)Math.sqrt(i);	//No need to check for multiples after the square root of the number we're checking...
			prime = true;	//set the boolean to true each iteration;

			//this checks if the int i can be divided(with no remainder)... if it can be divided, it sets the boolean prime to false and exits that loop.
			for (int k = 2; k <= sqrtOfi; k++) {
				if (i % k == 0) {
					prime = false;
					break;
				}
			}
			
			//if int cannot be divided, boolean prime stays true and therefore added to the array.
			if (prime == true) {
				list.add(i);
			}
		}
		return list;
	}
	
}
