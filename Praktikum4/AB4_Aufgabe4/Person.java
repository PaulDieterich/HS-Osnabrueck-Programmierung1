class Person {
    String vorname;
    String nachname;
    Datum geburtsdatum;
    
    Person(String vor, String nach, Datum datum){
        this.vorname = vor;
        this.nachname = nach;
        this.geburtsdatum = datum;
    }
    
    Person(String vor, String nach){
        this.vorname = vor;
        this.nachname = nach;
        this.geburtsdatum = new Datum(42);
    }

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public Datum getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(Datum geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

}