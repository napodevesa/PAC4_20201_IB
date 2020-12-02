package edu.uoc.pac4;

import java.util.Random;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)

public class Hen extends Omnivore implements EggLayer{

	public Hen(String name, int yearBirth, double weight) throws AnimalException {
		super(name, yearBirth, weight, Gender.FEMALE);		
	}
	
	@Override
	public boolean lay() {
		Random seed = new Random();
		
		if(seed.nextFloat()>0.5) {
			return true;
		}
		
		return false;
	}
	
	
	@Override
	public void makeNoise() {
		System.out.print("Co-co-co!!!");
	}
	
	@Override
	public void setGender(Gender gender) {
		//A hen is always female.
		super.setGender(Gender.FEMALE);
	}	
	
	@Override
	public String toString() {
		return super.toString()+"\nI'm a hen." ;
	}	
}
