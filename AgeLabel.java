import java.util.Scanner;
public class AgeLabel {
	public static void main(String[] args) {
		try(Scanner scnr = new Scanner(System.in)){
			int userAgeDays;
			System.out.println("Enter an age in number of days :");
			userAgeDays = scnr.nextInt();
			
			if (userAgeDays <= 365) {// 1 year  old or younger
				System.out.println("You are an infant");
			}else if (userAgeDays > 365 && userAgeDays <= 1095) {//over  1 year    old and is   3 years old or younger
				System.out.println("You are a toddler");
			}else if (userAgeDays > 1095 && userAgeDays <= 4380) {//over  3 years  old and is 12 years old or younger
				System.out.println("You are a child");
			}else if (userAgeDays > 4380 && userAgeDays <= 6935) {//over 12 years old and is 19 years old or younger
				System.out.println("You are a teenager");
			}else if (userAgeDays > 6935 && userAgeDays <= 7665) {//over 19 years old and is 21 years old or younger
				System.out.println("You are a young adult");
			}else if (userAgeDays > 7665 && userAgeDays <= 18250) {//over 21 years old and is 50 years old or younger
				System.out.println("You are an adult");
			}else if (userAgeDays > 18250 && userAgeDays <= 23725) {//over 50 years old and is 65 years old or younger
				System.out.println("You are middle aged");
			}else if (userAgeDays > 23725) {//over 65 years old,
				System.out.println("You are a senior citizen");
			}
	
		
	
			
		}
	}
}





