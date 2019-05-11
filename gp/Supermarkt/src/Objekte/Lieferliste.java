package Objekte;

import java.util.ArrayList;

public class Lieferliste {
	
	private ArrayList<LieferArtikel> lieferListe;
	
	Lieferliste(){
		lieferListe = new ArrayList<>();
	}
	
	public void addArtikel(LieferArtikel a) {
		lieferListe.add(a);
	}
	@Override
	public String toString() {
		String output = "";
		for (LieferArtikel artikel : lieferListe) {
			output += "[" + artikel + "]";
		}
		return output;
		
	}
}
