
public class Student {

	
	private String vorName; 
	private String nachName; 
	private String studiengang;
	
	public Student(String vorName, String nachName, String Studiengang) {
		this.vorName = getVorName();
		this.nachName = getNachName();
		this.studiengang = getStudiengang();
	}
	public Student(String vorName, String nachName) {
		this(vorName, nachName, null);
	}
	public Student() {}
	public String getVorName() {
		return vorName;
	}

	public void setVorName(String vorName) {
		this.vorName = vorName;
	}

	public String getNachName() {
		return nachName;
	}

	public void setNachName(String nachName) {
		this.nachName = nachName;
	}

	public String getStudiengang() {
		return studiengang;
	}

	public void setStudiengang(String studiengang) {
		this.studiengang = studiengang;
	}
	@Override
	public String toString() {
			return "Vorname: " + this.vorName + " Nachname: " + this.nachName + " Studiengang: " + this.studiengang; 
	}
	
	
}
