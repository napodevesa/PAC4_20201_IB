package edu.uoc.pac4;

public class Enclosure {
	
	
	private String name ;
	private static int size;
	
	
	public Enclosure(String name, int size)  {
		// TODO Auto-generated constructor stub
		
		
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
	public void setSize(int size) {
		if (size <0) {
			throw new IllegalArgumentException("[ERROR] Enclosure's size cannot be 0"
					+ " or a negative value!!");
		}
		
		else if (size < Enclosure.size) {
			throw new IllegalArgumentException("[ERROR] Enclosure's size"+"" +"cannot be less "
					+ "than the number of animals"+"" + "that are in the enclosure!!");
		}else{
		
			Enclosure.size = size;
		
		}
		
	}
	
	
	public boolean add(Animal animal) {
		return false;
	}
	
	public boolean remove(Animal animal) {
		return false;
	}
	
	public boolean exists(Animal animal) {
		return false;
	}
	

	
	public boolean isEmpty() {
		return false;
	}
	
	
	
	
}
