import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		Polygonzug poly = new Polygonzug();
		
		// Erste Werte zur besseren veranschaulichkeit
		poly.anfuegen(new Punkt(3, 3));
		poly.anfuegen(new Punkt(17, 5));
		poly.anfuegen(new Punkt(19, 14));

		
		//Programm start
		poly.dialog();
		
	}

	

}
