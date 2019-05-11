package Objekte;

public class BestantsArtikel extends Artikel{

	private double vkpreis;
	private int bestand;


	public BestantsArtikel(String artikelnummer,String name, double vkpreis, int bestand) {
		super(artikelnummer, name);
		this.vkpreis = vkpreis;
		this.bestand = bestand;

	}
	public BestantsArtikel(String artikelnummer, String name) {
		super(artikelnummer,name);
	}

	public double getVkpreis() {
		return vkpreis;
	}

	public void setVkpreis(double vkpreis) {
		this.vkpreis = vkpreis;
	}

	public int getBestand() {
		return bestand;
	}

	public void setBestand(int bestand) {
		this.bestand = bestand;
	}

	public String toString() {

		return super.artikelnummer + ", " + this.vkpreis ;

	}


}
