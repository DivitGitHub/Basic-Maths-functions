import java.util.LinkedList;
import java.util.List;

/*
 * Finds the greatest common factor of two numbers
 */
public class GreatestCommonFactor {

	public static void main(String[] args) {
		// Example: two numbers in memory
		int firstNumber = 44;
		int secondNumber = 77;

		// Example: finding the factors of the two numbers
		List<Integer> factorList1 = factors(firstNumber);
		List<Integer> factorList2 = factors(secondNumber);
 
		System.out.println("Factor of " + firstNumber + ": " + factorList1);	//prints Factor of 44: [1, 2, 4, 11, 22, 44]
		System.out.println("Factor of " + secondNumber + ": " + factorList2);	//prints Factor of 77: [1, 7, 11, 77]
		
		int lastElementOfList = gcfOfTwoNumbers(factorList1, factorList2);
				
		System.out.println("The greatest common factor of "+ firstNumber + " and " + secondNumber + " is: "+ lastElementOfList);
		//prints The greatest common factor of 44 and 77 is: 11
	}

	public static List<Integer> factors(int number) {
		List<Integer> factorList = new LinkedList<>();
		if (number <= 0) {
			// returns null if number is 0 or negative.
			return factorList;
		}
		
		//adds numbers that's a factor of the number in order.
		int halfOfNumber = number / 2; // no need to look for factors above the
										// halfway point
		for (int i = 1; i <= halfOfNumber; i++) {
			if (number % i == 0) {
				factorList.add(i);
			}
		}

		// adds factors at the end of the linked list in order
		factorList.add(number);
		return factorList;
	}
	
	//only works if the list is sorted
	//extracting the last element of gcfList(which is the greatest due to the order of factors we added)
	public static int gcfOfTwoNumbers(List<Integer> list1, List<Integer> list2) {
		if (list1.isEmpty() || list2.isEmpty()) {
			return -1;
		} 
		
		//removes elements that's not in both of the list
		list1.retainAll(list2);
		
		return list1.get(list1.size()-1);
	}
}
