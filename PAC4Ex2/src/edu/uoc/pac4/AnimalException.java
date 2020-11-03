package edu.uoc.pac4;

public class AnimalException extends Exception {

	
	private static final long serialVersionUID = 1L;
	
	public static String  MSG_ERR_YEAR_BIRTH = "[ERROR] Animal´s birth year cannot be later than current year";
	public static String  MSG_ERR_WEIGHT = "[ERROR] Animal´s weight cannot be smaller than 0.1 kg.";
	public static String  MSG_ERR_ENERGY = "[ERROR] Animal´s energy cannot be a negative value.";

	public static String  MSG_ERR_CARNIVORE_FOOD = "[ERROR] A carnivore animal cannot eat any food which is not meat.";
	public static String  MSG_ERR_HERBIVORE_FOOD = "[ERROR] An herbivore animal cannot eat any food which is not a plant.";



	public AnimalException()  {
		super();
	}
	
	public AnimalException(String msg)  {
			
		super(msg);
		
	}


}