package buchwasa_Assignment06;

import java.util.Scanner;

public class Assignment06 {

	public static void main(String[] args) {
		int high = 1024;
		int middle;
		int low = 0;
		int totalGuesses = 0;
		String input;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			middle = low + (high - low) / 2;

			System.out.println("Is your number higher than " + middle + "? (y/n)");

			totalGuesses++;
			input = scanner.nextLine().toLowerCase();
			if (input.equals("y")) {
				low = middle;
			} else {
				high = middle;
			}

			// This was intentional to reduce the code duplication.
			// I also dropped resetting middle, since that is not necessary, we don't modify
			// it at all.
			if ((high - low) == 1) {
				System.out.println("Your number is " + low);
				break;
			}
		}

		System.out.println("The program used " + totalGuesses + " guesses");
		scanner.close();
	}
}
