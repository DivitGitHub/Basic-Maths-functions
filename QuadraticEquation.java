

public class QuadraticEquation {

	public static void main(String[] args) {

		// Example: solving 2x^2 + 4x + 2.
		double[] solutions = quadratic(2, 4, 2);

		// iterating through the array if solutions array is not null
		if (solutions != null) {
			for (double solution : solutions) {
				System.out.print(solution + ", "); // prints -1.0, -1.0, (both solutions are equal hence there's 1 solution)
			}
		} else {
			System.out.print("No real solutions");
		}
	}

	/*
	 * Solves quadratic equations by using the formula below.
	 *
	 * -b +- sqrt b^2 -4ac
	 *  ___________________
	 *  	 2a
	 *
	 * @param 3 int. Example: a=1, b = 2 and c = 3 from x^2 + 2x + 3;
	 * 
	 * @return 2 solutions in an array, or null if there's no solution.
	 */
	public static double[] quadratic(int a, int b, int c) {
		if (a <= 0) {
			return null;
		}

		double[] solutions = new double[2];

		int bSquaredMinus4ac = (int) Math.pow(b, 2) - (4 * a * c);

		// Return null since we cannot square root a minus number...
		if (bSquaredMinus4ac < 0) {
			return null;
		}

		double sqrtPart = Math.sqrt(bSquaredMinus4ac);

		double answer1 = (-b + sqrtPart) / (2 * a); // first solution
		double answer2 = (-b - sqrtPart) / (2 * a); // second solution

		solutions[0] = answer1;
		solutions[1] = answer2;

		return solutions;
	}

}
