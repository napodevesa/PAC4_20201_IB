package edu.uoc.pac4;

public class Engine{

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
}
