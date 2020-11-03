package edu.uoc.pac4;

import java.time.LocalDate;

public class Hen extends Omnivore implements EggLayer{
	

	
	public Hen(String name, int yearBirth, double weight) throws AnimalException {
		// TODO Auto-generated constructor stub
		
		
		setName(name);
		setYearBirth(yearBirth);
		setWeight(weight);
		
		

	}
	
	
public static boolean lay() {
	
	float a = (float) Math.random();
	
	if (a > 0.5) {
		return true;
	}
	
	return false;
	
}


@Override
	
	public void makeNoise() {
		System.out.print("Co-co-co!!!");
		
	}
		
@Override
	public void setGender(Gender gender) {
		this.gender = Gender.FEMALE;
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
