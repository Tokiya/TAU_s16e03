package domain;

public class Dollar extends Money{

	public Dollar(int amount) {
		super(amount);
	}

	@Override
	public Dollar times(int multiplier) {
		int result = amount*multiplier;
		return new Dollar(result);
	}

	
}
