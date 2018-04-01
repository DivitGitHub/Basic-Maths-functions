
public class Factorial {
	
	public static void main(String[] args) {
		//Example: finds the factorial of 7
		System.out.println(factorial(7)); //prints 5040
	}
	
	/*
	*Returns factorial of desired number
	*Example 7! = 7*6*5*4*3*2...
	*@param finds the factorial of int
	*@return long, if integer is negative, it will return -1;
	*/
	public static int factorial(int number) {
		int result = 1;
		for(int i = 2; i <= number; i++) {
			result = result*i;
		}
		return result;
	}
}
