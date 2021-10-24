package fileStuff;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class FileStuff {

	public static void main(String[] args) {
		FileReader myFileReader;
		try {
			myFileReader = new FileReader("foo.txt");
			BufferedReader myBufferedReader = new BufferedReader(myFileReader);
			ArrayList<String> rows = new ArrayList<String>();
			while (true) {
				String data = myBufferedReader.readLine();
				if (data == null) {
					break;
				}
				// System.out.println(data);
				rows.add(data);
			}
			myFileReader.close(); // This can also fail
			for (String row : rows) {
				System.out.println(row);
			}

			Collections.sort(rows);
			System.out.println("Sorted list: ");
			for (String row : rows) {
				System.out.println(row);
			}
		} catch (Exception ex) {
			System.err.println("Error opening file: " + ex.getLocalizedMessage());
		}
	}
}
