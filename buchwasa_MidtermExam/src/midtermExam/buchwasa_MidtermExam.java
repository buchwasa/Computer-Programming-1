package midtermExam;

import java.util.Scanner;

public class buchwasa_MidtermExam {

	public static void main(String[] args) {
		double costPerGallon = 0.0;
		double gallonsPerTank = 0.0;
		double totalCostToFillTank = 0.0;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the cost per gallon:");
			costPerGallon = scanner.nextDouble(); // Reads the keyboard input and sets the value.
			if (costPerGallon == 0) { // Break from the loop if gas is free.
				break;
			}
			System.out.println("Enter the amount (in gallons) of gas it takes to fill your tank:");
			gallonsPerTank = scanner.nextDouble(); // Reads the keyboard input and sets the value.
			totalCostToFillTank = costPerGallon * gallonsPerTank; // Determines the total cost to fill your tank.
			System.out.printf("The total cost to fill your tank is $%.2f\n", totalCostToFillTank);
		}

		scanner.close();
	}
}
