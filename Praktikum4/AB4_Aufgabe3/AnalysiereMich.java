class AnalysiereMich
{
  Person p;
  
  AnalysiereMich(int kraft, int iq){
    p = new Person(kraft, iq);
  }
  
  void wasPassiert1(){
    p.setIq(p.getKraft() + p.getIq());
    p.setKraft(p.getIq() - p.getKraft());
    p.setIq(p.getIq() - p.getKraft());
  }
  
  void wasPassiert2(){
    p.setKraft(p.getKraft() + p.getKraft());
    Integer tmp = p.getKraft();
    p.setKraft(p.getKraft() + p.getKraft());
    p.setKraft(p.getKraft() + tmp);
  }

}
