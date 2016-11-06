package domain;

public class Franc extends Currency{

	public Franc(int amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Franc times(int multiplier) {
		int result = amount*multiplier;
		return new Franc(result);
	}

}
