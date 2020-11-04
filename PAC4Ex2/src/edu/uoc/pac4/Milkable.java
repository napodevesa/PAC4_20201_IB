package edu.uoc.pac4;

import java.util.Random;

public interface Milkable  {

	public int MAX_DIM = 300;
	
	
	String MSG_ERR_NO_MILK = "[ERROR] This animal is not pregnant, so it cannot give milk.";
	String MSG_ERR_DAYS_IN_MILK_NEGATIVE = "[ERROR] Days in milk cannot be a negative value!!";
	String MSG_ERR_DAYS_IN_MILK_GREATER = "[ERROR] Days in milk cannot be greater than"+MAX_DIM+"!!";
	String MSG_ERR_MAX_LITERS_PER_DAYS_NEGATIVE = "[ERROR] Max. liters of milk per dat cannot be a negative value!!";

	int getDaysInMilk ();
	void setDaysInMilk (int dim);
	int getPeakMilk();
	int getMaxiMilkPerDay ();
	void setMaxMilkPerDay (int maxMilkPerday);
	
	
	default double milk () throws AnimalException{
		if (getDaysInMilk()>=MAX_DIM) {
			throw new AnimalException (MSG_ERR_NO_MILK);
		
		}else {
			setDaysInMilk(getDaysInMilk()+1);
			
			if (getDaysInMilk ()<=getPeakMilk()) {
				Random a= new Random();
				
				float rand= (float) (0.75 + a.nextFloat()*(1-0.75));
				return rand*getMaxiMilkPerDay();
			}
		else {
			
			Random a= new Random();
			float rand= (float) (0+a.nextFloat()*(0.5-0));
			return rand*getMaxiMilkPerDay();
		}
	}	
}
		
	default int getDaysLeftInMilk() {
		return MAX_DIM - getDaysInMilk();
	}
	int getMaxMilkPerDay();
	

	
	

	
	
	
	
	
	
	
	
	
	
}