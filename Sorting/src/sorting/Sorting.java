package sorting;

import java.util.Arrays;
import java.util.Random;

public class Sorting {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		Random random = new Random(31);

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt();
		}
		Arrays.sort(numbers);
	}
}
