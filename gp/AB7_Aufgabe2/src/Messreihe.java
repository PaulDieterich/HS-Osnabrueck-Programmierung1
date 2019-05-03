import java.util.ArrayList;


public   class Messreihe {

	private String messort;
	private static ArrayList<Integer> messwerte = new ArrayList<>();

	public Messreihe() {}
	
	public void setMessort(String messort) {
		this.messort = messort;
	}
	public String getMessort() {
		return this.messort;
	}
	
	
	public static void hinzufuegen(Integer neuerWert) {
		messwerte.add(neuerWert);
	}
	public Integer min() {
		if(!(messwerte.size() > 0)) {
			return null;
		}
		Integer minimum = messwerte.get(0);
		for(Integer messwert: messwerte) {
			if(messwert.equals(0)) {
				return 0;
			}
			if(messwert < minimum) {
				minimum = messwert;
			}
		}
		return minimum;
	}
	public double druchschnitt() {
		double schnitt = 0.0;
		for(Integer messwert: messwerte) {
			schnitt =  schnitt + messwert;
		}

		return schnitt / messwerte.size();
	}
	public void anzahkZwischen(Integer min, Integer max) {
		int anzahl = 0;
		for(int i = min; i <= max; i++) {
			anzahl++;
		}
		System.out.println( "min=" + min + " max=" + max + " Dazwischen liegen " + anzahl );
	}
	@Override
	public String toString() {
		String output = "[";
		for(Integer messwert : messwerte) {
			output += " " + messwert;
		}
		return "Am Messort " + messort + " sind die folgenenen werte gemessen worden: " + output + " ]";
	}


}
