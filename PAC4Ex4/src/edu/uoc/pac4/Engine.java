package edu.uoc.pac4;

public class Engine implements Cloneable{

	private int numCylinders;
	
	public Engine(int numCylinders) {
		setNumCylinders(numCylinders);
	}

	public int getNumCylinders() {
		return numCylinders;
	}

	public void setNumCylinders(int numCylinders) {
		this.numCylinders = numCylinders;
	}
	
	
	 @Override
	 	public Object clone() throws CloneNotSupportedException {
	  
		 Engine a= new Engine (this.numCylinders);
		 
		 return a;
	  }
}
