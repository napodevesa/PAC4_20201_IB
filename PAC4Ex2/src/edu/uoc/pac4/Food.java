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
	 * 
	 */
	private String name;

	/**
	 * Kcal
	 * 
	 */
	private int kcal=0;
	
	/**
	 * FoodType
	 * 
	 */
	
	public FoodType type ;

	
	public Food (String name, int kcal, FoodType type ) {
		// TODO Auto-generated constructor stub
		
		
		setName(name);
		setKcal(kcal);
		setFoodType(type);
		
		
	}
	
	/**
	 * Get Name
	 * 
	 * @return name
	 */

	public String getName() {
		return name;
	}
	
	/**
	 * Set Name
	 * 
	 * 
	 */

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get KCal.
	 * 
	 * @return KCal.
	 */

	public int getKcal() {
		return kcal;
	}
	
	/**
	 * Set KCal.
	 * 
	 * 
	 */

	public void setKcal(int kcal)  {
		
		
		if (kcal <0) {
			
			throw new IllegalArgumentException("Indice fuera de los límites");
			
		}
		
		this.kcal = kcal;
	}
	
	/**
	 * Get Food Type.
	 * 
	 * @return type
	 */
	
	public FoodType getType() {
		return type;
	}
	/**
	 * Set Food Type.
	 * 
	 * 
	 */
	
	public void setFoodType(FoodType type) {
		this.type = type;
	}
	
	
	@Override
	public String toString() {
	    return name + "(" + type + ")"+ ":" + kcal + "Kcal" ;
	    		
	    		
	}
	
	
}
