package domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void testMultiplication() {
	
		Dollar five = new Dollar(5);
		Dollar result = five.times(2);
		assertEquals(10, resul.amount);
		result = five.times(3);
		assertEquals(30, result.amount);
	
	}
	

}
