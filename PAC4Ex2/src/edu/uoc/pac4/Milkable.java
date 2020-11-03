package edu.uoc.pac4;

public interface Milkable {

	int MAX_DIM = 300;
	String MSG_ERR_NO_MILK = "[ERROR] This animal is not pregnant, so it cannot give milk.";
	String MSG_ERR_DAYS_IN_MILK_NEGATIVE = "[ERROR] Days in milk cannot be a negative value!!";
	String MSG_ERR_DAYS_IN_MILK_GREATER = "[ERROR] Days in milk cannot be greater than"+MAX_DIM+"!!";
	String MSG_ERR_MAX_LITERS_PER_DAYS_NEGATIVE = "[ERROR] Max. liters of milk per dat cannot be a negative value!!";
	
	
	public static  int getDaysInMilk() {
		return MAX_DIM;
	
	}
	public static void setDaysInMilk(int dim) {
	
	
	}
	
	public static  int getPeakMilk() {
		return 0;
	
	}
	
	public static  int getMaxiMilkPerDay() {
		return 0;
	
	}
	public static  void setMaxiMilkPerDay(int maxMilkPerDay) {
		
	
	}
	public static double milk() {
		return 0;
		
		
	}
	public static  int getDaysLeftInMilk() {
		return 0;
	
	}
	
	
}