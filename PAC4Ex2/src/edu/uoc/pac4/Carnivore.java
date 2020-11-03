package edu.uoc.pac4;

public class Carnivore extends Animal {
	
	public Carnivore() throws AnimalException  {
		super();
	}

	public Carnivore(String name, int yearBirth, double weight, Gender gender) throws AnimalException {
		super();
		// TODO Auto-generated constructor stub
		
		setName(name);
		setYearBirth(yearBirth);
		setWeight(weight);
		setGender(gender);
	}
	
	
	
	public Food eat (Food food)throws AnimalException {
		
		if (food.type == FoodType.PLANT) {
			throw new AnimalException(AnimalException.MSG_ERR_CARNIVORE_FOOD);
		}
		
		if (food.type == FoodType.MEAT) {
			addEnergy(0.2 * food.getKcal());
		}

		return food;
		}
		

}
