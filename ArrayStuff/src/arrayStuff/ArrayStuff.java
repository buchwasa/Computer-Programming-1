package arrayStuff;

public class ArrayStuff {

	public static void main(String[] args) {
		int[] score = new int[19];
		score[0] = 2;
		score[1] = 6;
		score[2] = 2;
		score[3] = 3;
		score[4] = 2;
		score[5] = 1;
		score[6] = 2;
		score[7] = 2;
		score[8] = 6;
		score[9] = 2;
		score[10] = 3;
		score[11] = 2;
		score[12] = 1;
		score[13] = 2;
		score[14] = 2;
		score[15] = 6;
		score[16] = 2;
		score[17] = 3;
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("Sum of scores: " + sum);
	}
}
