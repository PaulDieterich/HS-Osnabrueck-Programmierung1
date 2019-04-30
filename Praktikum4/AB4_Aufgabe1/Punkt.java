public class Punkt
{
    int x; 
    int y; 
    
    public Punkt(int x, int y){
       this.setX(x); 
       this.setY(y);
    }
    int getX(){
       return this.x;
    }
    void setX(int newX){
       x = newX; 
    }
    int getY(){
       return this.y; 
    }
    void setY(int newY){
       y = newY;
    }
    void darstellung(Interaktionsbrett ib){
        Interaktionsbrett brett = ib;
        brett.neuerPunkt(getX(), getY());
    }
}
