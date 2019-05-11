package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Objekte.Lieferant;

public class LieferantTests {

	
	
	@Test
	public void LiferantAnlegen() {
		assertNotNull(new Lieferant());
	}
	
	@Test
	public void LieferantAnlegenMitDaten() {
		assertNotNull(new Lieferant(1,"Kelloggs"));
	}
	
	@Test
	public void LieferantAnlegenUndDatenSichern() {
		Lieferant l = new Lieferant(1 , "Kelloggs");
		assertTrue(l.getId() == 1);
		assertEquals(l.getName(), "Kelloggs");
		
		
	}
	@Test 
	public void LieferantMitAdresseUndTelefonummer() {
		 String adresse = "HanzgeogStr.4 Bremen Deutschland";
		 String tel ="0987654";
		 Lieferant l = new Lieferant(1, "Kelloggs", adresse, tel);	
		 assertTrue(l.getTelefonnummer() == tel);
		 assertEquals(l.getAdresse(), adresse);
	}
	
	
	
}
