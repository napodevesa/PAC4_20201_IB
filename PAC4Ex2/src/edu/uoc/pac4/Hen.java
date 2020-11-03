package edu.uoc.pac4;

import java.time.LocalDate;

public class Hen extends Omnivore{
	
	public Gender gender = Gender.valueOf("FEMALE");

	
	public Hen() throws AnimalException {
		super();
		// TODO Auto-generated constructor stub
		
		
	}
	
	public Hen(String name, int yearBirth, double weight) throws AnimalException {
		// TODO Auto-generated constructor stub
		
		
		setName(name);
		setYearBirth(yearBirth);
		setWeight(weight);
		

	}
	

	
@Override
	
	public void makeNoise() {
		System.out.print("Co-co-co!!!");
		
	}
		
	
	@Override
	public String toString() {
		
		LocalDate hoy = LocalDate.now();
	    int today = hoy.getYear();
	    int todayFinal=  today - getYearBirth();
	    
	    return "My name is " + getName() + " and I'm " + todayFinal  + " years old.\nMy gender is " +  gender +
	    		" and my weight is " + getWeight() + " kg.\nI'm a hen.";
	    		
	    		
	}

}
