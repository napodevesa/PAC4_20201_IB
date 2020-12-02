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

	@Override
	public Object clone() throws CloneNotSupportedException {
		Car copy = (Car) super.clone();
		/*
		 * Podemos acceder a engine y gearbox aunque sean 2 atributos privados
		 * porque "copy" es un objeto de la clase Car y estamos dentro de la clase Car.
		 * 
		 * Recordad: los atributos privados son visibles/accesibles desde dentro de la propia clase.
		 * El modificador "private" no significa que solo la misma instancia puede acceder a dicho campo, 
		 * sino que solos los objetos de la misma clase pueden acceder a el. 
		 */
		copy.engine = (Engine) copy.getEngine().clone();
		copy.gearbox = (Gearbox) copy.getGearbox().clone();
		
		/*A diferencia de antes, la siguiente instruccion es incorrecta:
		 * 
		 *  engine.numCylinders = 9;
		 *  
		 * No es posible acceder a numCylinders porque numCylinders es privado en la clase Engine;
		 * y Car y Engine son clases diferentes.
		 */ 
		
		return copy;
		
	}
	
}
