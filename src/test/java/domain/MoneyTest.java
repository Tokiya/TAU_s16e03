package domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void testMultiplication() {
	
		Dollar five = new Dollar(5);
		Dollar result = five.times(2);
		assertEquals(10, five.amount);
		result = five.times(3);
		assertEquals(15, result.amount);
	
	}
	

}
