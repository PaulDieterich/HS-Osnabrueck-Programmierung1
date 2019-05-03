
public class StudentenIO {
	private EinUndAusgabe io = new EinUndAusgabe();
	Studentenverwaltung sv = new Studentenverwaltung();

	
	public StudentenIO() {
		super();
	}
	public void studentenAnlegen(Studentenverwaltung sw) {
		String vorName = null;
		String nachName = null;
		String studiengang = null;

		String gehtsWeiter = "j";
		while (gehtsWeiter.equals("j")) {
			Student studi = null;
			io.ausgeben("Vorname: ");
			vorName = io.leseString();
			io.ausgeben("Nachname: ");
			nachName = io.leseString();
			io.ausgeben("Studiengang: ");
			studiengang = io.leseString();
			
			if(!(vorName == null && nachName == null && studiengang == null)) {
				studi = new Student();
				studi.setVorName(vorName);
				studi.setNachName(nachName);
				studi.setStudiengang(studiengang);
				sv.addStudent(studi);
			}
			io.ausgeben("\nWeitern Studenten eingeben [j|n]:");
			gehtsWeiter = io.leseString();
		}
		
		
	}
	public void EinAusgabe() {	
		io.ausgeben("Programm Studentenverwaltung gestartet! \n");
			studentenAnlegen(sv);		
		if(sv.anzahlStudenten() > 0) {
			io.ausgeben("\nAngelegt wurde: ");
			io.ausgeben(sv.getStudenten());
		}
		
		io.ausgeben("\n\nProgramm Studentenverwaltung beendet!");
		
	}
}


