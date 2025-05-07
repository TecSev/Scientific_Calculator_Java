import java.util.Scanner;
public class CopenhagenTransit {
	public static void main(String[] args) {

		try(Scanner scnr = new Scanner(System.in)){
			
			int zone;
			double fare = 0;
			
			System.out.println("Enter zone number :");
			System.out.println("Enter adult or child :");
			
			zone = scnr.nextInt();
			String userInputAge = scnr.next();
			
			if ((zone <= 2) && userInputAge.equals("adult")) {
				fare = 23.0;
			}else if ((zone <= 2) && userInputAge.equals("child")) {
				fare = 11.5;
			}else if ((zone == 3) && userInputAge.equals("adult")) {
				fare = 34.5;
			}else if ((zone == 3) || (zone == 4) && userInputAge.equals("child")) {
				fare = 23.0;
			}else if ((zone == 4) && userInputAge.equals("adult")) {
				fare = 46.0;
			}else if ((zone > 4) && userInputAge.equals("adult")) {
				fare = 46.0;
			}
			if (zone > 4) {
				fare = -1.00;
			}
			
			
			
			System.out.println("The fare for " + userInputAge + " to zone number " + zone + " is " + fare + ".");
			
			
			
			
		}

	}
}
