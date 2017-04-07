
public class Factorial {
	
	public static void main(String[] args) {
		//Example: finds the factorial of 7
		System.out.println(factorial(7)); //prints 5040
	}
	
	/*
	*Example 7*6*5*4*3*2
	*@param finds the factorial of int
	*@return returns long
	*/
	public static long factorial(int number) {
		if (number == 1 || number == 0) {
			return 1;
		}
		
		//calls itself
		return number * factorial(number-1);	
	}
}
