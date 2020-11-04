package edu.uoc.pac4;

import java.time.LocalDate;

public class KomodoDragon extends Carnivore  {

	public KomodoDragon() throws AnimalException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public KomodoDragon(String name, int yearBirth, double weight, Gender gender) throws AnimalException {
		// TODO Auto-generated constructor stub
		
		
		setName(name);
		setYearBirth(yearBirth);
		setWeight(weight);
		setGender(gender);
		

	}
	
	@Override
	
	public void makeNoise() {
		System.out.print("Grrrrr!!!");
		
	}

	@Override
	public String toString() {
		
		LocalDate hoy = LocalDate.now();
	    int today = hoy.getYear();
	    int todayFinal=  today - getYearBirth();
	    
	    return "My name is " + getName() + " and I'm " + todayFinal  + " years old.\nMy gender is " +  getGender() +
	    		" and my weight is " + getWeight() + " kg.\nI'm a Komodo dragon.";
	    		
	    		
	}
	

}
