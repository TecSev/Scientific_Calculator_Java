
public class FirstLoop {
	public static void main (String[] args) {
	
	 for(int num = 1; num <= 50; num++) {
		 
		 if(num % 2 == 0) {
		 System.out.println(num + " is an even number");
		 }else {
			 System.out.println(num + " is an odd number");
		 }
		 
		 if(num % 2 == 0) {
			 System.out.println(num + " is divisible by 2"); 
		 }
		 if(num % 5 == 0) {
			 System.out.println(num + " is divisible by 5"); 
		 }
		 if(num % 8 == 0) {
			 System.out.println(num + " is divisible by 8"); 
		 }
		 if(num % 11 == 0) {
			 System.out.println(num + " is divisible by 11"); 
		 }
		
	 }
		 
	}
}
