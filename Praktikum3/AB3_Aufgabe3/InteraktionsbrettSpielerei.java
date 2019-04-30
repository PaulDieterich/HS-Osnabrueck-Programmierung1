import java.lang.String;
public class InteraktionsbrettSpielerei{    
  
  public void schoenesBield(){
      Interaktionsbrett brett = new Interaktionsbrett();
      int x= 10;
      int y= 10;
      int faktor = 50;
            for(int i = 0; i < 5; i++){
        if(i%2 == 0){
            brett.neuerKreis(x,y,faktor);
        }else{
            brett.neuerKreis(x,y+faktor,faktor);
        }
        x = 10+(faktor) + x ;
      }
  }
  //Interaktionsbrett ib, int x, int y, int faktor
  public void mondrian(Interaktionsbrett ib, int x, int y, int faktor){
      Interaktionsbrett brett = ib;
      
      brett.neuesRechteck(x,y,60*faktor,60*faktor);
      brett.neuesRechteck(x,y,30*faktor,30*faktor);
      brett.neuesRechteck(x,y,10*faktor,10*faktor);
   }
  public void watNu(){
       Interaktionsbrett ibrett = new Interaktionsbrett();
       mondrian(ibrett,10,10,2);
       mondrian(ibrett,10,10,1);
       mondrian(ibrett,40,40,1);
  }
  
  Interaktionsbrett ibrett = new Interaktionsbrett();
  
  public void startUhr(){
     
     ibrett.starteUhr();
     ibrett.textZeigen("Isch hab die uhr gefunden");    
  }
  public void stopUhr(){
         ibrett.stoppeUhr();
  }
  
}
   
