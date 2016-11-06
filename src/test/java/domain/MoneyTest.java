package domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void testMultiplication() {
	
		Money five = Money.dollar(5);
		Money result = five.times(2);
		assertEquals(Money.dollar(10), result);
		result = five.times(3);
		assertEquals(Money.dollar(15), result);
	
	}
	

	@Test
	public void testFrancMultiplication() {
	
		Money five = Money.franc(5);
		Money result = five.times(2);
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
	
	@Test
	public void testCurrency(){
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}
	
	@Test
	public void testPlusReturnsSum(){
		Money five = Money.dollar(5);
		Money ten = Money.dollar(10);
		
		Expression expression = five.plus(ten);
		Sum sum = (Sum)expression;
		
		assertEquals(five, sum.augend);
		assertEquals(ten, sum.addend);
	}

}












