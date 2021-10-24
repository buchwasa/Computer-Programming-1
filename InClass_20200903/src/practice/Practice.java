package practice;

public class Practice {

	public static void main(String[] args) {
		// Contains age of a person in years.
		int ageInYears;
		// Joey Votto's salary for this season.
		double vottoSalary;
		// Joey Votto's walkup song.
		String vottoWalkupSong;
		// Joey Votto's uniform munber
		int vottoUniformNumber;

		// Assign 36 to Joey's age.
		ageInYears = 36;
		// Assign Joey's annual salary
		vottoSalary = 20_000_000.;
		// Assign the name of Joey's walk-up song
		vottoWalkupSong = "Como La Flor";
		// Assign Joey's uniform number
		vottoUniformNumber = 19;

		// Gives Joey a 10% raise
		vottoSalary = vottoSalary * 1.10;

		System.out.println("Age: " + ageInYears);
		System.out.printf("Salary: %.2f\n", vottoSalary);
		System.out.println("Walkup Song: " + vottoWalkupSong);
		System.out.println("Uniform Number: " + vottoUniformNumber);
	}
}
