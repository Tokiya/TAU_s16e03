package domain;

public class Money{

	protected int amount;
	protected String currency;

	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public static Money dollar(int amount){
		return new Money(amount, "USD");
	}
	
	public static Money franc(int amount){
		return new Money(amount, "CHF");
	}

	public String currency() {
		return this.currency;
	}

	public Money times(int multiplier) {
		int result = amount*multiplier;
		return new Money(result, currency);
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Money dollar = (Money) o;

		return amount == dollar.amount;

	}
}
