package inClass_20200917;

import java.util.Scanner;

public class AreYouReadyForSomeFootball {

	public static void main(String[] args) {
		String name;
		int totalTouchdowns;
		double yardsPerCompletion;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the quarterback's name: ");
		name = scanner.nextLine();
		System.out.print("Enter total touchdowns: ");
		totalTouchdowns = scanner.nextInt();
		System.out.print("Enter yards per completion: ");
		yardsPerCompletion = scanner.nextDouble();

		if (totalTouchdowns > 4) {
			System.out.println("Bengals probably win.");
		} else {
			System.out.println("Bengals probably lose.");
		}

		if (yardsPerCompletion > 10.5) {
			System.out.println(name + " did a good job!");
		} else {
			System.out.println(name + " did not have a good game.");
		}

		double passesThrown = 25.0;
		double totalYardsGained = 225.0;

		System.out.println("Yards per attempt: " + totalYardsGained / passesThrown);
		scanner.close();
	}
}
