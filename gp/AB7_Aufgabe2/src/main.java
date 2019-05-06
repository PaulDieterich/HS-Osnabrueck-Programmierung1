
public class main {
	
	
	public static void main(String[] args) {
		Messreihe m = new Messreihe();
		m.setMessort("Bremen");
		m.hinzufuegen(1);
		m.hinzufuegen(7);
		m.hinzufuegen(4);
		m.hinzufuegen(4);
		m.hinzufuegen(2);
		
		System.out.println(m.toString());
		System.out.println("Minimum ist: " + m.min());
		System.out.println("Durchschnitt liegt bei: " + m.druchschnitt());
		m.anzahkZwischen(2,4);
	}
}
