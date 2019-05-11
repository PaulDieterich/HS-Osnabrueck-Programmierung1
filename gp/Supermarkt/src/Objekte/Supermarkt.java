package Objekte;

import java.util.ArrayList;

public class Supermarkt {
		private ArrayList<Artikel> artikelListe; 
		
		Supermarkt(){
			this.artikelListe = new ArrayList<>();
		}
		public void artikelEinlagern(Artikel a ) {
			artikelListe.add(a);
		}
		
		public String toString() {
			String output = "";
			for(Artikel a : artikelListe) {
				output += "[ " + a + "]";
	
			}
			return output;
		}
}
