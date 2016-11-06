package domain;

public class Money{

	protected int amount;
	protected String currency;

	public Money(int amount) {
		this.amount = amount;
	}

	public static Money dollar(int amount){
		Money money = new Money(amount);
		money.currency = "USD";
		return money;
	}
	
	public static Money franc(int amount){
		Money money = new Money(amount);
		money.currency = "CHF";
		return money;
	}

	public String currency() {
		return this.currency;
	}

	public Money times(int multiplier) {
		int result = amount*multiplier;
		return new Money(result);
	}
	
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
