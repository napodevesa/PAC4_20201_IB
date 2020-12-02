package edu.uoc.pac4;

import java.time.LocalDate;

public abstract class Animal implements Comparable<Animal>, Cloneable{
	private int id;
	public static int nextId;	//Podriamos quitar el bloque "static" y aqui poner nextId = 0;
	private String name;
	private int yearBirth;
	private double weight;
	private Gender gender;
	
	private double energy;	
	
	static {
		nextId = 0;
	}
	
	{
		energy = 80;
	}
	
	public Animal() throws AnimalException{
		this("Foo",2000,0.1,Gender.UNDEFINED);
	}
	
	public Animal(String name, int yearBirth, double weight, Gender gender) throws AnimalException{
		setId();
		setName(name);
		setYearBirth(yearBirth);
		setWeight(weight);	
		setGender(gender);
	}
	
	public int getId() {
		return id;
	}
	
	private void setId() {
		this.id = Animal.nextId;
		Animal.nextId++;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getYearBirth() {
		return yearBirth;
	}
	
	public void setYearBirth(int yearBirth) throws AnimalException{
		if(yearBirth>LocalDate.now().getYear()) {
			throw new AnimalException(AnimalException.MSG_ERR_YEAR_BIRTH);
		}
		this.yearBirth = yearBirth;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) throws AnimalException{
		if(weight<0.1) {
			throw new AnimalException(AnimalException.MSG_ERR_WEIGTH);
		}
			this.weight = weight;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	@Override
	public boolean equals(Object obj) {
		Animal animal = (Animal) obj;
		
		if(this == animal || 
				(this.getName() == animal.getName() && 
				this.getYearBirth() == animal.getYearBirth() &&
				this.getWeight() == animal.getWeight() &&
				this.getGender().equals(animal.getGender()))
		  ){
			return true;
		}
		
		return false;		
	}
	
	@Override
	public String toString() {
		return "My name is "+getName()+" and I'm "+(LocalDate.now().getYear()-getYearBirth())+" years old.\nMy gender is "+getGender()+" and my weight is "+getWeight()+" kg.";
	}

	/*
	 * A partir de aqui estan los metodos nuevos del Ejercicio 2 en el orden en que se describen en el enunciado.
	 */
	
	public abstract void makeNoise();
	public abstract void eat(Food food) throws AnimalException;
	
	public double getEnergy() {
		return energy;
	}
	
	protected void addEnergy(double energy) throws AnimalException{
		if(energy>=0 && energy<=100) {
			this.energy += energy;
		}else {
			throw new AnimalException(AnimalException.MSG_ERR_ENERGY);
		}
		
		if(this.energy>100) this.energy = 100;
	}
				
	@Override
	public int compareTo(Animal animal) {
		int result = 0;		
		
		result = animal.getYearBirth()-this.getYearBirth();		
		result = (result == 0? (int) (animal.getWeight()-this.getWeight()): result); 
		
		return result;
	}
}