package passwordAnalysis;

import java.util.Scanner;

public class PasswordAnalysis {

	public static void main(String[] args) {
		int digitCount = 0;
		int letterCount = 0;
		int minLetters = 8;
		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();
		System.out.println("Your password is " + password.length() + " characters long.");
		for (int i = 0; i < password.length(); i++) {
			char character = password.charAt(i);
			if (Character.isLetter(character)) {
				letterCount++;
			}
			if (Character.isDigit(character)) {
				digitCount++;
			}
		}
		if (letterCount < minLetters) {
			System.out.println("Your password does not have enough letters!");
		}
		System.out.println("Number of letters: " + letterCount);
		System.out.println("Number of digits: " + digitCount);
		scanner.close();
	}
}
