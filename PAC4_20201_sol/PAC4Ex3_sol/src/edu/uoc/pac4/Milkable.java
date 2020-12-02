package edu.uoc.pac4;

import java.util.Random;

public interface Milkable {
	
	int MAX_DIM = 300; //Max days in milk
	
	String MSG_ERR_NO_MILK = "[ERROR] This animal is not pregnant, so it cannot give milk.";
	String MSG_ERR_DAYS_IN_MILK_NEGATIVE = "[ERROR] Days in milk cannot be a negative value!!";
	String MSG_ERR_DAYS_IN_MILK_GREATER = "[ERROR] Days in milk cannot be greater than"+MAX_DIM+"!!";
	String MSG_ERR_MAX_LITERS_PER_DAYS_NEGATIVE = "[ERROR] Max. liters of milk per day cannot be a negative value!!";
	
	int getDaysInMilk();
	void setDaysInMilk(int dim);
	
	int getPeakMilk();
	
	int getMaxMilkPerDay();
	void setMaxMilkPerDay(int maxMilkPerDay);
		
	default double milk() throws AnimalException{
		if(getDaysInMilk() < MAX_DIM){			
			setDaysInMilk(getDaysInMilk()+1);
			
			Random seed = new Random();
			
			if(getDaysInMilk()<=getPeakMilk()) { //Maxima produccion de leche [max*0.75,max) --> ((Math.random() * (max - min)) + min);				
				return  ((getMaxMilkPerDay() - (getMaxMilkPerDay() * 0.75)) * seed.nextDouble())+(getMaxMilkPerDay() * 0.75) ;
			}else { //[0,max*0.5)				
				return seed.nextDouble()*(getMaxMilkPerDay()*0.5);				
			}			
		}
		
		throw new AnimalException(MSG_ERR_NO_MILK);
	}
		
	default int getDaysLeftInMilk() {
		return MAX_DIM - getDaysInMilk();
	}	
}