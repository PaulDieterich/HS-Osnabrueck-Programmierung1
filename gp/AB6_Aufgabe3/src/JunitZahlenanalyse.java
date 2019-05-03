import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class JunitZahlenanalyse {

	Zahlenanalyse z = new Zahlenanalyse();
	
	@Test 
	public void testClassExist() {
		try {
	        Class.forName("Zahlenanalyse");
	    } catch (ClassNotFoundException e) {
	        Assert.fail("no Class with name 'Zahlenanalyse'");
	    }
	}
}