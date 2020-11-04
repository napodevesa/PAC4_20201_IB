package edu.uoc.pac4;

public class Omnivore extends Animal{

	public Omnivore() throws AnimalException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Omnivore(String name, int yearBirth, double weight, Gender gender) throws AnimalException {
		super();
		// TODO Auto-generated constructor stub
		
		setName(name);
		setYearBirth(yearBirth);
		setWeight(weight);
		setGender(gender);
	}
	
	
	
	
	public Food eat (Food food)throws AnimalException {
		
		if (food.type == FoodType.PLANT) {
			addEnergy(0.05 * food.getKcal());
		}
		
		if (food.type == FoodType.MEAT) {
			addEnergy(0.15 * food.getKcal());
		}

		return food;
		}

}
