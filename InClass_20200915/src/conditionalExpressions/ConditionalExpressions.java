package conditionalExpressions;

import java.util.Scanner;

public class ConditionalExpressions {

	public static void main(String[] args) {
		int alpha = 42;
		int beta;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a value for alpha: ");
		if (!scanner.hasNextInt()) {
			System.out.print("Not an int.");
			scanner.close();
			return;
		}
		alpha = scanner.nextInt();
		System.out.print("Enter a value for beta: ");
		beta = scanner.nextInt();
		if (alpha == 43 && beta == 42) {
			System.out.print("True");
		} else {
			System.out.print("False");
		}
		scanner.close();
	}
}
