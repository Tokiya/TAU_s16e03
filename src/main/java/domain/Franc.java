package domain;

public class Franc extends Money{

	public Franc(int amount) {
		super(amount);
	}

	@Override
	public Franc times(int multiplier) {
		int result = amount*multiplier;
		return new Franc(result);
	}

}
