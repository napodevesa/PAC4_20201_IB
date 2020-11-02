package edu.uoc.pac4.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import edu.uoc.pac4.Animal;
import edu.uoc.pac4.AnimalException;
import edu.uoc.pac4.Gender;

@TestInstance(Lifecycle.PER_CLASS)

class AnimalTest {

	Animal animal;
	
	@BeforeAll
	void testAnimal() {
		try {
			animal = new Animal();			
		} catch (Exception e) {
			e.printStackTrace();
			fail("testAnimal failed");
		}
	}
	
	@Test
	void testGetId() {
		assertEquals(0,animal.getId());		
	}
	
	@Test
	void testSetId() {
		assertEquals(0,animal.getId());
		
	  try{ 
		  Animal animal2 = new Animal(); 
		  assertEquals(1,animal2.getId());
		  assertEquals(2,Animal.nextId); 
		  Animal.nextId = 5; 
		  Animal animal3 = new Animal(); 
		  assertEquals(5,animal3.getId()); 
		  assertEquals(6,Animal.nextId); 
	  }catch (Exception e) { 
		  e.printStackTrace(); 
		  fail("testSetId failed"); 
	  }		 
	}
	
	@Test
	void testGetName() {
		assertEquals("Foo",animal.getName());
	}
	
	@Test
	void testSetName() {
		animal.setName("Bobby");
		assertEquals("Bobby",animal.getName());
		animal.setName("Polly");
		assertEquals("Polly",animal.getName());		
	}
	
	@Test
	void testGetYearBirth() {
		assertEquals(2000,animal.getYearBirth());
	}
	
	@Test
	void testSetYearBirth() {
		int currentYear = LocalDate.now().getYear();
		
		try {
			animal.setYearBirth(currentYear-1);
			assertEquals(currentYear-1,animal.getYearBirth());
		} catch (AnimalException e) {			
			e.printStackTrace();
			fail("testSetYearBirth - Case 1 failed");
		}
							
		Exception ex = assertThrows(Exception.class, () -> animal.setYearBirth(currentYear+20));
		assertEquals(AnimalException.getMSG_ERR_YEAR_BIRTH(),ex.getMessage());
		assertEquals(currentYear-1,animal.getYearBirth());
				
		try {
			animal.setYearBirth(currentYear);
			assertEquals(currentYear,animal.getYearBirth());
			animal.setYearBirth(2000);
			assertEquals(2000,animal.getYearBirth());
		} catch (AnimalException e) {			
			e.printStackTrace();
			fail("testSetYearBirth - Case 3 failed");
		}
		
	}
	
	@Test
	void testGetWeight() {		
		assertEquals(0.1,animal.getWeight());
	}
	
	@Test
	void testSetWeight() {
		double weight = 67.8;
		
		try {
			animal.setWeight(weight);
			assertEquals(weight,animal.getWeight());
		} catch (AnimalException e) {			
			e.printStackTrace();
			fail("testSetWeight - Case 1 failed");
		}
							
		Exception ex = assertThrows(Exception.class, () -> animal.setWeight(0));
		assertEquals(AnimalException.getMSG_ERR_WEIGHT(),ex.getMessage());
		assertEquals(weight,animal.getWeight());
				
		try {
			weight += 20;
			animal.setWeight(weight);
			assertEquals(weight,animal.getWeight());
			animal.setWeight(0.1);
			assertEquals(0.1,animal.getWeight());
		} catch (AnimalException e) {			
			e.printStackTrace();
			fail("testSetWeight - Case 3 failed");
		}
	}
	
	@Test
	void testGetGender() {
		assertEquals(Gender.UNDEFINED,animal.getGender());
	}
	
	@Test
	void testSetGender() {
		animal.setGender(Gender.MALE);
		assertEquals(Gender.MALE,animal.getGender());
		animal.setGender(Gender.FEMALE);
		assertEquals(Gender.FEMALE,animal.getGender());
		animal.setGender(Gender.UNDEFINED);
		assertEquals(Gender.UNDEFINED,animal.getGender());		
	}	
	
	@Test
	void testEquals() {
		Animal animal2 = animal, animal3;
		assertEquals(true,animal.equals(animal));
		assertEquals(true,animal2.equals(animal2));
		assertEquals(true,animal.equals(animal2));
		assertEquals(true,animal2.equals(animal));
				
		try {
			animal3 = new Animal();
			assertEquals(true,animal3.equals(animal3));		
			assertEquals(true,animal.equals(animal3));
			animal3.setGender(Gender.FEMALE);
			assertEquals(false,animal.equals(animal3));
			assertEquals(false,animal2.equals(animal3));
		} catch (AnimalException e) {			
			e.printStackTrace();
			fail("testEquals failed");
		}				
	}	
	
	@Test
	void testToString() {
		assertEquals("My name is Foo and I'm 20 years old.\nMy gender is UNDEFINED and my weight is 0.1 kg.",animal.toString());
	}
}
