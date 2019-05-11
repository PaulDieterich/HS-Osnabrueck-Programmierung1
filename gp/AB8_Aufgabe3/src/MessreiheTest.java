import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MessreiheTest {
  
  private Messreihe m1;
  private Messreihe m2;
  private Messreihe m3;
  private Messreihe m4;
  private Messreihe m5;
  private Messreihe m6;

  @Before
  public void setUp() throws Exception {
    m1 = new Messreihe("A");
    m1.hinzufuegen(4);
    m1.hinzufuegen(3);
    m1.hinzufuegen(4);
    m1.hinzufuegen(3);
    m1.hinzufuegen(2);
    m2 = new Messreihe("B");
    m2.hinzufuegen(3);
    m2.hinzufuegen(4);
    m2.hinzufuegen(2);
    m2.hinzufuegen(4);
    m2.hinzufuegen(3);
    m3 = new Messreihe("C");
    m3.hinzufuegen(4);
    m3.hinzufuegen(3);
    m3.hinzufuegen(2);
    m4 = new Messreihe("D");
    m4.hinzufuegen(5);
    m4.hinzufuegen(3);
    m4.hinzufuegen(3);
    m5 = new Messreihe("E");
    m6 = new Messreihe("F");
    m6.setMesswerte(null);
  }

  @Test
  public void testZweiGleicheInMessreihe1(){
    Assert.assertTrue(m1.zweiGleiche());
  }
  
  @Test
  public void testZweiGleicheInMessreihe2(){
    Assert.assertTrue(!m3.zweiGleiche());
  }
  
  @Test
  public void testVerschieden1(){
    Assert.assertTrue(!m1.verschieden(m2));
  }
  
  @Test
  public void testVerschieden2(){
    Assert.assertTrue(!m3.verschieden(m4));
  }
   
  @Test
  public void testAlleWerteGleichOft1(){
    Assert.assertTrue(m1.alleWerteGleichOft(m2));
  }
  
  @Test
  public void testAlleWerteGleichOft2(){
    Assert.assertTrue(!m2.alleWerteGleichOft(m3));
  }
  
  @Test
  public void testAlleWerteGleichOft3(){
    Assert.assertTrue(!m3.alleWerteGleichOft(m4));
  }
   
  @Test
  public void testGleicheWerte1(){
    Assert.assertTrue(m1.gleicheWerte(m2));
  }
  
  @Test
  public void testGleicheWerte2(){
    Assert.assertTrue(m2.gleicheWerte(m3));
  }
  
  @Test
  public void testGleicheWerte3(){
    Assert.assertFalse(m3.gleicheWerte(m4));
  }

}
