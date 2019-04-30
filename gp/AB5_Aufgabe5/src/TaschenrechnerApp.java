

public class TaschenrechnerApp {

	public static void main(String[] args) {
		
		EinUndAusgabe io = new EinUndAusgabe();

		Boolean check = true;
		while (check) {
			System.out.println("Geben sie Wert a ein: ");
			int a = io.leseInteger();
			System.out.println("Geben sie Wert b ein: ");
			int b = io.leseInteger();
			
			rechnen(a,b);

			System.out.print("\nWollen sie weiter rechnen? <j | n> \t");
			check = io.leseString().equals("j");
			System.out.println("**********************************************************");

		}


	}
	public static void rechnen(int a, int b) {
		Taschenrechner rechner = new Taschenrechner();
		System.out.println( a + " + " +b + " = " + rechner.addiere(a, b) );
		System.out.println( a + " - " +b + " = " + rechner.subtrahiere(a, b) );
		System.out.println( a + " * " +b + " = " + rechner.multipiziere(a, b) );
		System.out.println( a + " / " +b + " = " + rechner.dividiere(a, b));
		System.out.println( a + " % " +b + " = " + rechner.modulo(a, b));
	}
}


