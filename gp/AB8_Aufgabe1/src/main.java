
public class main {

	/**
	 * Vor der Ausf�hrung
	 * a) false
	 * b) false
	 * c)true
	 * d)false
	 * e)true
	 * f)true - false weil es statswith auf gro� und kelinschreibung achtet
	 * g)true
	 * h)true
	 * i)true
	 * 
	 * -	substring(n) - gibt die letzen char eines strings zur�ck ab nten stelle
	 * - 	startsWith(" ") - gibt true oder false zur�ck, �berpruft ob der string mit den angegebenen zeichen anf�ngt
	 * - 	equalsIgnoreCase(" ") ignoiert gro� und klein schreibung
	 */
	public static void main(String[] args) {
		
		int x = 42;
		double y = 6.43;
		String z = "hallodele";
		
		//a
		System.out.println(x>42 || x<42);
		//b
		System.out.println(y*y>x && !(z.length()>12));
		//c
		System.out.println( !(y*y>x && z.length()>12));
				
		//d 
		System.out.println( !(y*y>x) && z.length()>12);
		//e
		System.out.println(z.substring(5).equals("dele") );
		//f
		System.out.println(! z.startsWith("hal"));
		//g
		System.out.println(z.equalsIgnoreCase("haLLOdeLE") );
		//h
		System.out.println( (x/10==4) && (x%10==2));
		//i
		System.out.println( (x/10==4) && (x%10==2));
	}
}
