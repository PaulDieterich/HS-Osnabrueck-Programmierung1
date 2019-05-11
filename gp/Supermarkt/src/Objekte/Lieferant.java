package Objekte;

import java.util.ArrayList;

public class Lieferant {

	private int id;
	private String name;
	private Adresse adresse;
	private Lieferliste liste;
	private String telefonnummer;

	public Lieferant(int id, String name, String strassenName, Integer hausnummer, String ort, Integer postleitzahl, String telefonnummer, Lieferliste liste) {
		this.setId(id);
		this.setName(name); 
		this.setTelefonnummer(telefonnummer);
		this.liste = liste;
		this.adresse = new Adresse(strassenName, hausnummer, ort, postleitzahl);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public String getTelefonnummer() {
		return telefonnummer;
	}
	public void setTelefonnummer(String telefonnummer) {
		this.telefonnummer = telefonnummer;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return this.id + " " + this.name+ " " + adresse.getOrt() + this.liste.toString();  
	}
	


}
