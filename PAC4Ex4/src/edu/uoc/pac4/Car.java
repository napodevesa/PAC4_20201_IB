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
	

	
	public Car clone() throws CloneNotSupportedException {
        try {
          
        	Car result = new Car(make, numDoors, numDoors, numDoors);
            
        	result.make = this.make;
        	result.numDoors = this.numDoors;
            
            if (this.engine != null) {
              result.engine = (Engine) this.engine.clone();
            }
           
            if (this.gearbox != null) {
                result.gearbox = (Gearbox) this.gearbox.clone();
              }
            
            return result;
            
        } catch (CloneNotSupportedException e) {

        	throw new AssertionError(e);
        }
    }
	
	 
	 
		  

	
}
