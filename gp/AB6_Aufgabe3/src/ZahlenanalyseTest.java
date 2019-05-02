
public class ZahlenanalyseTest {
	public static void main(String[] args) {
		Zahlenanalyse z = new Zahlenanalyse();

		System.out.println( "7 teilt 28 "+  z.istTeilerVon(7,28)) ;
		System.out.println( "7 teilt 29 "+  z.istTeilerVon(7,29)) ;
		System.out.println("Teiler von -1 " + z.alleTeilervon(-1));
		System.out.println("Teiler von 0 " + z.alleTeilervon(0));
		System.out.println("Teiler von 1 " + z.alleTeilervon(1));
		System.out.println("Teiler von 144 " + z.alleTeilervon(144));
		System.out.println("ggT(null, 42) "  + z.grossterGemeinsammerTeiler(null, 42));
		System.out.println("ggT(66, 99) "  + z.grossterGemeinsammerTeiler(66, 99));
		System.out.println("ggT(99, 66) "  + z.grossterGemeinsammerTeiler(99, 66));
		System.out.println("ggT(132, 133) "  + z.grossterGemeinsammerTeiler(132, 133));
		System.out.println("grossterGemeinsammerTeiler(156, 66) "  + z.grossterGemeinsammerTeiler(156, 66));
		System.out.println( "grossterGemeinsammerTeiler2(156,66) " + z.grossterGemeinsammerTeiler2(156,66));

		
		z.eingabeanalyse();
		z.abzahlungZeigen();
		z.zahlenRaten();
		
		z.zahlenRatenMitPC();
	}
}
