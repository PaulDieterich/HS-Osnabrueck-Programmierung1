package Objekte;

public class LieferArtikel extends Artikel{

	private int zugang;

	public LieferArtikel(String artikelnummer,String name, int zugang) {
		super(artikelnummer, name);
		this.zugang = zugang;
	}

	public int getZugang() {
		return zugang;
	}

	public void setZugang(int zugang) {
		this.zugang = zugang;
	}
	
	public String toString() {
		return artikelnummer + "," + zugang;
	}
}