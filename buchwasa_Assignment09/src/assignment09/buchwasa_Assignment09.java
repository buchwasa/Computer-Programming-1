package assignment09;

import java.util.ArrayList;
import java.util.Scanner;

public class buchwasa_Assignment09 {

	public static void main(String[] args) {
		ArrayList<String> hallmarkChristmasMovies = new ArrayList<String>();
		String myFavoriteHallmarkChristmasMovie;
		Scanner scanner = new Scanner(System.in);
		hallmarkChristmasMovies.add("A Gift to Remember");
		hallmarkChristmasMovies.add("A Timeless Christmas");
		hallmarkChristmasMovies.add("A Perfect Christmas");
		hallmarkChristmasMovies.add("Christmas Cookies");
		hallmarkChristmasMovies.add("Christmas Land");
		System.out.println("Enter your favorite Hallmark Christmas Movie:");
		// Adds user input to myFavoriteHallmarkChristmasMovie
		myFavoriteHallmarkChristmasMovie = scanner.nextLine();
		// User input is then added to the list
		hallmarkChristmasMovies.add(myFavoriteHallmarkChristmasMovie);
		for (int i = 0; i < hallmarkChristmasMovies.size(); i++) {
			// Prints the contents of hallmarkChristmasMovies
			System.out.println(hallmarkChristmasMovies.get(i));
		}

		int bound = 0;
		int moviesWithChristmas = 0;
		while (bound < hallmarkChristmasMovies.size()) {
			// Checks if the string contains "Christmas" and adds it to the count
			if (hallmarkChristmasMovies.get(bound).contains("Christmas")) {
				moviesWithChristmas++;
			}
			bound++;
		}
		System.out.println("Movies containing Christmas: " + moviesWithChristmas);
		hallmarkChristmasMovies.clear(); // Clears the array list
		System.out.println("Hallmark Christmas Movie array size: " + hallmarkChristmasMovies.size());
		scanner.close();
	}
}
