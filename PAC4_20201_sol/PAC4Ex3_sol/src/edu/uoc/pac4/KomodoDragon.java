package edu.uoc.pac4;

import java.util.Random;

public class KomodoDragon extends Carnivore implements EggLayer{
		
	public KomodoDragon(String name, int yearBirth, double weight, Gender gender) throws AnimalException {
		super(name, yearBirth, weight, gender);		
	}
	
	@Override
	public boolean lay() {
		Random seed = new Random();
		
		if(seed.nextFloat()>0.8) {
			return true;
		}
		
		return false;
	}	

	@Override
	public void makeNoise() {
		System.out.print("Grrrrr!!!");		
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nI'm a Komodo dragon." ;
	}	
}