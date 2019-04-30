public class GeoObjektSpielerrei{   
    
    /* Alles für den Kopf*/
    Punkt k1 = new Punkt(10,10);
    Kreis kopf = new Kreis(k1,50);
    /* Alles für das Linke Auge*/
    Punkt d1 = new Punkt(75,25);
    Punkt d2 = new Punkt(75,40);
    Punkt d3 = new Punkt(65,40);
    Dreieck linkesAuge = new Dreieck(d1,d2,d3);
    /* Alles für das rechte Auge*/
    Punkt topRechts = new Punkt(25,25);
    Rechteck rechtesAuge = new Rechteck(topRechts,10,10);
    /* alles fpr die nase*/
    Punkt nase = new Punkt(60,60);
    /* Alles für die linie*/
    Punkt p1 = new Punkt(40,80);
    Punkt p2 = new Punkt(80,80);
    Linie munt = new Linie(p1,p2);
    
    Interaktionsbrett brett = new Interaktionsbrett();
    
    GeoObjektSpielerrei(Kreis kopf, Dreieck linkesAuge,Rechteck rechtesAuge,Punkt nase,Linie munt){
        this.kopf = kopf; 
        this.linkesAuge = linkesAuge;
        this.rechtesAuge = rechtesAuge; 
        this.nase = nase; 
        this.munt = munt;      
    }
    GeoObjektSpielerrei(){}
    void zeichnen(){
        kopf.darstellung(brett);
        linkesAuge.darstellung(brett);
        rechtesAuge.darstellung(brett);
        nase.darstellung(brett);
        munt.darstellung(brett);
        
    }
    
}
