import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Messreihe {

	String messort;
	ArrayList<Integer> messwerte;

	Messreihe(String messort){
		setMessort(messort);
		this.messwerte = new ArrayList<>();
	}

	public String getMessort() {
		return messort;
	}

	public void setMessort(String messort) {
		this.messort = messort;
	}

	public ArrayList<Integer> getMesswerte() {
		return messwerte;
	}

	public void setMesswerte(ArrayList<Integer> messwerte) {
		if(messwerte != null) {
			this.messwerte = messwerte;
		}

	}


	public void hinzufuegen(int i) {
		messwerte.add(i);

	}
	public boolean zweiGleiche() {
		for(int i = 0; i < messwerte.size(); i++) {
			for (int j = 0; j < messwerte.size(); j++) {
				if(messwerte.get(i) == messwerte.get(j)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean verschieden(Messreihe m2) {
		for(int i = 0; i < messwerte.size(); i++) {
			for (int j = 0; j < m2.messwerte.size(); j++) {
				if(messwerte.get(i) == m2.messwerte.get(j) ) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean alleWerteGleichOft(Messreihe m2) {
		if(this.messwerte.size() != m2.messwerte.size()) {
			return false;
		}
		for (int i = 0; i < messwerte.size(); i++) {
			int x = messwerte.get(i);
			System.out.println(x);
			for(int j = 0; j < m2.messwerte.size(); i++) {
				
			}
		}
		return false;
	}

	public boolean gleicheWerte(Messreihe m2) {
		
		
		
		return true;
	}
}
