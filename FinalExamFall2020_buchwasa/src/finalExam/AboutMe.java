package finalExam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class AboutMe {

	public static void main(String[] args) {
		ArrayList<String> inputData = new ArrayList<String>();
		try {
			FileReader reader = new FileReader("input.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);

			while (true) {
				String data = bufferedReader.readLine();
				if (data == null) { // If there is no data left, break out of the loop.
					break;
				}
				inputData.add(data);
			}

			Collections.sort(inputData); // Alphabetically sorts the ArrayList

			for (String aboutMe : inputData) {
				System.out.println(aboutMe);
			}

			System.out.println(" ------ ");

			inputData.add("Star Wars fan");

			int index = 0;
			// If the index is less than the array size, print the data.
			while (index < inputData.size()) {
				System.out.println(inputData.get(index));
				index++;
			}

			reader.close();
		} catch (FileNotFoundException ex) {
			System.err.println("Error opening file: " + ex.getLocalizedMessage());
		} catch (IOException ex) {
			System.err.println("Error reading file: " + ex.getLocalizedMessage());
		}
	}
}
