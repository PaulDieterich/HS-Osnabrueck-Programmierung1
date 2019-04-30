class Bewegung{
    EinUndAusgabe io;
    Interaktionsbrett ib;
    String kreis1 = "K1";
    String kreis2 = "K2";

    Bewegung(){
        this.io = new EinUndAusgabe();
        this.ib = new Interaktionsbrett(); 
        this.ib.neuerKreis(this,kreis1,50,50,80); 
        this.ib.neuerKreis(this,kreis2,90,30,10); 
    }
    
    public Boolean mitMausAngeklickt(String name, int x, int y){ 
        this.io.ausgeben("Kreis "+name+" angeklickt an Position ("+x+","+y+")\n");
        return true;
    } 
    public Boolean mitMausVerschoben(String name, int x, int y){ 
        this.io.ausgeben("Kreis "+name+" verschoben nach Position ("+x+","+y+")\n");
        return true; 
    } 
}
