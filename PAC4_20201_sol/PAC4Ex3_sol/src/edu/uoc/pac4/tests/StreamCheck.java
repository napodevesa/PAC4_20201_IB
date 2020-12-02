package edu.uoc.pac4.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import edu.uoc.pac4.Animal;
import edu.uoc.pac4.AnimalException;
import edu.uoc.pac4.Cow;
import edu.uoc.pac4.Enclosure;
import edu.uoc.pac4.Food;
import edu.uoc.pac4.FoodType;
import edu.uoc.pac4.Gender;
import edu.uoc.pac4.Hen;
import edu.uoc.pac4.Herbivore;
import edu.uoc.pac4.KomodoDragon;

@TestInstance(Lifecycle.PER_CLASS)

class StreamCheck {
	
	Enclosure enclosure;
	Animal hen, komodo, cow;
	private ByteArrayOutputStream outContent;
	
	@BeforeAll
	void init(){
		try {
			enclosure = new Enclosure("Enclosure 1",100);		
			hen = new Hen("Turuleca",2020,14.6);
			komodo = new KomodoDragon("Epi", 2013, 700, Gender.MALE);
			cow = new Cow("Tolon", 2010, 768.96);
			enclosure.add(hen);
			enclosure.add(komodo);
			enclosure.add(cow);
		} catch (Exception e) {
			fail("Init failed");
		}
	}

	@Test	
	void test1() {
		outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	  //Escribe la expresion lambda del test1 dentro del forEach
	    enclosure.getAnimals().forEach(
	    		animal -> {
					System.out.println(animal.getId() + ", "+animal.getName());
				}		    		
			);
	    		    
	    assertEquals("0, Turuleca1, Epi2, Tolon", outContent.toString().replaceAll("\n|\r\n", System.getProperty("line.separator").trim()));	
	}
	
	
	@Test	
	void test2() {
		outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    Food plant = new Food("plant",10,FoodType.PLANT);
	    Food meat = new Food("meat",25,FoodType.MEAT);
	    
	  //Escribe la expresion que usa la API Stream del test2 a partir de ".stream()"
  		enclosure.getAnimals().stream().filter(animal -> animal.getWeight()>650).forEach(animal -> {
  			try{
  				animal.eat(animal instanceof Herbivore? plant: meat);	  				
  			}catch(AnimalException e) {
  				fail("test2 failed");
  			}
  		});
	  		
  		assertEquals(80,hen.getEnergy());
	  	assertEquals(85,komodo.getEnergy());
	  	assertEquals(81,cow.getEnergy());
	}
	
	@Test
	void test3() {
		//Escribe la expresion que usa la API Stream del test3 a partir de ".stream()"
		double result = enclosure.getAnimals().stream().mapToDouble(animal -> animal.getWeight()).average().getAsDouble();
		assertEquals(494.52,result,0.1);
	}
}