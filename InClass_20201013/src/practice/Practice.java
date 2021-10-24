package practice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		String deerName;
		Scanner scanner = new Scanner(System.in);

		deerName = scanner.nextLine();
		if (deerName.toLowerCase().indexOf("bambi") != -1) {
			System.out.println("Deer name is creepy because it has Bambi in it.");
		}

		int deerWeight;
		deerWeight = scanner.nextInt();
		if (deerWeight > 200) {
			System.out.println("Don't let the deer run you over when you're cutting the grass.");
		}

		scanner.close();
	}
}
