package edu.uoc.pac4;

import java.time.LocalDate;

public class Cow extends Herbivore implements Milkable{

	public  int PEAK_MILK;
	public  int dim;
	public  int maxiMilkPerDay;
	
	public Cow (String name, int yearBirth, double weight) throws AnimalException {
		
		super();
		
		dim=0;
		PEAK_MILK = 90;
		setMaxiMilkPerDay(35);
		setName(name);
		setYearBirth(yearBirth);
		setWeight(weight);
		setGender(Gender.FEMALE);
		
	
	}
	
public Cow (String name, int yearBirth, double weight, int maxMilkPerDay) throws AnimalException {
		
	super();
	
	dim=0;
	PEAK_MILK = 90;
	setName(name);
	setYearBirth(yearBirth);
	setWeight(weight);
	setGender(Gender.FEMALE);
	setMaxMilkPerDay(maxMilkPerDay);

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

public void setMaxiMilkPerDay(int maxMilkPerDay)throws IllegalArgumentException {
	
	if (maxiMilkPerDay<0) {
		throw new IllegalArgumentException (MSG_ERR_MAX_LITERS_PER_DAYS_NEGATIVE);
	}else {
		this.maxiMilkPerDay=maxiMilkPerDay;
	}
	
	
}



@Override
	
	public void makeNoise() {
		System.out.print("Muuuuuu!!!");
		
	}

public void makeNoise (int times) {
	for(int i=0; i<times; i++) {
		System.out.print("Muuuuuu!!!");
	}
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
    		" and my weight is " + getWeight() + " kg.\nI'm a cow.";
    		
    		
}








}