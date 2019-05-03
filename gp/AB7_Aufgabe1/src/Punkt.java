public class Punkt
{
	private Integer x; 
	private Integer y; 

	public Punkt(int x, int y){
		this.setX(x); 
		this.setY(y);
	}
	public Integer getX(){
		return this.x;
	}
	public void setX(int newX){
		if(newX > 0) {
			x = newX; 
		}else {
			System.out.println("x darf nur eine positive ganzzahl sein");
		}
		
	}
	public Integer getY(){
		return this.y; 
	}
	public void setY(int newY){
		if(newY > 0) {
			y = newY; 
		}else {
			System.out.println("y darf nur eine positive ganzzahl sein");
		}
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
