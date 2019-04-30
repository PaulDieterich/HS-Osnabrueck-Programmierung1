public class Rechteck
{
    Punkt punkt;
    int breite;
    int hoehe; 
    
    public Rechteck(Punkt punkt, int breite, int hoehe){
        this.punkt = punkt;
        this.breite  = breite; 
        this.hoehe = hoehe; 
    }
    int getBreite(){
        return this.breite;   
    }
    void setBreite(int newBreite){
      this.breite = newBreite;
    }
    int getHoehe(){
       return this.hoehe;
    }
    void setHoehe(int newHoehe){
        this.hoehe = newHoehe;
    }
    void darstellung(Interaktionsbrett ib){
        Interaktionsbrett brett = ib;
        brett.neuesRechteck(this,"r1",punkt.getX(),punkt.getY(), getBreite(), getHoehe());
    }
}
