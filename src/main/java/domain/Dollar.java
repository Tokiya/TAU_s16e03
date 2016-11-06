package domain;

public class Dollar {

	public int amount;

	public Dollar(int amount) {
		this.amount = amount;
	}

	public Dollar times(int multiplier) {

		int result = amount*multiplier;
		return new Dollar(result);
	}

}
