package domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void testMultiplication() {
	
		Dollar five = MoneyFabric.GetDollars(5);
		Dollar result = five.times(2);
		assertEquals(MoneyFabric.GetDollars(10), result.amount);
		result = five.times(3);
		assertEquals(MoneyFabric.GetDollars(15), result.amount);
	
	}
	

	@Test
	public void testFrancMultiplication() {
	
		Franc five = MoneyFabric.GetFranc(5);
		Franc result = five.times(2);
		assertEquals(MoneyFabric.GetFranc(10), result.amount);
		result = five.times(3);
		assertEquals(MoneyFabric.GetFranc(15), result.amount);
	
	}
	
	
	
	@Test
	public void testEquality(){
		assertEquals(MoneyFabric.GetDollars(5), MoneyFabric.GetDollars(5));
		assertNotEquals(MoneyFabric.GetDollars(5), MoneyFabric.GetDollars(10));
		assertEquals(MoneyFabric.GetFranc(5), MoneyFabric.GetFranc(5));
		assertNotEquals(MoneyFabric.GetFranc(5), MoneyFabric.GetFranc(10));
	}
	

}
