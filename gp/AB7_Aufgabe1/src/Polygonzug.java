import java.util.ArrayList;

public class Polygonzug extends Exception  {

	private Interaktionsbrett brett;
	private ArrayList<Punkt> punkteList;
	private static boolean geschlossen = false;
	static EinUndAusgabe io = new EinUndAusgabe();

	public Polygonzug(){
		brett = new Interaktionsbrett();
		brett.setZoom(5);
		punkteList = new ArrayList<>();
	}
	public void anfuegen(Punkt p) {
	try {
			punkteList.add(p);
		}catch(Exception e) {
			e.getMessage();
		}
	}
	public  void darstellen() {
		try {
			for(int i = 1 ; i < punkteList.size(); ++i) {
				int p1x = punkteList.get(i-1).getX();
				int p1y = punkteList.get(i-1).getY();
				int p2x = punkteList.get(i).getX();
				int p2y = punkteList.get(i).getY();
				this.brett.neueLinie(p1x, p1y,p2x,p2y);
			}
			getGeschlossen();
			System.out.println(getGeschlossen());
		}catch (Exception e) {
			e.getMessage();
		}
		
	}
	public  void einefuegenVor(int position, Punkt p) {
		try {
			punkteList.add(position, p);	
		} catch (Exception e) {
			System.out.println("Position ausserhalb der Listes");
			e.getMessage();
		}
	}
	public boolean getGeschlossen() {
		if(punkteList.get(0) == punkteList.get(punkteList.size()-1)) {
			geschlossen = true;
		}else {
			geschlossen = false;
		}
		
		return geschlossen;
	}
	public  void loeschenAn(int position) {
		try {
			boolean geschl = getGeschlossen();
			punkteList.remove(position);
			if(geschl && position == 0) {
				System.out.println("test");
				punkteList.remove(punkteList.size()-1);
				setGeschossen(true);
				
			}
			
			
		} catch (Exception e) {
			System.out.println("Position ausserhalb der Listes");
			e.getMessage();
		}
	}
	public  void punktBearbeitenAn(int position, Punkt p) {
		punkteList.remove(position);
		punkteList.add(position-1, p);
	}
	public  void setGeschossen(boolean b) {
		if(!(punkteList == null && punkteList.size() == 0)) {
			if(b) {
				punkteList.remove(punkteList.get(0));
				einefuegenVor(punkteList.size()-1, punkteList.get(0));
				
			}else {
				punkteList.add(punkteList.get(0));
			}
		}
	}
	@Override
	public String toString() {
		String outPut = " ";
		for(int i = 0; i < punkteList.size(); ++i) {
			outPut = outPut.concat("(x"+i+": " +punkteList.get(i).getX() + " - " + "y"+i+": " + punkteList.get(i).getY() + ")");
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
			this.brett.abwischen();
			darstellen();
			System.out.println("(0) Programm beenden");
			System.out.println("(1) Punkt am Ende hinzufuegen");
			System.out.println("(2) Punkt vor einer Position hinzufuegen");
			System.out.println("(3) Punkt an Position loeschen");
			System.out.println("(4) Korrdinaten eines Punktes bearbeiten");
			System.out.println("(5) Polyginzug oeffnen/schliessen");
			System.out.println("(6) Polygonzug ausgeben");
			Integer input = io.leseInteger();
			if( input > 0) {

				switch(input) {
				case 0: 
					go = false;
					break;
				case 1:
					// "(1) Punkt am Ende hinzufuegen"
					anfuegen(new Punkt(xEingabe(),yEingabe()));
					break;
				case 2:
					// "(2) Punkt vor einer Position hinzufuegen"
					io.ausgeben("Geben sie eine Position an");
					int pos = io.leseInteger();
					einefuegenVor(pos, new Punkt(xEingabe(), yEingabe()));				
					break;
				case 3:
					// "(3) Punkt an Position loeschen"
					io.ausgeben("Geben sie an wleche Position gelöscht werden soll");
					int p = io.leseInteger();
					loeschenAn(p);
					break;
				case 4:
					// "(4) Korrdinaten eines Punktes bearbeiten"
					io.ausgeben("Geben sie eine Position an");
					int pos4 = io.leseInteger();
					punktBearbeitenAn(pos4,new Punkt(xEingabe(), yEingabe()));
					break;
				case 5:
					// "(5) Polyginzug oeffnen/schliessen"
//					io.ausgeben("(o = oeffen / s = schliessen) bitte wählen sie!");
//					String eingabe = io.leseString();
//					if(eingabe.equals("o")) {
//						setGeschossen(true);
//						
//					}else if(eingabe.equals("s")) {
//						setGeschossen(false);
//						
//					}else {
//						System.out.println("Bitte geben sie nur \"o\" oder \"s\" ein. Bitte beachten sie groß und kleinschreibung");
//					}
					if(geschlossen) {
						setGeschossen(true);
					}else {
						setGeschossen(false);
					}

					break;
				case 6:
					System.out.println(punkteList.toString());
					// "(6) Polygonzug ausgeben"
					break;
				default:
					System.out.println( "Geben sie bitte eine der angezeigten zahlen ein!");
					
				}
			}else {
				System.out.println("Bitte geben sie nur Ganzzahlen ein");
			}
		}
	}
}
