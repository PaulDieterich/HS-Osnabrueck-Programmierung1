
public class Aufgabe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quadrierenMitWhile(2);
		peppiono(2);
	}
	public static void peppiono(double a) {
		double wert = 0;
		while (wert <= 100) {
			wert = a*2;
			a = wert;
			System.out.println(a);
		}
	}

	public static void quadrierenMitWhile(double wert){

		while (wert < 200000) {
			System.out.println(wert);
			double neuerWert = Math.pow(wert,2);
			wert = neuerWert;
		}

	}
	public static void quadrierenMitDoWhile(double wert){

		do {
			double neuerWert = wert*wert;
			System.out.println(neuerWert);
			wert = neuerWert;
		}while (wert < 200000);

	}
}
