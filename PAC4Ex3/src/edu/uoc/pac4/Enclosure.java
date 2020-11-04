package edu.uoc.pac4;


import java.util.Iterator;
import java.util.TreeSet;

public class Enclosure extends Exception {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name ;
	private static int size;
	
	
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
		if (size < 0) {
			throw new IllegalArgumentException("[ERROR] Enclosure's size cannot be 0"
					+ " or a negative value!!");
		}
		
		if (size < Enclosure.size) {
			throw new IllegalArgumentException("[ERROR] Enclosure's size"+ size +"cannot be less "
					+ "than the number of animals" + Enclosure.size + "that are in the enclosure!!");
		}else{
		
			Enclosure.size = size;
		
		}
		
	}
	
	
	public boolean add(Animal animal) {
		
		if (animal== null) {
			throw new NullPointerException("[ERROR] Animal object cannot be null!!");
			
		}else {
			Animal.add(animal);
			
			animal.setEnclosure(null);
			
			if (Animal.size()>size) {
				Animal.remove(animal);
			}
		}
		
		return true;
	}
	
	public boolean remove(Animal animal) {
		
		Animal.remove(Animal.last());
		
		return true;
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
		
		return true;
		
		
	}
	

	
	public boolean isEmpty() {
	
		return Animal.isEmpty();
	}
	
	
	
	@Override
	public String toString() {

	    return "Enclosure"+ name +"with"+ size + "m2";
	    		
	    		
	}
	
	public Object getAnimals() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
}
