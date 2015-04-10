package intro.to.spock

import spock.lang.Specification


class Fields extends Specification {

	private static final int DEPOSIT_AMOUNT = 10

	Account account = new Account()
	
	def "New account has zero balance in default currency"() {
		expect:
		account.balance == 0
		account.currency == Account.Currency.USD
	}
	
	
	
	
	
	
	
	
	
	
	def "Account balance increases when you make a deposit"() {
		when:
		account.deposit(DEPOSIT_AMOUNT)
		
		then:
		account.balance == DEPOSIT_AMOUNT
		
		when:
		account.deposit(DEPOSIT_AMOUNT)
		
		then:
		account.balance == DEPOSIT_AMOUNT * 2		
	}
	
	
	
	
	
	
	
	
	
	
	
	def "Making a desposit returns the new balance"() {
		
		expect:
		account.deposit(DEPOSIT_AMOUNT) == DEPOSIT_AMOUNT
	}
	
	
	
	
	
	
	
	
	
	
	
	
	def "Depositing a negative amount throws an exception!"() {
		when: "you deposit a negative amount"
		account.deposit(-DEPOSIT_AMOUNT)
		
		then: "an exception is thrown and the balance does not change"
		thrown(IllegalArgumentException)
		account.balance == 0
	}
}
