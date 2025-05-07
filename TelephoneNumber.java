import java.util.Scanner;
public class TelephoneNumber {
 public static void main (String[] args) {
	 try(Scanner scnr = new Scanner(System.in)){
			 
		 System.out.println("Please enter a telephone number using letters : ");
		 String userPhoneNum = scnr.nextLine();
		 userPhoneNum = userPhoneNum.toLowerCase();
		 String userNewNum = "";
		 for(int  i = 0; i < userPhoneNum.length();i++) {
			 if(userPhoneNum.charAt(i) == 'a' ||userPhoneNum.charAt(i) == 'b' || userPhoneNum.charAt(i) == 'c' ){
				 userNewNum += "2";
			 }
			 if(userPhoneNum.charAt(i) == 'd' ||userPhoneNum.charAt(i) == 'e' || userPhoneNum.charAt(i) == 'f' ){
				 userNewNum += "3";
			 }if(userPhoneNum.charAt(i) == 'g' ||userPhoneNum.charAt(i) == 'h' || userPhoneNum.charAt(i) == 'i' ){
				 userNewNum += "4";
			 }if(userPhoneNum.charAt(i) == 'j' ||userPhoneNum.charAt(i) == 'k' || userPhoneNum.charAt(i) == 'l' ){
				 userNewNum += "5";
			 }
			 if(userPhoneNum.charAt(i) == 'm' ||userPhoneNum.charAt(i) == 'n' || userPhoneNum.charAt(i) == 'o' ){
				 userNewNum += "6";
			 }
			 if(userPhoneNum.charAt(i) == 'p' ||userPhoneNum.charAt(i) == 'q' || userPhoneNum.charAt(i) == 'r' || userPhoneNum.charAt(i) == 's' ){
				 userNewNum += "7";
			 }
			 if(userPhoneNum.charAt(i) == 't' ||userPhoneNum.charAt(i) == 'u' || userPhoneNum.charAt(i) == 'v' ){
				 userNewNum += "8";
			 }
			 if(userPhoneNum.charAt(i) == 'w' ||userPhoneNum.charAt(i) == 'x' || userPhoneNum.charAt(i) == 'y' || userPhoneNum.charAt(i) == 'z'){
				 userNewNum += "9";
			 }
			 
		 }
		 while (userNewNum.length() > 7) {
			 if (userNewNum.length() > 7) {
				 userNewNum = userNewNum.substring(0, userNewNum.length() - 1);
			 }
		 }
		
		 StringBuilder stringBuilder = new StringBuilder(userNewNum);
	     stringBuilder.insert(3, "-");
	     userNewNum = stringBuilder.toString();

		 System.out.println(userNewNum);
	 }
	 
 }
}
