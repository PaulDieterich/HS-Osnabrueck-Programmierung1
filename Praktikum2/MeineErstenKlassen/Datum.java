
/**
 * Beschreiben Sie hier die Klasse Datum.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Datum
{
    int tag; 
    int monat; 
    int jahr;
    Datum(int tag, int monat, int jahr){
     this.tag = tag; 
     this.monat = monat; 
     this.jahr = jahr; 
       
    }
    
    Datum(int jahr){
    this(1,1,jahr);
    }
    Datum(){
    
    }
}
