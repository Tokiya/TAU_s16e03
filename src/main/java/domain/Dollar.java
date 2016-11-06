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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Dollar dollar = (Dollar) o;

		return amount == dollar.amount;

	}

	@Override
	public int hashCode() {
		return amount;
	}
}
