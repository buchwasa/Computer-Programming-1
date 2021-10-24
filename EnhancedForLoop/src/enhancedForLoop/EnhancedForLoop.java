package enhancedForLoop;

public class EnhancedForLoop {

	public static void main(String[] args) {
		String[] names = new String[5];
		names[0] = "Raet";
		names[1] = "Beanut";
		names[2] = "Bork";
		names[3] = "Catbe";
		names[4] = "Piggle";

		for (String name : names) {
			System.out.println(name);
		}
	}
}
