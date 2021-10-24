package assignmentMovie;

public class AssignmentMovie {

	public static void main(String[] args) {
		double totalPaidToActors = 10_000_000.00;
		double totalPaidToAdvertise = 5_000_000.00;
		double totalPaidToOther = 500_000.00;
		int ticketsSold = 100_000_000;
		double costOfTickets = 15.00;

		double profit;
		profit = (ticketsSold * costOfTickets) - (totalPaidToActors + totalPaidToAdvertise + totalPaidToOther);
		System.out.printf("A movie made: $%.2f\n", profit);
	}

}
