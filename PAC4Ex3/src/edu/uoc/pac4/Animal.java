package edu.uoc.pac4;

import java.time.LocalDate;


/**
 * Animal
 * 
 * @author NDevesa
 * @version 1
 */

public class Animal implements Comparable <Animal> {
	
	/**
	 * ID
	 */
	
	private int id;
	/**
	 * next Id
	 */
	public static  int nextId = 0;
	
	
	/**
	 * Name
	 */
	private String name = "Foo";
	
	/**
	 * yearBirth
	 */
	private int yearBirth = 2000;
	
	/**
	 * weight
	 */
	private double weight= 0.1;
	
	
	public Gender gender;
	
	private double energy= 80;
	
	
	
	private void Animal(Object anObject) {
		// TODO Auto-generated method stub
		
	}
	
	public Animal() throws AnimalException  {
		this(0, "Foo", 2000, 0.1,  Gender.FEMALE);
		
	}

	public Animal(int id, String name, int yearBirth, double weight, Gender gender ) throws AnimalException {
		// TODO Auto-generated constructor stub
		
		setId(id);
		setName(name);
		setYearBirth(yearBirth);
		setWeight(weight);
		setGender(gender);
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = nextId;
			plus(id);
		
	}

	public  int getNextId() {
		return nextId;
	}

	private int plus(int id) {
		return nextId++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearBirth() {
		return yearBirth;
	}

	public void setYearBirth(int yearBirth) throws AnimalException {
		
        LocalDate hoy = LocalDate.now();
        int today = hoy.getYear();
		
		if (yearBirth > today) {
			throw new AnimalException(AnimalException.MSG_ERR_YEAR_BIRTH);
	
		} else {
		
			this.yearBirth = yearBirth;
		}
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) throws AnimalException {
		
		if (weight < 0.1) {
			
			throw new AnimalException(AnimalException.MSG_ERR_WEIGHT);
	
		} else {
		
		this.weight = weight;
		
		}
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public FoodType food(FoodType type) {
		return type;
	}
	
	
	public void addEnergy(double energy) throws AnimalException {
		
		if (energy>=0&& energy<=100) {
		this.energy = this.energy + energy;
		
		} 
		
		else {
			throw new AnimalException(AnimalException.MSG_ERR_ENERGY);
		}
		
		if (this.energy>100) {
			this.energy= 100;
		}
	}
		
	
	public double getEnergy() {
		return energy;
	}

	public void  makeNoise() {
		System.out.print("");
		
	}

public Food eat (Food food) throws AnimalException {
	
	return food;
	
}



public String toString() {
	
	LocalDate hoy = LocalDate.now();
    int today = hoy.getYear();
    int todayFinal=  today - yearBirth;
    
    return "My name is " + name + " and I'm " + todayFinal  + 
    		" years old.\nMy gender is " +  gender + " and my weight is " 
    		+ weight + " kg.";
    		
    		
}

@Override
public boolean equals(Object obj) {
	
	final Animal other =  (Animal) obj;
	
	
    if (obj == null) {
        return false;
    }

    if (obj.getClass() != this.getClass()) {
        return false;
    }
    

    if (this.name == other.name && 
    		this.weight == other.weight && this.gender == other.gender &&
    		this.yearBirth == other.yearBirth) {
        return true;
    }
    

    return false;
}

@Override
public  int compareTo (Animal obj) {
	Animal a = (Animal)obj;
	
	if (this.yearBirth > a.yearBirth) {
		return -1;
	}
	
	if (this.yearBirth == a.yearBirth) {
			if (this.weight > a.weight) {
				return -1;
			}
			
			
			
		}
	return 0;
	
}


}
