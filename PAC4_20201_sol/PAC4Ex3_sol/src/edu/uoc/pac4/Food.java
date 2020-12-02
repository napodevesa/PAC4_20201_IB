package edu.uoc.pac4;

public class Food {
	private String name;
	private int kcal = 0;
	private FoodType type;
	
	
	public Food(String name, int kcal, FoodType type) throws IllegalArgumentException{
		if(kcal<0) {
			throw new IllegalArgumentException("[ERROR] Food's kcal cannot be negative!!");
		}
		
		this.name = name;
		this.kcal = kcal;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public int getKcal() {
		return kcal;
	}

	public FoodType getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return getName()+" ("+getType()+"): "+getKcal()+" kcal";
	}
}
