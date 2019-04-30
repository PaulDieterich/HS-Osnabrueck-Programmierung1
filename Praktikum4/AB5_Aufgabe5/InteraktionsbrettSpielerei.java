public class InteraktionsbrettSpielerei
{
  Interaktionsbrett ib = new Interaktionsbrett();
  
  void TextAusgabe(){
      int laenge = ib.textlaenge("Puppenmord (1989)");
      ib.neueLinie(10, 1, laenge +5 ,1);

      ib.neuerText(10,10,"Puppenmord (1989)");
      ib.neueLinie(10, 10, laenge +5 ,10);
      ib.neueLinie(10, 12, laenge +5 ,12);
  }
  public void bewegDich(){
     ib.neuerKreis(this,"K1",30,30,10); 
    }
  public Boolean mitMausAngeklickt(String name, int x, int y){
      return false;
  }
  public Boolean mitMausVerschoben(String name, int x, int y){
      return true; 
  }
}
