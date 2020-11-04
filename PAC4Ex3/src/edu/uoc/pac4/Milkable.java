package edu.uoc.pac4;

public interface Milkable  {

	public int MAX_DIM = 300;
	
	public int dim = 0;
	
	public int days = 0;
	
	String MSG_ERR_NO_MILK = "[ERROR] This animal is not pregnant, so it cannot give milk.";
	String MSG_ERR_DAYS_IN_MILK_NEGATIVE = "[ERROR] Days in milk cannot be a negative value!!";
	String MSG_ERR_DAYS_IN_MILK_GREATER = "[ERROR] Days in milk cannot be greater than"+MAX_DIM+"!!";
	String MSG_ERR_MAX_LITERS_PER_DAYS_NEGATIVE = "[ERROR] Max. liters of milk per dat cannot be a negative value!!";


	public static  int getDaysInMilk() {
		return dim;
	
	}
	public static void setDaysInMilk(int dim) {
		
		if (dim < 0) {
			throw new IllegalArgumentException(MSG_ERR_DAYS_IN_MILK_NEGATIVE);
		}
		
		else if (dim > MAX_DIM) {
			throw new IllegalArgumentException(MSG_ERR_DAYS_IN_MILK_GREATER);
		}else{
		
			Milkable.dim= dim;
		
		}
		
		return;
	
	}
	
	public static  int getPeakMilk() {
		return dim;
	
	}
	
	public static  int getMaxiMilkPerDay() {
		return getMaxiMilkPerDay();
	
	}
	public static  void setMaxiMilkPerDay(int maxMilkPerDay) {
		
		if (maxMilkPerDay <0) {
			throw new IllegalArgumentException(MSG_ERR_MAX_LITERS_PER_DAYS_NEGATIVE);
		}else {
			
		}
		
	
	}
	public static double milk() {
		return 0;
		
		
	}
	public static  int getDaysLeftInMilk() {
		return days;
	
	}
	
	
}