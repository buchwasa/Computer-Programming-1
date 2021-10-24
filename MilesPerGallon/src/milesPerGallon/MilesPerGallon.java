package milesPerGallon;

public class MilesPerGallon {

	public static void main(String[] args) {
		double gallonsOfGasUsed;
		double milesTraveled;

		gallonsOfGasUsed = 2.4;
		milesTraveled = 20.2;

		double milesPerGallon;
		milesPerGallon = milesTraveled / gallonsOfGasUsed;
		System.out.println("Miles Per Gallon: " + milesPerGallon);
	}
}
