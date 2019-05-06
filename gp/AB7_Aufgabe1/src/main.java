import java.util.ArrayList;

public class main {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Punkt p1 = new Punkt(10, 15);
//		System.out.prinPolygonzugtln(p1.toString());
		
//		einefuegenVor(0,new Punkt(80, 1));
//		darstellen(new Interaktionsbrett());
		Polygonzug poly = new Polygonzug();
		poly.anfuegen(new Punkt(5, 2));
		poly.anfuegen(new Punkt(80, 49));
		poly.anfuegen(new Punkt(74, 95));
		
		poly.dialog();
		
	}

	

}
