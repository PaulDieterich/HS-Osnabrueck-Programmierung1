package Objekte;

public class TestTheObjekt {

	public static void main(String[] args) {
		
		Lieferliste ll = new Lieferliste();
		Lieferant l = new Lieferant(888, "Müller", "Am Brill", 5,"Bremen", 28203, "0175658977", ll);
		
		LieferArtikel la = new  LieferArtikel("A587","Apfel",5);
		ll.addArtikel(la);
		
		Supermarkt sm = new Supermarkt();
		sm.artikelEinlagern(la);
		sm.artikelEinlagern(la);
		sm.artikelEinlagern(la);
		
		
		System.out.println(l.toString());
		System.out.println(sm.toString());
	}

}


//adresse.setStrassenName(strassenName);
//adresse.setHausnummer(hausnummer);
//adresse.setOrt(ort);
//adresse.setPostleitzahl(postleitzahl);	