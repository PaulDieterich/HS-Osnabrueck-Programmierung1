class Gemeinschaft {
    Person partner1;
    Person partner2;
    Datum schliessung;
    
    Gemeinschaft(Person partner1, 
                 Person partner2, 
                 Datum schliessung){
         this.partner1 = partner1;
         this.partner2 = partner2;
         this.schliessung = schliessung;
    }

	public Person getPartner1() {
		return partner1;
	}

	public void setPartner1(Person partner1) {
		this.partner1 = partner1;
	}

	public Person getPartner2() {
		return partner2;
	}

	public void setPartner2(Person partner2) {
		this.partner2 = partner2;
	}

	public Datum getSchliessung() {
		return schliessung;
	}

	public void setSchliessung(Datum schliessung) {
		this.schliessung = schliessung;
	}
}