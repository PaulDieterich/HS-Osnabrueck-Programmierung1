public class Produkt
{
    String name;
    String produktnummer; 
    int preis; 
    
    
    
    Produkt(String name, String produktnummer, int preis){
        this.name = name; 
        this.produktnummer = produktnummer; 
        this.preis = preis; 
    }
    Produkt(String produktnummer, int preis, String name){
        this(name,produktnummer,preis);
    }
    Produkt( int preis,String produktnummer,String name){
        this(name,produktnummer,preis);
    }
    Produkt(String produktnummer, int preis){
      this(null,produktnummer,preis);
    }
    Produkt(int preis, String produktnummer){
        this(null,produktnummer, preis);
    }
    Produkt(String produktnummer, String name){
    
    }
    Produkt(String produktnummer){
        this(null,produktnummer,0);
    }
    Produkt(int preis){
        this(null,null,preis);
    }
    Produkt(){}
}
