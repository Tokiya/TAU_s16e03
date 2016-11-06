package domain;

public abstract class Money{

	protected int amount;

	public Money(int amount) {
		this.amount = amount;
	}

	public abstract Money times(int multiplier);

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Money dollar = (Money) o;

		return amount == dollar.amount;

	}
	
	@Override
	public int hashCode() {
		return amount;
	}
}
