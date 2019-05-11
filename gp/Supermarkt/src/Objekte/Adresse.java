package Objekte;

public class Adresse {

	String strassenName;
	Integer hausnummer;
	String ort;
	Integer postleitzahl;
	
	Adresse(String strassenName, Integer hausnummer, String ort, Integer postleitzahl){
		this.setStrassenName(strassenName);
		this.setHausnummer(hausnummer);
		this.setOrt(ort);
		this.setPostleitzahl(postleitzahl);
	}
	public void setStrassenName(String strassenName) {
		this.strassenName =strassenName;
	}
	public String getStrassenName() {
		return this.strassenName;
	}
	public void setHausnummer(Integer hausnummer) {
		this.hausnummer = hausnummer;
	}
	public Integer getHausnummer() {
		return this.hausnummer;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public String getOrt() {
		return this.ort;
	}
	public void setPostleitzahl(Integer postleitzahl) {
		this.postleitzahl = postleitzahl;
	}
	public Integer getPostleitzahl() {
		return this.postleitzahl;
	}
	public String toString() {
		return ""+strassenName+" " + hausnummer; 
	}
}
