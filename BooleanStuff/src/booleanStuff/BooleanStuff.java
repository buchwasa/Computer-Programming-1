package booleanStuff;

public class BooleanStuff {

	public static void main(String[] args) {
		Boolean a, b, c;// , d;
		a = true;
		b = false;
		c = true;
		// d = true;

		if (a && b || c) {
			System.out.println("True");
		}

		if (b || c && !a) {
			// b would have to be true or c would have to be true AND a would have to be
			// false.
			// c is true and a is true so (c && !a) is false.
			// b is false so we know that (b) is false.
			System.out.println("True 2");
		}
	}
}
