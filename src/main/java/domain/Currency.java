package domain;

public abstract class Currency{

	public int amount;

	public Currency(int amount) {
		this.amount = amount;
	}

	public abstract Currency times(int multiplier);

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Currency dollar = (Currency) o;

		return amount == dollar.amount;

	}
	
	@Override
	public int hashCode() {
		return amount;
	}
}
