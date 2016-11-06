package domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void testMultiplication() {
	
		Dollar five = new Dollar(5);
		Dollar result = five.times(2);
		assertEquals(10, result.amount);
		result = five.times(3);
		assertEquals(30, result.amount);
	
	}
	

	@Test
	public void testFrancMultiplication() {
	
		Franc five = new Franc(5);
		Franc result = five.times(2);
		assertEquals(10, result.amount);
		result = five.times(3);
		assertEquals(15, result.amount);
	
	}
	
	
	
	@Test
	public void testEquality(){
		assertEquals(new Dollar(5), new Dollar(5));
		assertNotEquals(new Dollar(5), new Dollar(10));
	}
	

}
