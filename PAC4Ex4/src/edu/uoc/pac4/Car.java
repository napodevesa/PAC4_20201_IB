package edu.uoc.pac4;

public class Car implements Cloneable{

	private String make;
	private int numDoors;
	
	private Engine engine;
	private Gearbox gearbox;
	
	public Car(String make, int numDoors, int numCylinders, int numGears) {
		setMake(make);
		setNumDoors(numDoors);
		
		engine = new Engine(numCylinders);
		gearbox = new Gearbox(numGears);
	}
	
	public String getMake() {
		return make;
	}

	private void setMake(String make) {
		this.make = make;
	}

	public int getNumDoors() {
		return numDoors;
	}

	private void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}

	public Engine getEngine() {
		return engine;
	}

	public Gearbox getGearbox() {
		return gearbox;
	}
	
	/*
	 @Override
	public Object clone() throws CloneNotSupportedException {
	  
	    Car nueva= new Car (this.make,this.numDoors, this.numDoors, this.numDoors);
	    return nueva;
	  }
	 */
	
	public Car clone() throws CloneNotSupportedException {
        try {
          
        	Car result = new Car(make, numDoors, numDoors, numDoors);
            // copy primitives by value
            
        	result.make = this.make;
           
        	result.numDoors = this.numDoors;
            
            if (this.engine != null) {
              result.engine = (Engine) this.engine.clone();
            }
           
            if (this.gearbox != null) {
                result.gearbox = (Gearbox) this.gearbox.clone();
              }
            
            // Done, return the new object
            return result;
            
        } catch (CloneNotSupportedException e) {
            // in case any of the cloned mutable fields do not implement Cloneable
            throw new AssertionError(e);
        }
    }
	
	 
	 
		  

	
}
