package buchwasa_InClassAssignment20201008;

import java.util.Scanner;

public class CountingNumbers {

	public static void main(String[] args) {
		int positiveCount = 0;
		int negativeCount = 0;
		int sum = 0;
		double average = 0.0;
		int userInput = 0;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Please enter a number: ");
			userInput = scanner.nextInt();
			if (userInput == 0) { // Terminates the loop
				break;
			}

			if (userInput < 0) { // less than 0, add to negative count
				negativeCount++;
			} else { // greater than 0, add to positive count
				positiveCount++;
			}

			sum += userInput;
		}

		average = (double) sum / (positiveCount + negativeCount);
		System.out.println(
				"Average: " + average + " Sum: " + sum + " Positive: " + positiveCount + " Negative: " + negativeCount);
		scanner.close();
	}
}
