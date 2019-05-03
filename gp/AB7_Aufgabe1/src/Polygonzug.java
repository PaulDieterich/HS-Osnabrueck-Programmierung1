import java.util.ArrayList;

public class Polygonzug  {

	private Interaktionsbrett brett;
	private ArrayList<Punkt> PunktList;
	private static boolean geschlossen = false;
	static EinUndAusgabe io = new EinUndAusgabe();

	public  Polygonzug(Interaktionsbrett ib, ArrayList<Punkt> al ){
		brett = ib;
		PunktList = al;
	}
	public void anfuegen(Punkt p) {
		PunktList.add(p);
	}
	public  void darstellen(Interaktionsbrett ib) {
		brett = ib;
		for(int i = 1 ; i < PunktList.size(); ++i) {
			int p1x = PunktList.get(i-1).getX();
			int p1y = PunktList.get(i-1).getY();
			int p2x = PunktList.get(i).getX();
			int p2y = PunktList.get(i).getY();
			brett.neueLinie(p1x, p1y,p2x,p2y);
		}		
		if(PunktList.get(0) == PunktList.get(PunktList.size() -1)) {
			geschlossen = true;
		}
	}
	public  void einefuegenVor(int position, Punkt p) {
		PunktList.add(position, p);	
	}
	public boolean getGeschlossen() {
		if(PunktList.get(0) == PunktList.get(PunktList.size()-1)) {
			geschlossen = true;
		}
		geschlossen = false;
		return false;
	}
	public  void loeschenAn(int position) {
		PunktList.remove(position);
	}
	public  void punktBearbeitenAn(int position, Punkt p) {
		PunktList.remove(position);
		PunktList.add(position-1, p);
	}
	public  void setGeschossen(boolean b) {
		if(!b) {
			PunktList.add(PunktList.get(0));
		}else {
			PunktList.remove(PunktList.get(PunktList.size()-1));
		}
	}
	@Override
	public String toString() {
		String outPut = " ";
		for(int i = 0; i < PunktList.size(); ++i) {
			outPut = outPut.concat("(x"+i+": " +PunktList.get(i).getX() + " - " + "y"+i+": " + PunktList.get(i).getY() + ")");
		}
		return outPut;
	}
	public  int xEingabe() {
		io.ausgeben("X-Wert:");
		int x = io.leseInteger();
		return x;
	}
	public  int yEingabe() {
		io.ausgeben("Y-Wert:");
		int y = io.leseInteger();
		return y;
	}

	public  void dialog() {
		EinUndAusgabe io = new EinUndAusgabe();
		boolean go = true;
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("------------------------Willkommen zum Polygonzug zeichenbrett -----------------------------");
		System.out.println("--------------------------------------------------------------------------------------------");
		while (go) {

			System.out.println("(0) Programm beenden");
			System.out.println("(1) Punkt am Ende hinzufuegen");
			System.out.println("(2) Punkt vor einer Position hinzufuegen");
			System.out.println("(3) Punkt an Position loeschen");
			System.out.println("(4) Korrdinaten eines Punktes bearbeiten");
			System.out.println("(5) Polyginzug oeffnen/schliessen");
			System.out.println("(6) Polygonzug ausgeben");
			Integer input = io.leseInteger();
			if(  input instanceof Integer) {

				switch(input) {
				case 0: 
					go = false;
					break;
				case 1:
					// "(1) Punkt am Ende hinzufuegen"
					anfuegen(new Punkt(xEingabe(),yEingabe()));
					darstellen(new Interaktionsbrett());
					break;
				case 2:
					// "(2) Punkt vor einer Position hinzufuegen"
					io.ausgeben("Geben sie eine Position an");
					int pos = io.leseInteger();
					einefuegenVor(pos, new Punkt(xEingabe(), yEingabe()));
					brett.abwischen();
					darstellen(brett);
					break;
				case 3:
					// "(3) Punkt an Position loeschen"
					io.ausgeben("Geben sie an wleche Position gelöscht werden soll");
					int p = io.leseInteger();
					loeschenAn(p);
					brett.abwischen();
					darstellen(brett);
					break;
				case 4:
					// "(4) Korrdinaten eines Punktes bearbeiten"
					io.ausgeben("Geben sie eine Position an");
					int pos4 = io.leseInteger();
					punktBearbeitenAn(pos4,new Punkt(xEingabe(), yEingabe()));
					brett.abwischen();
					darstellen(brett);
					break;
				case 5:
					// "(5) Polyginzug oeffnen/schliessen"
					io.ausgeben("(o = oeffen / s = schliessen) bitte wählen sie!");
					String eingabe = io.leseString();
					if(eingabe.equals("o")) {
						setGeschossen(true);
					}else if(eingabe.equals("s")) {
						setGeschossen(false);
					}else {
						System.out.println("Bitte geben sie nur \"o\" oder \"s\" ein. Bitte beachten sie groß und kleinschreibung");
					}

					break;
				case 6:
					System.out.println(PunktList.toString());
					// "(6) Polygonzug ausgeben"
					break;
				default:
					System.out.println( "Geben sie bitte eine der angezeigten zahlen ein!");
				}
			}
		}
	}
}
