import static org.junit.Assert.*;

import java.util.concurrent.RejectedExecutionHandler;

import org.junit.Assert;
import org.junit.ClassRule;

import org.junit.Test;

public class TaschenrechnerTest {
	
	
	Taschenrechner rechner = new Taschenrechner();
	int a = 5;
	int b = 3;
	
	@Test 
	public void testClassExist() {
		try {
	        Class.forName("Taschenrechner");
	    } catch (ClassNotFoundException e) {
	        Assert.fail("no Class with name 'Taschenrechner'");
	    }
	}
	
	@Test
	public void testAddiere() {	
	
		assertEquals(8, (int) rechner.addiere(a, b) );
		
	}
	@Test
	public void testSubtrahiere() {	
		
		assertEquals(2,(int) rechner.subtrahiere(a, b));
	}
	@Test
	public void testMultipiziere() {
		assertEquals(15, rechner.multipiziere(a, b));
	}
	@Test
	public void testDividiere() {
		assertEquals(1, rechner.dividiere(a, b));
	}
	@Test
	public void testModulo() {
		assertEquals(2, rechner.modulo(a, b));
	}

}
