package pokemonAbility;

import java.util.Scanner;

public class PokemonAbility {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // initializes the scanner

		System.out.println("Please type in the Pokemon ability:");
		switch (scanner.nextLine().toLowerCase()) { // Reads the line from the scanner & lowercases the line.
		case "drizzle":
			System.out.println("Activates rain when the Pok�mon enters battle.");
			break;
		case "limber":
			System.out.println("The Pok�mon cannot be paralyzed.");
			break;
		case "trace":
			System.out.println("Copies an opposing Pok�mon's Ability.");
			break;
		case "torrent":
			System.out.println("Powers up Water-type moves when the Pok�mon's HP is low.");
			break;
		case "swarm":
			System.out.println("Powers up Bug-type moves when the Pok�mon's HP is low.");
			break;
		default:
			System.out.println("Unknown Pokemon ability!");
			break;
		}

		scanner.close();
	}
}
