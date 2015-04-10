package intro.to.spock

class Account {

	public enum Currency { USD, CAD, JPY, AUZ }
	
	private double balance = 0
	private Currency currency = Currency.USD
	
	double deposit(double amount) {
		if (amount <= 0) 
			throw new IllegalArgumentException("You must deposit some real money!")
		balance += amount
	}
}
