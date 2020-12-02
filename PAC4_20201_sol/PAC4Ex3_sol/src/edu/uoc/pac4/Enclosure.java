package edu.uoc.pac4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Enclosure{
	
	private String name;
	private int size;
	private Set<Animal> animals;
	
	public Enclosure(String name, int size) {
		animals = new TreeSet<>();
		setName(name);
		setSize(size);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) throws IllegalArgumentException {
		if(size<=0) {
			throw new IllegalArgumentException("[ERROR] Enclosure's size cannot be 0 or a negative value!!");
		}
		
		if(size<getAnimals().size()) {
			throw new IllegalArgumentException("[ERROR] Enclosure's size ("+size+") cannot be less than the number of animals ("+getAnimals().size()+") that are in the enclosure!!");
		}
		this.size = size;
	}	
	
	public boolean add(Animal animal) throws NullPointerException{
		
		if(getSize() == getAnimals().size()) {//No podemos añadir mas animales
			return false;
		}else {
			animal = Objects.requireNonNull(animal,"[ERROR] Animal object cannot be null!!");
			
			Enclosure enclosure = animal.getEnclosure();
			
			if(enclosure!=null && enclosure!=this) {	//El animal esta en otro recinto (enclosure), asi pues, lo eliminamos de ese recinto	
				enclosure.remove(animal);
			}
			
			if(animals.add(animal)) {
				animal.setEnclosure(this);
				return true;
			}
			return false;
		}		
	}
	
	public boolean remove(Animal animal) throws NullPointerException{
		
		animal = Objects.requireNonNull(animal,"[ERROR] Animal object cannot be null");
		
		if(animals.remove(animal)) {
			animal.setEnclosure(null);
			return true;
		}
		return false;
	}
	
	public void remove() throws NullPointerException{
		
		for(Object animal : animals.toArray()) {
			remove((Animal)animal);
		}
		
		animals.clear();
	}
	
	public boolean exists(Animal animal) {
		return animals.contains(animal);
	}
	
	public List<Animal> getAnimals() {
		return new ArrayList<Animal>(animals);
	}
	
	public boolean isEmpty() {
		return animals.isEmpty();
	}
	
	@Override
	public String toString() {
		return "Enclosure "+getName()+" with "+getSize()+" m2.";
	}
}