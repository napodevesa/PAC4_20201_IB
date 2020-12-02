package edu.uoc.pac4;

public abstract class Carnivore extends Animal{	
	
	public Carnivore() throws AnimalException {
		super();		
	}

	public Carnivore(String name, int yearBirth, double weight, Gender gender) throws AnimalException {
		super(name, yearBirth, weight, gender);		
	}
	
	@Override
	public void eat(Food food) throws AnimalException{
		if(food.getType()==FoodType.MEAT) {
			addEnergy(food.getKcal()*0.2);
		}else {
			throw new AnimalException(AnimalException.MSG_ERR_CARNIVORE_FOOD);
		}
	}	
}