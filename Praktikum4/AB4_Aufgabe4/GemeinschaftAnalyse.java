class GemeinschaftAnalyse {
	
	void referenzen(){
		Datum d = new Datum(1,1,1990);
		Person p = new Person("Ute","Mai",d);
		Gemeinschaft g = new Gemeinschaft(p,new Person("Oleg","Loc"),new Datum(2,2,2013));
		g.getPartner1().setNachname("Loca");
		g.setPartner2(g.getPartner1());
		p.setVorname("Udo");
	}
}
