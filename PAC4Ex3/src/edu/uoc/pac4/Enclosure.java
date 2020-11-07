package edu.uoc.pac4;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.Set;



public class Enclosure extends Exception {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name ;
	private int size;
	private Set<Animal> animals;
	
	
	public Enclosure(String name, int size)  {
	
		this.setName(name);
		this.setSize(size);

		
	}
	
	
	
	TreeSet<Animal> Animal = new TreeSet<Animal>();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	
	
	public void setSize(int size) {
		if (size <= 0) {
			throw new IllegalArgumentException("[ERROR] Enclosure's size cannot be 0"
					+ " or a negative value!!");
		}
		
		if (size < animals.size()) {
			throw new IllegalArgumentException("[ERROR] Enclosure's size"+ size +"cannot be less "
					+ "than the number of animals" + animals.size() + "that are in the enclosure!!");
		}else{
		
			this.size = size;
		
		}
		
	}
	
	
	public boolean add(Animal animal) {
		
		
		
		if (animal== null) {
			throw new NullPointerException("[ERROR] Animal object cannot be null!!");
			
		}else {
			if(animals.size() == size) {
				return false;
			}
			if(exists(animal)) {
				return false;
			}
			
			Animal.add(animal);
			
			animal.setEnclosure(this);
				 
	
			
		}
		
		return true;
			
	}
	
	public boolean remove(Animal animal) {
		
		try {
			animals.remove(animal);
			animal.setEnclosure(null);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void remove() {
		
			Animal.removeAll(Animal);
		
	}
	
	public boolean exists(Animal animal) {
		
		Iterator<Animal> i = Animal.iterator();
	     
		while(i.hasNext()) {
	         if(i.next()==animal) {
	        	 return true;
	      }
	   }
		
		return false;
		
		
	}
	

	
	public boolean isEmpty() {
			return Animal.isEmpty();
	}
	
	
	
	@Override
	public String toString() {

	    return "Enclosure"+ name +"with"+ size + "m2";
	    		
	    		
	}
	
	public ArrayList <Animal> getAnimals() {
		// TODO Auto-generated method stub
		
		 ArrayList<edu.uoc.pac4.Animal> aList = new ArrayList<Animal>(animals);
		 aList.addAll(Animal);
		 
		return   aList;
	}
	
	
	
	
	
	
}
