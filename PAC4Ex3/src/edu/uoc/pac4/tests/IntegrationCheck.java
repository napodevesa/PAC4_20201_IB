package edu.uoc.pac4.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.Order;

import edu.uoc.pac4.Animal;
import edu.uoc.pac4.Enclosure;
import edu.uoc.pac4.Gender;
import edu.uoc.pac4.Hen;
import edu.uoc.pac4.KomodoDragon;

@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
class IntegrationCheck {
	Enclosure enclosure1, enclosure2;	
	Animal komodo, hen;
	
	@BeforeAll
	void init(){
		try {
			enclosure1 = new Enclosure("Enclosure 1",100);		
			enclosure2 = new Enclosure("Enclosure 2",150);
			hen = new Hen("Turuleca",2020,14.6);
			komodo = new KomodoDragon("Epi", 2013, 700, Gender.MALE);			
		} catch (Exception e) {
			fail("Init failed");
		}
	}

	@Test
	@Order(1)
	void testIntegration1() {
		try {
	//		assertEquals(true,enclosure1.add(hen));		
			assertEquals(1,enclosure1.getAnimals().size());			
			assertEquals(hen,enclosure1.getAnimals().get(0));
			assertEquals(enclosure1,hen.getEnclosure());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Integration1 failed");
		}
	}
	
	@Test
	@Order(2)
	void testIntegration2()  {		
		try{
			hen.setEnclosure(enclosure1);
			assertFalse(enclosure1.add(hen));			
		}catch(Exception e) {
			e.printStackTrace();
			fail("Integration2 failed");
		}		
	}
	
	
	@Test
	@Order(3)
	void testIntegration3() {
		try {
			hen.setEnclosure(null);
			assertEquals(true,enclosure1.isEmpty());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Integration3 failed");
		}		
	}
	
	@Test
	@Order(4)
	void testIntegration4() {	
		try {
			hen.setEnclosure(enclosure1);
			assertEquals(hen,enclosure1.getAnimals().get(0));						
			assertEquals(enclosure1,hen.getEnclosure());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Integration4 failed");
		}		
	}
	
	@Test
	@Order(5)
	void testIntegration5() {		
		try {
			enclosure1.remove(hen);
			assertEquals(true,enclosure1.isEmpty());
			assertEquals(null,hen.getEnclosure());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Integration5 failed");
		}		
	}
	
	@Test
	@Order(6)
	void testIntegration6() {		
		try {
			enclosure1.add(komodo);
			assertFalse(enclosure1.exists(hen));
			assertEquals(komodo,enclosure1.getAnimals().get(0));
			assertEquals(1,enclosure1.getAnimals().size());			
			assertEquals(enclosure1,komodo.getEnclosure());
			assertEquals(null,hen.getEnclosure());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Integration6 failed");
		}		
	}
	
	@Test
	@Order(7)
	void testIntegration7() {
		try{
			hen.setEnclosure(enclosure2);
			komodo.setEnclosure(enclosure2);
			assertEquals(hen,enclosure2.getAnimals().get(0));
			assertEquals(komodo,enclosure2.getAnimals().get(1));
			assertEquals(0,enclosure1.getAnimals().size());			
			assertTrue(enclosure1.isEmpty());			
			assertEquals(hen,enclosure2.getAnimals().get(0));
			assertEquals(komodo,enclosure2.getAnimals().get(1));
			assertEquals(enclosure2,hen.getEnclosure());
			assertEquals(enclosure2,komodo.getEnclosure());
		}catch(Exception e) {
			e.printStackTrace();
			fail("Integration7 failed");
		}	
	}
	
	@Test
	@Order(8)
	void testIntegration8() {
		try{
			enclosure2.remove(komodo);
			enclosure2.remove(hen);
			assertEquals(null,hen.getEnclosure());
			assertEquals(null,komodo.getEnclosure());
			assertEquals(true,enclosure1.isEmpty());
		}catch(Exception e) {
			e.printStackTrace();
			fail("Integration8 failed");
		}	
	}
	
	@Test
	@Order(9)
	void testIntegration9() {
		try{			
			IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> new Enclosure("Enclosure 3",0));
			assertEquals("[ERROR] Enclosure's size cannot be 0 or a negative value!!",ex.getMessage());
			Enclosure enclosure3 = new Enclosure("Enclosure 3", 1);
			hen.setEnclosure(enclosure3);
			assertEquals(1,enclosure3.getAnimals().size());
			assertEquals(false,enclosure3.add(hen));
			assertEquals(false,enclosure3.add(komodo));
			assertEquals(1,enclosure3.getAnimals().size());
			assertEquals(enclosure3,hen.getEnclosure());
			assertEquals(null,komodo.getEnclosure());
			enclosure3.setSize(1);
			assertEquals(1,enclosure3.getSize());
			enclosure3.setSize(5);
			assertEquals(5,enclosure3.getSize());
			enclosure3.add(komodo);
			assertEquals(enclosure3,komodo.getEnclosure());
			assertEquals(2,enclosure3.getAnimals().size());
			ex = assertThrows(IllegalArgumentException.class, () -> enclosure3.setSize(1));
			assertEquals("[ERROR] Enclosure's size (1) cannot be less than the number of animals (2) that are in the enclosure!!",ex.getMessage());
			enclosure3.setSize(3);
			assertEquals(3,enclosure3.getSize());
		}catch(Exception e) {
			e.printStackTrace();
			fail("Integration9 failed");
		}	
	}
}
