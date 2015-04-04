package intro.to.spock

import spock.lang.Specification


class Conditions extends Specification {

	Stack stack
	
	def setup() {
		stack = new Stack()
		assert stack.empty()
	}
	
	def "Poping an empty stack throws an exception"() {
		when:
		stack.pop()
		
		then:
		thrown(EmptyStackException)
		stack.empty()
	}
	
	def "HashMap accepts a null key"() {
		HashMap map = new HashMap()
		
		when:
		map.put(null, "some value")
		
		then:
		notThrown(NullPointerException)
	}
	
	def "HashTable does not accept null keys"() {
		Hashtable<String, String> table = new Hashtable()
		
		when:
		table.put(null, "some value")
		
		then:
		NullPointerException e = thrown()
		e.cause == null
	}
}
