package intro.to.spock

import spock.lang.Specification


class Conditions extends Specification {

	Stack stack
	
	// Use a setup() method if you need more than simple field initialization
	def setup() {
		stack = new Stack()
		assert stack.empty()	// use explicit assert outside of "then" and "expect" blocks
	}
	
	def "Poping an empty stack throws an exception"() {
		when:
		stack.pop()
		
		then:
		thrown(EmptyStackException)	// confirm exception is thrown
		stack.empty()				// test continues after confirming exception is thrown
	}
	
	def "Poping an empty stack throws an exception alternate syntax"() {
		when:
		stack.pop()
		
		then:
		EmptyStackException e = thrown()	// confirm exception is thrown
		e.cause == null						// you can query the exception using this syntax
		stack.empty()
	}
	
	def "HashMap accepts a null key"() {
		HashMap map = new HashMap()
		
		when:
		map.put(null, "some value")
		
		then:
		notThrown(NullPointerException)	// confirm exception is not thrown
	}
	
}
