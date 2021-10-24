package dictionary;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Dictionary {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		try {
			FileReader reader = new FileReader("english.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			while (true) {
				String data = bufferedReader.readLine();
				if (data == null) {
					break;
				}
				words.add(data);
			}
			System.out.println(words.size() + " words read.");
			System.out.println("First word: " + words.get(0));
			System.out.println("Last word: " + words.get(words.size() - 1));
			reader.close();

			int sum = 0;
			for (String word : words) {
				sum += word.length();
			}
			System.out.println(sum + " total characters.");
		} catch (FileNotFoundException ex) {
			System.err.println("Error opening file: " + ex.getLocalizedMessage());
		} catch (IOException ex) {
			System.err.println("Error reading file: " + ex.getLocalizedMessage());
		}
	}
}
