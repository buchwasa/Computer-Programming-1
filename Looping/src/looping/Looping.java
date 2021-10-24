package looping;

public class Looping {

	public static void main(String[] args) {
		double salary = 70_000.0;
		int years = 0;
		while (true) {
			years++;
			salary *= 1.05;

			if (salary > 1_000_000) {
				break;
			}
		}
		System.out.printf("Salary at retirement is $%.2f after %d years", salary, years);

		/*
		 * int i = 5; while(i > 0) { System.out.println("Hello World"); i -= 1; }
		 * 
		 * 
		 * //int i; for(int i = 0; i < 5; i++){ System.out.println("Hello World");
		 * System.out.println("i: " + i); } //System.out.println("After loop: " + i);
		 * 
		 * while (true) { //also an infinite loop
		 * 
		 * }
		 * 
		 * //Infinite loop for(;;){ //infinite System.out.println("Infinite Loop"); }
		 */
	}
}
