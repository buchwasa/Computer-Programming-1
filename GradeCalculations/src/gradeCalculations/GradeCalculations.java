package gradeCalculations;

public class GradeCalculations {

	public static void main(String[] args) {
		double firstScore, secondScore, thirdScore;
		double averageTestScore;

		firstScore = 92.5;
		secondScore = 95.3;
		thirdScore = 86.5;

		averageTestScore = (firstScore + secondScore + thirdScore) / 3;
		System.out.println("Average test score is: " + averageTestScore);
	}
}
