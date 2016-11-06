package domain;

public class Money {

	private int amount;
	private String currency;

	public String currency() {
		return currency;
	}

	public Money(int amount) {
		this.amount = amount;
	}

	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public Money times(int multiplier) {
		int result = amount * multiplier;
		return new Money(result, currency);
	}

	public static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	public static Money franc(int amount) {
		return new Money(amount, "CHF");
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Money money = (Money) o;

		return amount == money.amount && currency == money.currency;

	}

	public Expression plus(Money addend) {
		return new Sum(this, addend);
	}

}
