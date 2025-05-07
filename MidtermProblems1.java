import java.util.Scanner;
public class MidtermProblems1 {
	public static String replaceFirst(String s, char c) {
		String output = "";
		if(s == null) {
			return null;
		}
		for(int i = 0; i < s.length();i++) {
			if(i == 0) {
				output += c;
			}
			if (i > 0) {
				char stringChar = s.charAt(i);
				output =  output + stringChar;
			}
		}
		return output;
	}
	
	
	
	public static void main(String[] args) {
		try(Scanner scnr = new Scanner(System.in)){
			
			String s = scnr.next();
			char c = scnr.next().charAt(0);
			System.out.println(replaceFirst(s, c));
			
			
		}
	
	}
}
