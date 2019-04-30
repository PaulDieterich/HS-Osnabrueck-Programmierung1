public class Linie
{
    Punkt p1;
    Punkt p2;
    
    public Linie(Punkt p1, Punkt p2){
        this.p1 = p1;
        this.p2 = p2;
    }
  
    void darstellung(Interaktionsbrett ib){
        Interaktionsbrett brett = ib;
        brett.neueLinie(p1.getX(),p1.getY(), p2.getX(), p2.getY());
    }
}
