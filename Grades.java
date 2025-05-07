import java.util.Scanner;
public class Grades {
	
	public static int readGrades(int[] grades, Scanner scnr) {
        
        int count = 0;
        int grade;

        System.out.println("Enter a grade : "); 
        
        while (!scnr.hasNextInt()) {
            
            scnr.next(); 
        }
        grade = scnr.nextInt();

        while (grade >= 0 && count < grades.length) {
            grades[count++] = grade;

            if (count < grades.length) {
                System.out.println("Enter a grade : ");
                
                while (!scnr.hasNextInt()) {
                    
                    scnr.next(); 
                }
                grade = scnr.nextInt();
            } else {
                 
                break;
            }
        }

        
        return count;
    }
	
	

	
	public static int sum(int[] arr) {
		int total = 0;
		for(int i = 0; i < arr.length;i++) {
			total += arr[i];
		}
		return total;
	}
	
	public static int sum(int[] arr, int firstIndex, int lastIndex) {
		int totalSum = 0;
		
		if(firstIndex < 0 || lastIndex >= arr.length || arr == null || firstIndex > lastIndex ) {
			return -666;
		}
		
		for (int i = firstIndex; i <= lastIndex;i++) {
			totalSum += arr[i];
		}
		
		return totalSum;
	}
	
	public static double average(int[] arr) {
		double average;
		double total = 0;
		for (int i = 0; i < arr.length;i++) {
			total += arr[i];
		}
		average = total / arr.length;
		
		return average;
	}
	
	public static int[] copyArray(int[] arr1 , int[] arr2 , int maxSize) {
		for(int i = 0; i < maxSize;i++) {
			arr1[i] = arr2[i];
		}
		return arr1;
	}
	
	public static int maxValue(int[] arr) {
		int i;
		int max = arr[0];
		for(i = 0; i < arr.length;i++){
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int maxValue(int[] arr, int firstIndex, int lastIndex) {
		
		
		if(firstIndex < 0 || lastIndex >= arr.length || arr == null || firstIndex > lastIndex ) {
			return -666;
		}
		int max = arr[firstIndex];
		for (int i = firstIndex; i < lastIndex;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
	}
	
	public static int indexOfFirstMaxValue(int[] arr) {
		int maxValue = arr[0];
		int maxIndex = 0;
		for(int i = 1; i < arr.length;i++){
			if(arr[i] > maxValue) {
				maxValue = arr[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	public static int indexOfFirstMinValue(int[] arr) {
		int minValue = arr[0];
		int minIndex = 0;
		for(int i = 1; i < arr.length;i++){
			if(arr[i] < minValue) {
				minValue = arr[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	public static int minValue(int[] arr) {
		int min = arr[0];
		for(int i = 0; i < arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int minValue(int[] arr, int firstIndex, int lastIndex) {
		
		
		if(firstIndex <= 0 || lastIndex >= arr.length || arr == null || firstIndex > lastIndex ) {
			return -666;
		}
		
		int min = arr[firstIndex];
		for (int i = firstIndex; i <= lastIndex;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		return min;
	}
	
	public static int numberOfBelowAverageElements(int[] arr) {
		double average = average(arr);
		int count = 0;
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] < average) {
				count++;
			}
		}
		return count;
	}
	
	public static int numberOfAboveAverageElements(int[] arr) {
		double average = average(arr);
		int count = 0;
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] > average) {
				count++;
			}
		}
		return count;
	}
	
	public static void rotateElements(int[] arr) {
		
		int length = arr.length;
		int lastElement = arr[length - 1];
		
		for(int i = length - 2;i >= 0;i--) {
			arr[i + 1] = arr[i];
		
		}
		arr[0] = lastElement;
		
	}
	
	public static void rotateElements(int[] arr, int rotationCounts) {
		int n = arr.length;
		int[] rotatedArray = new int[n];
		for(int i = 0; i < n; i++) {
			int indexArray = (i + rotationCounts) % n;
			rotatedArray[indexArray] = arr[i];
		}
		for(int i = 0; i < n; i++) {
			arr[i] = rotatedArray[i];
		}
	}
	public static void reverseArray(int[] arr) {
		int n = arr.length;
		int[] temp = new int[n];
		for(int i = 0; i < n;i++) {
			temp [i] = arr[n - i - 1];
		}
		for(int i = 0; i < n;i++) {
			arr[i] = temp[i];
		}
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean active =true;
		while(active) {
			int[] userGrades = new int[50];
			int gradeCounted = readGrades(userGrades , scnr);
			int[] finalGrades = new int[gradeCounted];
			if (gradeCounted == 0) {
                break;
            }
			finalGrades = copyArray(finalGrades , userGrades, gradeCounted);
//			reverseArray(finalGrades);
//			rotateElements(finalGrades);
//			rotateElements(finalGrades , 5);
			if(gradeCounted > 0) {
				System.out.println("Number Of Grades = " + gradeCounted);
				System.out.println("Maximum Grade = " + maxValue(finalGrades));
				System.out.println("Minimum Grade = " + minValue(finalGrades));
				System.out.println();

			}
		}
		
		
		
		
//		System.out.println(numberOfAboveAverageElements(finalGrades));
//		System.out.println(numberOfBelowAverageElements(finalGrades));
//		System.out.println(indexOfFirstMaxValue(finalGrades));
//		System.out.println(indexOfFirstMinValue(finalGrades));
//		System.out.println(minValue(finalGrades, 2, 4));
//		System.out.println(minValue(finalGrades));
//		System.out.println(maxValue(finalGrades, 2, 4));
//		System.out.println(maxValue(finalGrades));
//		System.out.println("the sum between 1 and 3 index is "+ sum(finalGrades , 1, 3));

//		System.out.println(average(finalGrades));
//		System.out.println(sum(userGrades));	
		
		scnr.close();
	}

}
