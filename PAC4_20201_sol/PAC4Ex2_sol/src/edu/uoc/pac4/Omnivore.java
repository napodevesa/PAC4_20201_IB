package edu.uoc.pac4;

public abstract class Omnivore extends Animal{
	
	public Omnivore() throws AnimalException {
		super();		
	}

	public Omnivore(String name, int yearBirth, double weight, Gender gender) throws AnimalException {
		super(name, yearBirth, weight, gender);		
	}
	
	@Override
	public void eat(Food food) throws AnimalException{
		if(food.getType()==FoodType.MEAT) {
			addEnergy(food.getKcal()*0.15);
		}else {
			addEnergy(food.getKcal()*0.05);
		}		
	}
}
