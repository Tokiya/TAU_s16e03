package domain;

public class Money {

	private int _amount;
	private String _currency;

	public String currency() {
		return _currency;
	}

	public Money(int amount) {
		this._amount = amount;
	}

	public Money(int amount, String currency) {
		this._amount = amount;
		this._currency = currency;
	}

	public Money times(int multiplier) {
		int result = _amount * multiplier;
		return new Money(result,_currency);
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

		return _amount == money._amount && _currency == money._currency;

	}

	@Override
	public int hashCode() {
		return _amount;
	}
}
