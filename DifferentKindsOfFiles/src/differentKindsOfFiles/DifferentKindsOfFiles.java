package differentKindsOfFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DifferentKindsOfFiles {

	public static void main(String[] args) {
		// Binary file reading
		try {
			int data;
			FileInputStream inputStream = new FileInputStream("DifferentKindsOfFiles.class");
			data = inputStream.read(); // Reads one byte of the file
			while (data != -1) {
				char character = (char) data;
				System.out.print(character);
				data = inputStream.read();
			}

			inputStream.close();
		} catch (FileNotFoundException ex) {
			System.err.println(ex.getLocalizedMessage());
		} catch (IOException ex) {
			System.err.println(ex.getLocalizedMessage());
		}
	}
}
