
public class TaschenrechnerApp {

	public static void main(String[] args) {
		Taschenrechner rechner = new Taschenrechner();
		
		
		int a = 5;
		int b = 3; 
		
		System.out.println( a + " + " +b + " = " + rechner.addiere(Integer.MAX_VALUE, b) );
		System.out.println( a + " - " +b + " = " + rechner.subtrahiere(Integer.MIN_VALUE, b) );
		System.out.println( a + " * " +b + " = " + rechner.multipiziere(a, b) );
		System.out.println( a + " / " +b + " = " + rechner.dividiere(a, b));
	}

}
