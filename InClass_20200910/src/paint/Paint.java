package paint;

public class Paint {

	public static void main(String[] args) {
		int width, height; // Dimensions of a wall in feet.
		double costPerGallon; // Cost for a gallon of paint.
		double squareFeetPerGallon; // Coverage of paint per gallon.
		double costToPaintWall; // Total cost to paint the wall

		width = 20;
		height = 8;
		costPerGallon = 28.0;
		squareFeetPerGallon = 50.0;

		costToPaintWall = ((width * height) / squareFeetPerGallon) * costPerGallon;
		System.out.printf("Total Cost to Paint is: $%.2f\n", costToPaintWall);

		double gallonsRequired;
		gallonsRequired = costToPaintWall / costPerGallon;
		System.out.println("Total Gallons Required: " + gallonsRequired);
	}
}
