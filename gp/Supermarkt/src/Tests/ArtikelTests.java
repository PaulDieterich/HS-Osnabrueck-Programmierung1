package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Objekte.Artikel;


public class ArtikelTests {

	private String ArtNr ="A09876";
	private double vkPreis = 22;
	private int bestand = 2;

	
	
	@Test
	public void ArtikelAnlegen() {
		assertNotNull(new Artikel());
	}
	
	@Test
	public void ArtikelAnlegenMitDaten() {
		assertNotNull(new Artikel(ArtNr,vkPreis,bestand));
	}
	
	@Test
	public void ArtikelAnlegenUndDatenSichern() {
		
		Artikel a = new Artikel(ArtNr,vkPreis,bestand);
		assertTrue(a.getArtikelnummer() == ArtNr);
		assertTrue(a.getVkpreis() == vkPreis);
		assertEquals(a.getBestand(), bestand);	
	}
	
	@Test
	public void ArtikelPreisAendernMitProzent(){
		Artikel a = new Artikel(ArtNr,vkPreis,bestand);
		a.vkPreisAenderMitProzent(5);
	}
	@Test
	public void BestandAendern() {
		Artikel a = new Artikel(ArtNr,vkPreis,bestand);
		a.setBestand(50);
		
	}
	@Test
	public void BestandZugangBuchen() {
		Artikel a = new Artikel(ArtNr,vkPreis,bestand);
		a.zugangBuchen(10);
		
		
		
	}
	
	
	
}