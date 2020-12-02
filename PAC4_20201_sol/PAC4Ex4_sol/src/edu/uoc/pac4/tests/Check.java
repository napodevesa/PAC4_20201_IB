package edu.uoc.pac4.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.uoc.pac4.Car;

class Check {
	
	@Test
	void test1() {
		Car bmw1 = new Car("BMW",5,12,6);
		try {
			Car bmw2 = (Car) bmw1.clone();
			assertNotEquals(bmw1, bmw2);
			assertEquals(bmw1.getMake(),bmw2.getMake());
			assertEquals(bmw1.getNumDoors(),bmw2.getNumDoors());
			assertNotEquals(bmw1.getEngine(),bmw2.getEngine());
			assertEquals(bmw1.getEngine().getNumCylinders(),bmw2.getEngine().getNumCylinders());
			assertNotEquals(bmw1.getGearbox(),bmw2.getGearbox());
			assertEquals(bmw1.getGearbox().getNumGears(),bmw2.getGearbox().getNumGears());
		} catch (CloneNotSupportedException e) {		
			e.printStackTrace();
			fail("test1 failed");
		}
	}

}
