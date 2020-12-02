package edu.uoc.pac4;

public class Goat extends Herbivore implements Milkable {
	
	private static final int PEAK_MILK = 80; //first X days in which the milk production is higher
	
	private int dim = 0; //days in milk
	private int maxMilkPerDay; //liters of milk per day

	public Goat(String name, int yearBirth, double weight) throws AnimalException {
		this(name, yearBirth, weight, 6);		
	}
	
	public Goat(String name, int yearBirth, double weight, int maxMilkPerDay) throws AnimalException {
		super(name, yearBirth, weight, Gender.FEMALE);	
		setMaxMilkPerDay(maxMilkPerDay);
	}	
	
	@Override
	public int getPeakMilk() {
		return PEAK_MILK;
	}
	
	@Override
	public int getDaysInMilk() {
		return dim;
	}
	
	@Override
	public void setDaysInMilk(int dim) throws IllegalArgumentException{
		if(dim<0) throw new IllegalArgumentException(Milkable.MSG_ERR_DAYS_IN_MILK_NEGATIVE);
		if(dim>MAX_DIM) throw new IllegalArgumentException(Milkable.MSG_ERR_DAYS_IN_MILK_GREATER);
		
		this.dim = dim;
	}
	
	@Override
	public int getMaxMilkPerDay() {
		return maxMilkPerDay;
	}
	
	@Override
	public void setMaxMilkPerDay(int maxMilkPerDay) throws IllegalArgumentException{
		if(maxMilkPerDay<0) throw new IllegalArgumentException(Milkable.MSG_ERR_MAX_LITERS_PER_DAYS_NEGATIVE);
		this.maxMilkPerDay = maxMilkPerDay;
		
	}

		
	@Override
	public void makeNoise() {
		System.out.print("Beeeeee!!!");
	}
	
	@Override
	public void setGender(Gender gender) {
		super.setGender(Gender.FEMALE);
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nI'm a goat." ;
	}
}