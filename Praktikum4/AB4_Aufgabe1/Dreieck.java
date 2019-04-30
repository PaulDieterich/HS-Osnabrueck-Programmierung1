
public class Dreieck
{
    Linie a = new Linie(new Punkt(5, 10),new Punkt(10, 10));
    Linie b = new Linie(new Punkt(10, 10), new Punkt(20, 20));
    Linie c = new Linie(new Punkt(20, 20), new Punkt(5, 10));
    /*private Punkt punkt1;
    private Punkt punkt2; 
    private Punkt punkt3;*/
    
    
    
    void darstellung(Interaktionsbrett ib){
        Interaktionsbrett brett = ib;
        brett.neueLinie(a);
        
    }
    
}
