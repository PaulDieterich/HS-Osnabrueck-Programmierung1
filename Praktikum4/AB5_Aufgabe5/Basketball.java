 public class Basketball
{
    Interaktionsbrett ib;
    Kreis kreis = new Kreis(new Punkt(30,30),30);
    Rechteck rechteck = new Rechteck(new Punkt(100,100),80,80);
  public void bewegDich(){
    this.ib = new Interaktionsbrett(); 
    this.rechteck.darstellung(ib); 
        // this.kreis.darstellung(ib);
    // this.rechteck.darstellung(ib);    
    }
   public Boolean mitMausAngeklickt(String name, int x, int y){
    
        return true;
    }
    public Boolean mitMausVerschoben(String name, int x, int y){
        return true; 
    }  
    public Boolean mitMausLoslassen(String name, int x, int y){
      
        return true;
    }
}
