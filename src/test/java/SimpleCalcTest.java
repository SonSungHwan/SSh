import static org.junit.Assert.*;

import org.junit.Test;

import Simplecalc.SimpleCalc;

public class SimpleCalcTest {
	

	@Test
	public void testAdd() {
		SimpleCalc calc1 = new SimpleCalc();
		calc1.add(10,20);
		assertEquals(30,calc1.getResult());

	}

}
