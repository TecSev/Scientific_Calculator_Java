import java.util.Scanner;
// https://www.youtube.com/watch?v=GK2eR61wJeU
public class MyCalculator {
	public static void main(String[] args) {
		try(Scanner scnr = new Scanner(System.in)){
			boolean active = true;// Initialize a boolean variable to control the main loop
			while (active) {//Everything inside this loop is the calculator and will repeat as long as "active" is true
				
			System.out.println("Enter the calculator mode: Standard/Scientific?");	// prompts the user to select a calculator mode
			String userMode = scnr.next();	//gets the user input and assign it a String variable "userMode "
			
			double resultsIs = 0.0;// makes a double float variable to later assign as the result of calculations
			Double userAddingNums;// double"userAddingNums" will be use to count how many numbers  the user wants calculate with 
			
			while(!userMode.equals("Standard") && !userMode.equals( "Scientific")) {// this while loop will ensure the user select the valid modes otherwise it will ask the user to try again
				System.out.println("Invalid calculator mode, try again");
				userMode = scnr.next();
			}
			
			if(userMode.equals("Standard")) {// this loop is the whole standard calculator
				String userOperator;// A variable to assign for what operator the user wants 
				System.out.println("The calculator will operate in standard mode.");// prompts the user that they have selected standard mode
				System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");// asks the user for a operator and showed the available options
				
				userOperator = scnr.next();// this scans the user operator 
				
				while(!userOperator.equals("+") && !userOperator.equals("-") && !userOperator.equals("*") && !userOperator.equals("/")) {// this while loop will ensure the user select the operator otherwise it will ask the user to try again
					System.out.println("Invalid operator " + userOperator);
					System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
					userOperator = scnr.next();
				}
				
				if (userOperator.equals("+")) {// if the user input a "+" this body will execute
					System.out.println("How many numbers do you want to add?");//prompts the user how many numbers they are adding
					userAddingNums = scnr.nextDouble();//fetch the input and assigning to variable userAddingNums
					
					System.out.printf("Enter %.0f numbers\n", userAddingNums);//prints out a formatted print showing the user the number they choose without the decimals 
					
					for (int i = 0; i < userAddingNums; i++) {// this for loop will repeat as many times as the user amount of number is 
						resultsIs += scnr.nextDouble();// the result i calculated by adding "resultsIs" and the next number  to "resultsIs"
						
					}
					
					
				}else if (userOperator.equals("-")) {//if the user input a "-" this body will execute
					System.out.println("How many numbers do you want to subtract?");//prompts the user how many numbers they are subtracting
					userAddingNums = scnr.nextDouble();//fetch the input and assigning to variable userAddingNums
					
					System.out.printf("Enter %.0f numbers\n", userAddingNums);//prints out a formatted print showing the user the number they choose without the decimals 
					
					resultsIs = scnr.nextDouble();// Initialize 'resultsIs' with the first number to subtract from
					for (int i = 0; i < userAddingNums - 1; i++) {// Loop 'userAddingNums - 1' times, We subtract 1 because the first number was already assigned to 'resultsIs'
						resultsIs -= scnr.nextDouble();// Subtract the next number from 'resultsIs'
						
					}
					
					
				}else if (userOperator.equals("/")) {//if the user input a "/" this body will execute
					
					System.out.println("How many numbers do you want to divide?");//prompts the user how many numbers they are dividing
					userAddingNums = scnr.nextDouble();//fetch the input and assigning to variable userAddingNums
					
					System.out.printf("Enter %.0f numbers\n", userAddingNums);//prints out a formatted print showing the user the number they choose without the decimals 
					resultsIs = scnr.nextDouble();// Initialize 'resultsIs' with the first number to dividing from
					
					for (int i = 0; i < userAddingNums - 1; i++) {// Loop 'userAddingNums - 1' times, We subtract 1 because the first number was already assigned to 'resultsIs'
						resultsIs /= scnr.nextDouble();// divide the next number from 'resultsIs'
						
					}
					
								
				}else if (userOperator.equals("*")) {//if the user input a "/" this body will execute
					System.out.println("How many numbers do you want to multiply?");//prompts the user how many numbers they are multiplying
					userAddingNums = scnr.nextDouble();//fetch the input and assigning to variable userAddingNums
					
					System.out.printf("Enter %.0f numbers\n", userAddingNums);//prints out a formatted print showing the user the number they choose without the decimals 
					resultsIs = scnr.nextDouble();// Initialize 'resultsIs' with the first number to multiplying from
					
					for (int i = 0; i < userAddingNums - 1; i++) {// Loop 'userAddingNums - 1' times, We subtract 1 because the first number was already assigned to 'resultsIs'
						resultsIs *=  scnr.nextDouble();// multiply the next number from 'resultsIs'
						
					}
					
					
					
				}
				
			}
			
			else if(userMode.equals("Scientific")){// this loop is the whole scientific calculator
				System.out.println("The calculator will operate in scientific mode.");// prompts the user that they have selected scientific mode
				System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");// asks the user for a operator but with cos, tan, sin
				
				String userOperator = scnr.next();// A variable to assign for what operator the user wants 
				
				while(!userOperator.equals("+") && !userOperator.equals("-") && !userOperator.equals("*") && !userOperator.equals("/") && !userOperator.equals("sin") && !userOperator.equals("cos") && !userOperator.equals("tan")) {// checks if the user uses a valid operator
					System.out.println("Invalid operator " + userOperator);
					System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
					userOperator = scnr.next();
				}
				
				if (userOperator.equals("+")) {// if the user input a "+" this body will execute
					System.out.println("How many numbers do you want to add?");//prompts the user how many numbers they are adding
					userAddingNums = scnr.nextDouble();//fetch the input and assigning to variable userAddingNums
					
					System.out.printf("Enter %.0f numbers\n", userAddingNums);//prints out a formatted print showing the user the number they choose without the decimals 
					
					for (int i = 0; i < userAddingNums; i++) {// this for loop will repeat as many times as the user amount of number is 
						resultsIs += scnr.nextDouble();// the result i calculated by adding "resultsIs" and the next number  to "resultsIs"
						
					}
					
					
				}else if (userOperator.equals("-")) {// if the user input a "-" this body will execute
					System.out.println("How many numbers do you want to subtract?");//prompts the user how many numbers they are subtracting
					userAddingNums = scnr.nextDouble();//fetch the input and assigning to variable userAddingNums
					
					System.out.printf("Enter %.0f numbers\n", userAddingNums);//prints out a formatted print showing the user the number they choose without the decimals 
					
					resultsIs = scnr.nextInt();// Initialize 'resultsIs' with the first number to subtract from
					for (int i = 0; i < userAddingNums - 1; i++) {// Loop 'userAddingNums - 1' times, We subtract 1 because the first number was already assigned to 'resultsIs'
						resultsIs -= scnr.nextDouble();// Subtract the next number from 'resultsIs'
						
					}
					
					
				}else if (userOperator.equals("/")) {// if the user input a "/" this body will execute
					
					System.out.println("How many numbers do you want to divide?");//prompts the user how many numbers they are dividing
					userAddingNums = scnr.nextDouble();//fetch the input and assigning to variable userAddingNums
					
					System.out.printf("Enter %.0f numbers\n", userAddingNums);//prints out a formatted print showing the user the number they choose without the decimals 
					resultsIs = scnr.nextInt();// Initialize 'resultsIs' with the first number to divide from
					
					for (int i = 0; i < userAddingNums - 1; i++) {// Loop 'userAddingNums - 1' times, We subtract 1 because the first number was already assigned to 'resultsIs'
						resultsIs /= scnr.nextDouble();// divide the next number from 'resultsIs'
						
					}
					
								
				}else if (userOperator.equals("*")) {// if the user input a "*" this body will execute
					System.out.println("How many numbers do you want to Multiply?");//prompts the user how many numbers they are multiplying
					userAddingNums = scnr.nextDouble();//fetch the input and assigning to variable userAddingNums
					
					System.out.printf("Enter %.0f numbers\n", userAddingNums);//prints out a formatted print showing the user the number they choose without the decimals 
					resultsIs = scnr.nextInt();// Initialize 'resultsIs' with the first number to multiply from
					
					for (int i = 0; i < userAddingNums - 1; i++) {// Loop 'userAddingNums - 1' times, We subtract 1 because the first number was already assigned to 'resultsIs'
						resultsIs *=  scnr.nextDouble();// multiply the next number from 'resultsIs'
						
					}
					
					
					
				}else if (userOperator.equals("sin")) {// if the user input a "sin" this body will execute
					System.out.println("Enter a number in radians to find the sine");//prompts the user a number to enter find for sine
					userAddingNums = scnr.nextDouble();//fetch the input and assigning to variable userAddingNums
					
					resultsIs = Math.sin(userAddingNums);//calculate the number "userAddingNums" with Math.sine() the correct trig function as the user requested
					
				}else if (userOperator.equals("cos")) {// if the user input a "cos" this body will execute
					System.out.println("Enter a number in radians to find the cosine");//prompts the user a number to enter find for cosine
					userAddingNums = scnr.nextDouble();//fetch the input and assigning to variable userAddingNums
					
					resultsIs = Math.cos(userAddingNums);//calculate the number "userAddingNums" with Math.sine() the  correct trig function as the user requested
					
				}else if (userOperator.equals("tan")) {// if the user input a "tan" this body will execute
					System.out.println("Enter a number in radians to find the tangent");//prompts the user a number to enter find for tangent
					userAddingNums = scnr.nextDouble();//fetch the input and assigning to variable userAddingNums
					
					resultsIs = Math.tan(userAddingNums);//calculate the number "userAddingNums" with Math.tan() the  correct trig function as the user requested
					
				}
				
			}
			
			
			System.out.println("Result: " + resultsIs);// prints out the result of calculations as per the user requested 
			System.out.println("Do you want to start over? (Y/N)");// ask the user if they wanted to start over and to reply with Y/N
			String calculatorActive = scnr.next();//fetch the user response to a calculaterActive variable 
			
			while (!calculatorActive.equals("Y") && !calculatorActive.equals("N")) {// this while loop ensures that the user responds with a valid response
				System.out.println("invalid try again");
				System.out.println("Do you want to start over? (Y/N)");
				calculatorActive = scnr.next();
			}
			if (calculatorActive.equals("Y")) {// if the user select Y then the calculator will start over 
				active = true;
			}else if (calculatorActive.equals("N")){// if the user select N then it will print out "Goodbye" and set the conditional that is making this calculator run in a while loop to false which ends the program
				System.out.println("Goodbye");
				active = false;
			}
			
			

			}

		}
		
	}
}
