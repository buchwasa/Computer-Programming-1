package assignment08;

public class buchwasa_Assignment08 {

	public static void main(String[] args) {
		String[] items = new String[10];
		items[0] = "Life";
		items[1] = "Coding";
		items[2] = "Sleeping";
		items[3] = "Reading";
		items[4] = "Pokemon";
		items[5] = "Music";
		items[6] = "Star Wars";
		items[7] = "Linux";
		items[8] = "Olive Garden";
		items[9] = "Home";

		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i]);
		}

		System.out.println("****");

		int bound = 0;
		while (bound < items.length) {
			System.out.println(items[bound]);
			bound++;
		}

		System.out.println("****");

		int sum = 0;
		for (int i = 0; i < items.length; i++) {
			sum += items[i].strip().length(); // Gets the length of the string and adds it to sum
		}
		System.out.println("Length of items: " + sum);
	}
}
