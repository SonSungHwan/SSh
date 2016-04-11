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
	
	@Test
	public void testSub() {
		SimpleCalc calc1 = new SimpleCalc();
		calc1.sub(20,10);
		assertEquals(10,calc1.getResult());

	}
	
	@Test
	public void testMul() {
		SimpleCalc calc1 = new SimpleCalc();
		calc1.mul(20,10);
		assertEquals(200,calc1.getResult());

	}

	public void testDiv() {
		SimpleCalc calc1 = new SimpleCalc();
		calc1.div(20,10);
		assertEquals(2,calc1.getResult());

	}
}
