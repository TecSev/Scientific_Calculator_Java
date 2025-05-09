
public class Animal {
	private String name;
	private int birthYear;
	private double weight;
	private char gender;
	
	public Animal() {
		name = "";
		birthYear = 1900;
		weight = 0.0;
		gender = 'u';
	}
	
	public Animal(String name, int birthYear, double weight, char gender){
		this.name = name;
		this.birthYear = birthYear;
		this.setWeight(weight);//checks for valid weight and set to -1 if not
		this.setGender(gender);	//checks for valid gender and set to 'u' if not
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		if (weight < 0) {
			this.weight = -1;
		}else {
			this.weight = weight;
		}
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		if (gender == 'm' || gender == 'f') {
	        this.gender = gender;
	    } else {
	        this.gender = 'u';
	    }
	}
	public int calculateAge(int currentYear) {
		if(birthYear > currentYear ) {
			return -1;
		}
		return currentYear - birthYear;
	}
	public boolean isMale() {
		if(gender == 'm') {
			return true;
		}
		return false;
	}
	public boolean isFemale() {
		if(gender == 'f') {
			return true;
		}
		return false;
	}
	public void printDetails() {
		System.out.printf("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Gender: %c\n", name , birthYear, weight, gender);
	}
	public void gainWeight() {
		this.weight++;
	}
	public void gainWeight(double weightIncrease) {
		this.weight += weightIncrease;
		if(this.weight < 0) {
			this.weight = 0;
		}
	}
	public void loseWeight() {
		this.weight--;
		if(this.weight < 0) {
			this.weight = 0;
		}
	}
	public void loseWeight(double weightdecrease) {
		this.weight -= weightdecrease;
		if(this.weight < 0) {
			this.weight = 0;
		}
	}
	 @Override
	    public String toString() {
	        return 
	                "name: '" + name + '\'' +
	                "| birthYear: " + birthYear +
	                "| weight: " + weight +
	                "| gender: " + gender 
	              ;
	    }
	
	
	
}
