package domain;

public class Dollar extends Currency{

	public Dollar(int amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Dollar times(int multiplier) {
		int result = amount*multiplier;
		return new Dollar(result);
	}

	
}
