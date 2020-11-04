package edu.uoc.pac4;

import java.time.LocalDate;

public class Goat extends Herbivore implements Milkable{

	public  int PEAK_MILK = 80;
	public  int dim = 0;
	public  int maxiMilkPerDay = 6;
	
	public Goat (String name, int yearBirth, double weight) throws AnimalException {
		super();
		
		PEAK_MILK = 80;
		dim=0;
		setMaxMilkPerDay(6);
		
		this.setName(name);
		this.setYearBirth(yearBirth);
		this.setWeight(weight);
		this.setGender(gender);

	
	}
	
	public Goat (String name, int yearBirth, double weight, int maxMilkPerDay) throws AnimalException {
		
		super();
		
		dim=0;
		
		this.setName(name);
		this.setYearBirth(yearBirth);
		this.setWeight(weight);
		this.setMaxMilkPerDay(maxiMilkPerDay);
		this.setGender(gender);

	}
	



@Override
	
	public void makeNoise() {
		System.out.print("Beeeeee!!!");
		
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
    
    return "My name is " + getName() + " and I'm " + todayFinal  + " years old.\nMy gender is " +  getGender() +
    		" and my weight is " + getWeight() + " kg.\nI'm a goat.";
    		
    		
}

@Override
public int getDaysInMilk() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public void setDaysInMilk(int dim) {
	// TODO Auto-generated method stub
	
}

@Override
public int getPeakMilk() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public int getMaxiMilkPerDay() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public void setMaxMilkPerDay(int maxMilkPerday) {
	// TODO Auto-generated method stub
	
}

@Override
public int getMaxMilkPerDay() {
	// TODO Auto-generated method stub
	return 0;
}



}