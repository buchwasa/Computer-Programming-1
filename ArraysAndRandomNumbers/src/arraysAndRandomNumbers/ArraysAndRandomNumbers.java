package arraysAndRandomNumbers;

import java.util.Random;

public class ArraysAndRandomNumbers {

	public static void main(String[] args) {
		Random random = new Random(42);
		int[] randomScores = new int[1000];
		int sum = 0;
		int upperBound = 0;
		while (upperBound < randomScores.length) {
			randomScores[upperBound] = random.nextInt();
			upperBound++;
		}

		for (int i = 0; i < randomScores.length; i++) {
			sum += randomScores[i];
		}
		System.out.println("Sum of random scores: " + sum);
	}
}
