package domain;

public class MoneyFabric {

	public static Dollar GetDollars(int amount){
		return new Dollar(amount);
	}
	
	public static Franc GetFranc(int amount){
		return new Franc(amount);
	}
}
