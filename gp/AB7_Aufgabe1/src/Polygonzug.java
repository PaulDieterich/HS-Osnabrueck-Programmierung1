import java.util.ArrayList;

public class Polygonzug  {

	private ArrayList<Punkt> PunktList = new ArrayList<>();
	private boolean geschlossen = false;
	public void anfuegen(Punkt p) {
		PunktList.add(p);
	}
	public void darstellen(Interaktionsbrett ib) {
		Interaktionsbrett brett = ib;
		for(int i = 0 ; i < PunktList.size(); ++i) {
			int p1x = PunktList.get(i).getX();
			int p1y = PunktList.get(i).getY();
			int p2x = PunktList.get(i+1).getX();
			int p2y = PunktList.get(i+1).getY();
			brett.neueLinie(p1x, p1y,p2x,p2y);
		}		
		if(PunktList.get(0) == PunktList.get(PunktList.size() -1)) {
			geschlossen = true;
		}
	}
	public void einefuegenVor(int position, Punkt p) {
		PunktList.add(position, p);
	}
	public boolean getGeschlossen() {
		if(PunktList.get(0) == PunktList.get(PunktList.size()-1)) {
			geschlossen = true;
		}
		geschlossen = false;
		return false;
	}
	
	public void loeschenAn(int position) {
		PunktList.remove(position);
	}
	public void punktBearbeitenAn(int position, int neuX, int neuY) {
		PunktList.remove(position);
		PunktList.add(position-1, new Punkt(neuX,neuY ));
	}
	public void setGeschossen(boolean b) {
		if(!b) {
			PunktList.add(PunktList.get(0));
		}else {
			PunktList.remove(PunktList.get(PunktList.size()-1));
		}
	}
	@Override
	public String toString() {
		String outPut = " ";
		for(int i = 0; i < PunktList.size(); ++i) {
			outPut = outPut.concat("x"+i+": " +PunktList.get(i).getX() + " - " + "y"+i+": " + PunktList.get(i).getY());
		}
		return outPut;
	}
}
