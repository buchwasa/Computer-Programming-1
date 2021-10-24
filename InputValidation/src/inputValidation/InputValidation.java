package inputValidation;

import java.util.Scanner;

public class InputValidation {

	public static void main(String[] args) {
		String userPassword;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			userPassword = scanner.nextLine();
			userPassword = userPassword.trim();
			System.out.println("Password: " + userPassword);

			if (userPassword.equals("QUIT")) {
				break;
			}

			if (userPassword.length() < 8) {
				continue;
			}

			if (userPassword.indexOf("!") == -1) {
				continue;
			}

			System.out.println("Your password is valid.");
		}
		scanner.close();
	}
}
