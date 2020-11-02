package edu.uoc.pac4;

import java.time.LocalDate;

/**
 * Animal
 * 
 * @author NDevesa
 * @version 1
 */

public class Animal {
	
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
	
	
	public Gender gender = Gender.valueOf("UNDEFINED");
	
	
	
	private void Animal(Object anObject) {
		// TODO Auto-generated method stub
		
	}
	
	public Animal() throws AnimalException  {
		this(0, "Foo", 2000, 0.1,  Gender.UNDEFINED);
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

public String toString() {
    return "My name is " + name + " and I'm " + 20 + " years old.\nMy gender is " +  gender + " and my weight is " + weight + " kg.";
    		
    		
}
	
	

}
