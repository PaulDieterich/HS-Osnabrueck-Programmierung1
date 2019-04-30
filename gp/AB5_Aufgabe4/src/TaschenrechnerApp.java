
public class TaschenrechnerApp {

	public static void main(String[] args) {
		Taschenrechner rechner = new Taschenrechner();
		EinUndAusgabe io = new EinUndAusgabe();

		Boolean check = true;
		while (check) {
			System.out.println("Geben sie Wert a ein: ");
			int a = io.leseInteger();
			System.out.println("Geben sie Wert b ein: ");
			int b = io.leseInteger();

			System.out.println( a + " + " +b + " = " + rechner.addiere(a, b) );
			System.out.println( a + " - " +b + " = " + rechner.subtrahiere(a, b) );
			System.out.println( a + " * " +b + " = " + rechner.multipiziere(a, b) );
			System.out.println( a + " / " +b + " = " + rechner.dividiere(a, b));

			System.out.println( a + " % " +b + " = " + rechner.modulo(a, b));
			System.out.println("\n Wollen sie weiter rechnen? <j | n>");
			check = io.leseString().equals("j");
			System.out.println("**********************************************************");

		}

	}

}
