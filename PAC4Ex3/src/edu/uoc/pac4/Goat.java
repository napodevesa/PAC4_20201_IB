package edu.uoc.pac4;

import java.time.LocalDate;

public class Goat extends Herbivore implements Milkable{

	public  int PEAK_MILK = 80;
	public  int dim = 0;
	public  int maxiMilkPerDay = 6;
	
	public Goat (String name, int yearBirth, double weight) throws AnimalException {
		//super(name, yearBirth, weight, gender);
		// TODO Auto-generated constructor stub
		
		setName(name);
		setYearBirth(yearBirth);
		setWeight(weight);
		setGender(gender);

	
	}
	
	public Goat (String name, int yearBirth, double weight, int maxMilkPerDay) throws AnimalException {
		
		// TODO Auto-generated constructor stub

	}
	
	public static  int getPeakMilk() {
		return 0;

	}

	public static  int getDaysInMilk() {
		return MAX_DIM;

	}
	public static void setDaysInMilk(int dim) {


	}

	
	public static  void setMaxiMilkPerDay(int maxMilkPerDay) {
		
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
    		" and my weight is " + getWeight() + " kg.\nI'm a goat";
    		
    		
}

public Integer getMaxMilkPerDay() {
	// TODO Auto-generated method stub
	return null;
}

public double milk() {
	// TODO Auto-generated method stub
	return 0;
}

public Object setMaxMilkPerDay(int i) {
	// TODO Auto-generated method stub
	return null;
}

}