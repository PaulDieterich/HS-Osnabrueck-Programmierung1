
public class Taschenrechner {

	public Integer addiere(int a, int b) {	
		int erg = a +  b;
		if(a > erg || b > erg) {
			System.out.println("Es Liegt ein Integer Overflow vor!");
			return null;
		}
		return erg;
	}
	public Integer subtrahiere(int a, int b) {
		int erg = a - b;
		if(a < erg || b < erg) {
			System.out.println("Es Liegt ein Integer Overflow vor!");
			return null;
		}
		return erg;
	}
	public int multipiziere(int a, int b) {
		return a * b;
	}
	public int dividiere(int a, int b) {
		return a / b;
	}
	public int modulo(int a, int b) {
		return a % b; 
	}
	
	
}
