package assignment10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class buchwasa_Assignment10 {

	public static void main(String[] args) {
		ArrayList<String> nationalParks = new ArrayList<String>();
		try {
			FileReader reader = new FileReader("NationalParks.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			while (true) {
				String data = bufferedReader.readLine();
				if (data == null) { // Break out of the loop if there is null data
					break;
				}
				nationalParks.add(data);
			}

			reader.close(); // Close the reader since we aren't using it anymore

			System.out.println("National Parks: " + nationalParks.toString());
			System.out.println("------");

			for (int i = 0; i < nationalParks.size(); i++) {
				System.out.println(nationalParks.get(i));
			}

			System.out.println("------");

			Collections.sort(nationalParks); // Sorts the array alphabetically

			for (String park : nationalParks) {
				System.out.println(park);
			}
		} catch (Exception ex) {
			System.err.println("Error reading file: " + ex.getLocalizedMessage());
		}
	}
}
