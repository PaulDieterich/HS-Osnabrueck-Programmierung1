public class Kreis
{     
   Punkt punkt;
   int radius; 
   
    public Kreis(Punkt punkt ,int radius){
        this.punkt = punkt;
        this.radius = radius;
    }
 
    int getRadius(){
        return this.radius;
    }
    void setRadius(int newRadius){
        this.radius = newRadius;
    }
    void darstellung(Interaktionsbrett ib){
        Interaktionsbrett brett = ib;
        brett.neuerKreis(this,"k1",punkt.getX(),punkt.getY(), getRadius());
    }
}