package printASquare;

public class PrintASquare {

	public static void main(String[] args) {
		int width = 10;
		// int height = 20;
		String squareBase = "*";
		for (int i = 0; i < width; i++) {
			System.out.print(squareBase);
		}
		System.out.println();
		System.out.print(squareBase);
		for (int i = 0; i < (width - 2); i++) {
			System.out.print(" ");
		}
		System.out.print(squareBase);
		System.out.println();
		for (int i = 0; i < width; i++) {
			System.out.print(squareBase);
		}
	}
}
