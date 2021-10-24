package practice;

public class Practice {

	public static void main(String[] args) {
		int alpha;
		double delta;
		String epsilon;

		alpha = Integer.MAX_VALUE;
		System.out.println("Max Alpha: " + alpha);
		alpha += 1;
		System.out.println("Overflow Alpha: " + alpha);
		alpha = Integer.MIN_VALUE;
		System.out.println("Min Alpha: " + alpha);
		alpha -= 1;
		System.out.println("Underflow Alpha: " + alpha);

		delta = 42.0;
		delta /= 0;
		System.out.println("0 Division Delta: " + delta);
		delta += 1;
		System.out.println(delta);

		delta = 4 / 5; // Integer division
		System.out.println("Integer Delta: " + delta); // outputs 0.0
		delta = 4.0 / 5; // Preserves decimal place
		System.out.println("Floating Point Delta: " + delta);

		epsilon = "42";
		System.out.println("Epsilon: " + epsilon);
		epsilon = "42" + 1; // Converts integer to string and joins the two together.
		System.out.println(epsilon);

		// We have 4 arithmetic operators: + - * /
		// One more: %, the mod or modulus operator. It's integer remainder
		alpha = 100 % 30; // integer remainder of 100 / 30
		System.out.println("100 % 30: " + alpha);
		alpha = 100 % 10;
		System.out.println("100 % 10: " + alpha);
	}
}
