
public class Farm {
	private Animal [] animals;
	private String farmName;
	private int numAnimals;
	
	
	
	public Farm() {
		animals = new Animal [10];
		farmName = "";
		numAnimals = 0;
	}
	public Farm(String farmName) {
		animals = new Animal [10];
		this.farmName = farmName;
		numAnimals = 0;
	}
	public Farm(int maxAnimals) {
		animals = new Animal [maxAnimals];
		farmName = "";
		numAnimals = 0;
	}
	public Farm(String farmName, int maxAnimals) {
		animals = new Animal [maxAnimals];
		this.farmName = farmName;
		numAnimals = 0;
	}
	public void setFarmName(String farmName) {
		this.farmName = farmName;
	}
	public String getFarmName() {
		return farmName;
	}
	public void addAnimal(Animal a) {
		if(numAnimals == animals.length - 1) {
			resizeAnimalArray();
		}
           animals[numAnimals] = a;
           numAnimals++;
		
	}
	public Animal getAnimal(int index) {
		if (index >= 0 && index < numAnimals) {
	        return animals[index];
	    } else {
	    	return null;
	    }
	}
	public Animal[] getAnimals() {
		return animals;
	}
	public int getNumAnimals() {
		return numAnimals;
	}
	public Animal getFirstAnimal() {
		return animals[0];
	}
	public Animal getLastAnimal() {
		int num = 0;
		for(int i = 0;i < animals.length;i++) {
			if(animals[i + 1] == null) {
				num = i;
				break;
			}
		}
		return animals[num];
		
	}
	public Animal removeAnimal(int index) {
		if (index >= 0 && index < numAnimals) {
	        Animal removedAnimal = animals[index];
	        for (int i = index; i < numAnimals - 1; i++) {
	            animals[i] = animals[i + 1];
	        }
	        animals[numAnimals - 1] = null;
	        numAnimals--;
	        return removedAnimal;
	    }else {
	    	return null;
	    }
	}	
	public void removeAllAnimals() {
		for(int  i = 0;i < animals.length;i++ ) {
			animals[i] = null;
		}
		numAnimals = 0;
	}
	public double getTotalWeightOfAllAnimals() {
		double totalWeight = 0;
		for(int i = 0;i < animals.length - 1;i++) {
			if(animals[i] != null) {
				totalWeight += animals[i].getWeight();
			}
			
			
		}
		return totalWeight;
	}
	public double getAverageWeightOfAllAnimals() {
		if (numAnimals == 0) {
	        return 0.0; 
	    }
	    double totalWeight = 0;
	    for (int i = 0; i < numAnimals; i++) {
	        if (animals[i] != null) { 
	            totalWeight += animals[i].getWeight();
	        }
	    }
	    return totalWeight / numAnimals;
	}
	public int getNumberOfAnimalsAboveWeight(double weight) {
		int counter = 0;
		for(int i = 0;i < numAnimals;i++) {
			if(animals[i] != null && animals[i].getWeight() > weight) {
				counter++;
			}
		}
		return counter;
	}
	public int getNumberOfAnimalsBelowWeight(double weight) {
		int counter = 0;
		for(int i = 0;i < numAnimals;i++) {
			if(animals[i] != null && animals[i].getWeight() < weight) {
				counter++;
			}
		}
		return counter;
	}
	public void increaseWeightOfAllAnimals() {
		for(int i = 0;i < numAnimals;i++) {
			if(animals[i] != null) {
				animals[i].gainWeight();
			}
			
		}
	}
	public void increaseWeightOfAllAnimals(double weight) {
		for(int i = 0;i < numAnimals;i++) {
			if(animals[i] != null) {
				animals[i].gainWeight(weight);
			}
			
		}
		
	}
	public void printAllDetails() {
		System.out.printf("FarmName: %16s | Number of Animals: %d| Farm Size: %4d\n",farmName, numAnimals, animals.length);
		for(int i = 0;i < numAnimals;i++) {
			animals[i].printDetails();
			
		}
	}
	public void resizeAnimalArray() {
		int newCapicity = animals.length * 2;
		Animal[] newAnimal = new Animal[newCapicity];
		System.arraycopy(animals, 0, newAnimal, 0, animals.length);
		animals = newAnimal;

	}
	

	
	
}
