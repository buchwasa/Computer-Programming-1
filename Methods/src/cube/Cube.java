package cube;

public class Cube {

	public static void main(String[] args) {
		int alpha = 3;
		int answer = cube(alpha);
		System.out.println("The cube of " + alpha + " is " + answer);

		boolean isNumberEven;
		int beta = 13;
		isNumberEven = isEven(beta);
		System.out.println(beta + " is " + (isNumberEven ? "" : "not") + " even");
	}

	/**
	 * Takes the parameter "number" and cubes it.
	 * 
	 * @param number - The number to be cubed.
	 * @return - The cubed number.
	 */
	public static int cube(int number) {
		return number * number * number;
	}

	/**
	 * Checks whether an integer is even or not.
	 * 
	 * @param number - The number to be checked.
	 * @return - true if even number
	 */
	public static boolean isEven(int number) {
		return number % 2 == 0;
	}
}
