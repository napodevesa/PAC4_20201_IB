package edu.uoc.pac4;

public class Gearbox implements Cloneable{

	private int numGears;
	
	public Gearbox(int numGears) {
		setNumGears(numGears);
	}

	public int getNumGears() {
		return numGears;
	}

	public void setNumGears(int numGears) {
		this.numGears = numGears;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
