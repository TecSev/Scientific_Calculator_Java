import java.util.Scanner;
public class PatternOne {
	public static void main (String[] args) {
		try(Scanner scnr = new Scanner (System.in)){
			System.out.println("Please enter a number 1...9 : ");
			int n = scnr.nextInt();
			for(int i = 1;i <= n; i++) {
				for(int j = 1;j <= i; j++) {
					System.out.print(j + " ");
					
				}
				System.out.println(); 
				
				
			}
			
			
			
		}
	}
}
