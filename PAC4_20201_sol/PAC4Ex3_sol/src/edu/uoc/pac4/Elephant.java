package edu.uoc.pac4;

public class Elephant extends Herbivore {

	public Elephant(String name, int yearBirth, double weight, Gender gender) throws AnimalException {
		super(name, yearBirth, weight, gender);		
	}
	
	@Override
	public void makeNoise() {
		System.out.print("Brrrrr!!!");
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nI'm an elephant." ;
	}	
}