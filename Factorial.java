
public class Factorial {
	
	public static void main(String[] args) {
		System.out.println(factorial(7));
	}
	
	public static long factorial(int number) {
		if (number == 1 || number == 0) {
			return 1;
		}
		return number * factorial(number-1);	
	}
}
