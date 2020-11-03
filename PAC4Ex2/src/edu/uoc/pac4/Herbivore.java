package edu.uoc.pac4;

public class Herbivore extends Animal{
	
	public Herbivore() throws AnimalException  {
		super();
	}

	public Herbivore(String name, int yearBirth, double weight, Gender gender) throws AnimalException {
		super();
		// TODO Auto-generated constructor stub
		
		setName(name);
		setYearBirth(yearBirth);
		setWeight(weight);
		setGender(gender);
	}
	
	
	
	
	public Food eat (Food food)throws AnimalException {
		
		if (food.type == FoodType.MEAT) {
			throw new AnimalException(AnimalException.MSG_ERR_HERBIVORE_FOOD);
		}
		
		if (food.type == FoodType.PLANT) {
			addEnergy(0.1 * food.getKcal());
		}
		
		
		
		return food;
		}
		
	

}
