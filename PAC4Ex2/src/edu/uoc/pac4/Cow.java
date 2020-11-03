package edu.uoc.pac4;

import java.time.LocalDate;

public class Cow extends Herbivore{

	public  int PEAK_MILK = 90;
	public  int dim = 0;
	public  int maxiMilkPerDay = 35;
	
	public Cow (String name, int yearBirth, double weight) throws AnimalException {
		super(name, yearBirth, weight, gender);
		// TODO Auto-generated constructor stub
		
		setName(name);
		setYearBirth(yearBirth);
		setWeight(weight);
		setGender(gender);
		
	
	}


@Override
	
	public void makeNoise() {
		System.out.print("Muuuuuu!!!");
		
	}
	
@Override
public String toString() {
	
	LocalDate hoy = LocalDate.now();
    int today = hoy.getYear();
    int todayFinal=  today - getYearBirth();
    
    return "My name is " + getName() + " and I'm " + todayFinal  + " years old.\nMy gender is " +  getGender() +
    		" and my weight is " + getWeight() + " kg.\nI'm a cow.";
    		
    		
}

}