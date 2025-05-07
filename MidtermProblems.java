import java.util.Scanner;
public class MidtermProblems {
	public static String difference(int intA, int intB){
		int intSumTemp = intA - intB;
		String output = "";
		if (intA > intB) {
			output = "a is bigger by " + intSumTemp;
		}else {
			output = "b is bigger by " + intSumTemp * -1;
		}
		if(intSumTemp == 0) {
			output = "EQUAL";
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		try(Scanner scnr = new Scanner(System.in)){
			//find the difference between intA and intB
			int intA, IntB;
			intA = scnr.nextInt();
			IntB = scnr.nextInt();
			System.out.println(difference(intA, IntB));
	
			
		}
	}
}
