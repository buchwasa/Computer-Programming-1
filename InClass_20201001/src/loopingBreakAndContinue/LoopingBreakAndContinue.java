package loopingBreakAndContinue;

public class LoopingBreakAndContinue {

	public static void main(String[] args) {
		int num = 100_000;
		while (true) {
			num /= 2;
			if (num == 0) {
				break;
			}
			System.out.println("Num: " + num);
		}
	}
}
