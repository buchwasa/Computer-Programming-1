package assignment11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class buchwasa_Assignment11 {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		int[] letterCount = new int[26];
		
		for (int i = 0; i < letterCount.length; i++) {
			letterCount[i] = 0; //Initializes all 26 keys in letterCount to 0
		}
		
		try {
			FileReader reader = new FileReader("english.txt"); //Open english.txt
			BufferedReader bufferedReader = new BufferedReader(reader);
			while (true) {
				String data = bufferedReader.readLine();
				if (data == null) { // Break out of the loop if there are no remaining words
					break;
				}
				words.add(data);
			}
			
			reader.close();
			
			for (String word : words) {
				// Gets the starting letter in the array and lowercases it.
				String beginningLetter = Character.toString(word.charAt(0)).toLowerCase();
				char letterAsChar = beginningLetter.charAt(0); // Convert that lowercase letter to a char.
				// This takes the char and subtracts it by the char 'a', which will return 0 for a, 1 for b, etc.
				int letterInArray = letterAsChar - 'a';
				letterCount[letterInArray]++;
			}
			
			for (int i = 0; i < letterCount.length; i++) {
				// Converts the number back to a character
				char letter = (char) (i + 'a');
				System.out.println(letter + ": " + letterCount[i]);
			}
		} catch (FileNotFoundException ex) {
			System.err.println("Error opening file: " + ex.getLocalizedMessage());
		} catch (IOException ex) {
			System.err.println("Error reading file: " + ex.getLocalizedMessage());
		}
	}
}
