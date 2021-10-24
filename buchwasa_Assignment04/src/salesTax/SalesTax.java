package salesTax;

import java.util.Scanner;

public class SalesTax {

	public static void main(String[] args) {
		double salesTaxPercentage = 0.07;
		double salesTax;
		double totalBill;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Olive Lobster!"); // I'm not creative, so enjoy my attempt
		System.out.print("Please submit your total bill: $");
		totalBill = scanner.nextDouble();

		salesTax = totalBill * salesTaxPercentage;
		System.out.printf("Your bill with sales tax is: $%.2f\n", totalBill + salesTax);
		System.out.printf("The sales tax is: $%.2f\n", salesTax);

		double exampleTip = totalBill * 0.15;
		System.out.printf("Your bill with a 15 percent tip would look like: $%.2f\n", totalBill + exampleTip);

		System.out.print("How much would you like to tip (0-100)? ");
		int inputPercentage = scanner.nextInt();
		if (inputPercentage < 0 || inputPercentage > 100) {
			System.out.println("Invalid percentage: " + inputPercentage + "! Please enter a number 0-100.");
		} else {
			double inputTip = totalBill * (inputPercentage / 100.0);
			System.out.printf("Your total is $%.2f, including tax and tip, thanks for stopping by!",
					totalBill + salesTax + inputTip);
		}

		scanner.close();
	}
}
