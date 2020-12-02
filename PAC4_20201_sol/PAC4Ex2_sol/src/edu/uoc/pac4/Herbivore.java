package edu.uoc.pac4;

public abstract class Herbivore extends Animal{

	public Herbivore() throws AnimalException {
		super();		
	}

	public Herbivore(String name, int yearBirth, double weight, Gender gender) throws AnimalException {
		super(name, yearBirth, weight, gender);		
	}
	
	@Override
	public void eat(Food food) throws AnimalException{
		if(food.getType()==FoodType.PLANT) {
			addEnergy(food.getKcal()*0.1);
		}else {
			throw new AnimalException(AnimalException.MSG_ERR_HERBIVORE_FOOD);
		}
	}	
}