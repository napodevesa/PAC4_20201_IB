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
	public static int nextId = 0;
	
	
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
	
	
	private static Gender gender ;
	
	
	public Animal() throws Exception {
		this(0, "Foo", 2000, 0.1, gender);
	}

	public Animal(int i, String string, int j, double d, Gender gender ) throws Exception {
		// TODO Auto-generated constructor stub
		
		setName(name);
		setYearBirth(yearBirth);
		setWeight(weight);
		setGender(gender);
		setId(id);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		plus();
	}

	public static int getNextId() {
		return nextId;
	}

	private void plus() {
		nextId++;
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

	public void setYearBirth(int yearBirth) throws Exception {
		
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

	public void setWeight(double weight) throws Exception {
		
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
		Animal.gender = gender;
	}
	

}
