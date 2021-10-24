package passwordGenerator;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		String password = "";
		int passwordLength;
		Random random = new Random(42); // Seed of 42
		String randomCharacter;
		int randomIndex;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a password length:");
		passwordLength = scanner.nextInt();

		for (int i = 1; i <= passwordLength; i++) {
			randomIndex = random.nextInt(characters.length()); // Random int with the bound of 'characters' variable
			randomCharacter = characters.substring(randomIndex, randomIndex + 1); // Gets a character from the random
			// index
			password += randomCharacter;
		}

		System.out.println("Your password is: " + password);
		scanner.close();
	}
}
