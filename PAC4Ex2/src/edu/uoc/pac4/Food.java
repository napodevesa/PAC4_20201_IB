package edu.uoc.pac4;

/**
 * Food
 * 
 * @author NDevesa
 * @version 1
 */

public class Food {
	
	/**
	 * Name
	 */
	private String name;

	/**
	 * Kcal
	 */
	private int kcal=0;
	
	/**
	 * FoodType
	 */
	
	public FoodType type ;

	
	public Food (String name, int kcal, FoodType type ) {
		// TODO Auto-generated constructor stub
		
		
		setName(name);
		setKcal(kcal);
		setFoodType(type);
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	
	public FoodType getType() {
		return type;
	}
	
	public void setFoodType(FoodType type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
	    return name + "(" + type + ")"+ ":" + kcal + "Kcal" ;
	    		
	    		
	}
}
