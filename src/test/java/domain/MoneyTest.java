package domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void testMultiplication() {
	
		Dollar five = Money.dollar(5);
		Dollar result = five.times(2);
		assertEquals(Money.dollar(10), result);
		result = five.times(3);
		assertEquals(Money.dollar(15), result);
	
	}
	

	@Test
	public void testFrancMultiplication() {
	
		Franc five = Money.franc(5);
		Franc result = five.times(2);
		assertEquals(Money.franc(10), result);
		result = five.times(3);
		assertEquals(Money.franc(15), result);
	
	}
	
	
	
	@Test
	public void testEquality(){
		assertEquals(Money.franc(5), Money.franc(5));
		assertNotEquals(Money.franc(5), Money.franc(10));
		assertEquals(Money.franc(5), Money.franc(5));
		assertNotEquals(Money.franc(5), Money.franc(10));
	}
	

}
