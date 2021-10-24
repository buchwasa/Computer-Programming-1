package qualityPoints;

import java.util.Scanner;

public class QualityPoints {

	public static void main(String[] args) {
		String finalGrade;
		Scanner scanner = new Scanner(System.in);
		int qualityPoints;

		System.out.print("Enter your final grade: ");
		finalGrade = scanner.nextLine();

		switch (finalGrade.toUpperCase()) {
		case "A":
			qualityPoints = 4;
			break;
		case "B":
			qualityPoints = 3;
			break;
		case "C":
			qualityPoints = 2;
			break;
		case "D":
			qualityPoints = 1;
			break;
		case "F":
			qualityPoints = 0;
			break;
		default:
			System.out.println("Invalid grade entered.");
			qualityPoints = -1;
			break;
		}

		if (qualityPoints != -1) {
			System.out.println(
					"You entered: " + finalGrade.toUpperCase() + ". Quality points from that grade: " + qualityPoints);
			System.out.println("Quality points: " + qualityPoints);
		} else {
			System.out.println("Unable to calculate quality points due to invalid grade.");
		}

		scanner.close();
	}

}
