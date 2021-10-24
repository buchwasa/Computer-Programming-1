package switches;

public class Switches {

	public static void main(String[] args) {
		double examGrade = 85.0;
		/*
		 * if(examGrade >= 90 && examGrade <= 100){
		 * System.out.println("Your grade is an A"); }else if(examGrade >= 80 &&
		 * examGrade < 90){ System.out.println("Your grade is a B"); }else if(examGrade
		 * >= 70 && examGrade < 80){ System.out.println("Your grade is a C"); }else
		 * if(examGrade >= 60 && examGrade < 70){
		 * System.out.println("Your grade is a D"); }else{
		 * System.out.println("Your grade is an F"); }
		 */
		switch ((int) examGrade) {
		case 100:
			System.out.println("Your grade is an A.");
			break;
		case 89:
		case 85:
			System.out.println("Your grade is a B.");
			break;
		case 79:
			System.out.println("Your grade is a C.");
			break;
		case 69:
			System.out.println("Your grade is a D.");
			break;
		default:
			System.out.println("Your grade is an F.");
			break;
		}
	}
}
