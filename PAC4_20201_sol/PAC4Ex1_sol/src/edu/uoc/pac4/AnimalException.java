package edu.uoc.pac4;

public class AnimalException extends Exception {
	
	/**
	 * El primer atributo, serialVersionUID, es para evitar un warning de la serializacion
	 */
	private static final long serialVersionUID = 1L;
	
	public final static String MSG_ERR_YEAR_BIRTH = "[ERROR] Animal's birth year cannot be later than current year";
	public final static String MSG_ERR_WEIGHT = "[ERROR] Animal's weight cannot be smaller than 0.1 kg.";

	public AnimalException() {
		super();
	}
	
	public AnimalException(String msg) {
		super(msg);
	}
	
}