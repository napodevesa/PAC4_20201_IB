package edu.uoc.pac4;

import java.time.LocalDate;

public class Goat extends Herbivore implements Milkable{

	public  int PEAK_MILK=80;
	public  int dim=0;
	public int maxMilkPerDay;
	
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
		this.setMaxMilkPerDay(maxMilkPerDay);
		this.setGender(gender);

	}


@Override

public int getPeakMilk() {
	return PEAK_MILK;

}

@Override

public  int getDaysInMilk() {
	return dim;

}

@Override
public void setDaysInMilk(int dim) throws IllegalArgumentException{
	
	if (dim<0) {
		throw new IllegalArgumentException (MSG_ERR_DAYS_IN_MILK_NEGATIVE);
	}else if (dim>MAX_DIM) {
		throw new IllegalArgumentException (MSG_ERR_DAYS_IN_MILK_GREATER);
	}else {
		
		this.dim=dim;
	}
	


}


@Override

public void setMaxMilkPerDay(int maxMilkPerDay)throws IllegalArgumentException {
	
	if (maxMilkPerDay<0) {
		throw new IllegalArgumentException (MSG_ERR_MAX_LITERS_PER_DAYS_NEGATIVE);
	}else {
		this.maxMilkPerDay=maxMilkPerDay;
	}
	
	
}

@Override

public  int getMaxMilkPerDay() {
	return this.getMaxMilkPerDay();

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






}
