import java.util.Scanner;
public class PatternTwo {
	public static void main (String[] args) {
		try(Scanner scnr = new Scanner (System.in)){
			System.out.println("Please enter a number 1...9 : ");
			int n = scnr.nextInt();
			
			
			
				
			for (int i = 1; i <= n; i++) {
				int spaces = n - i;
				
				 for (int s = 0; s < spaces; s++) {
	                    System.out.print("  "); // Print two spaces for each padding
	                }
				
				
                for (int j = i; j >= 1; j--) {
                	if (j >= 1) {
                		System.out.print(" " + j);
                	}
                   
                    
                }
                
                System.out.println(); 
                
                
				
			}
		
			
			
		}
	}
}
