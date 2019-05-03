public class Punkt
{
    private int x; 
    private int y; 
    
    public Punkt(int x, int y){
       this.setX(x); 
       this.setY(y);
    }
    public int getX(){
       return this.x;
    }
    public void setX(int newX){
       x = newX; 
    }
    public int getY(){
       return this.y; 
    }
    public void setY(int newY){
       y = newY;
    }
    public void darstellung(Interaktionsbrett ib){
        Interaktionsbrett brett = ib;
        brett.neuerPunkt(getX(), getY());
    }
    @Override
    public String toString() {
    	
		return x + "," +y;
    	
    }
    
}
