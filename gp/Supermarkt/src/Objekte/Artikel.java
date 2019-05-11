package Objekte;
public class Artikel {


	protected String artikelnummer;
	protected String name; 
	Artikel(String artikelnummer, String name){
		this.setArtikelnummer(artikelnummer);
		this.setName(name);
	}

	public void setArtikelnummer(String artikelnummer) {
		this.artikelnummer = artikelnummer;
	}
	public void setName(String name) {
		this.name = name;
	}

}
