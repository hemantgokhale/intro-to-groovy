package intro.to.spock

import java.util.concurrent.TimeUnit;

import spock.lang.IgnoreIf;
import spock.lang.Requires;
import spock.lang.Specification
import spock.lang.Timeout;


class DemoExtentions extends Specification {

	Stack stack
	
	// Use a setup() method if you need more than simple field initialization
	def setup() {
		stack = new Stack()
		assert stack.empty()	// use explicit assert outside of "then" and "expect" blocks
	}
	
	@Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
	def "Poping an empty stack throws an exception"() {
		//sleep(100)
		
		when:
		stack.pop()
		
		then:
		thrown(EmptyStackException)	// confirm exception is thrown
		stack.empty()				// test continues after confirming exception is thrown
	}
	
	@Requires({System.getProperty("os.name").contains("windows")})
	def "Poping an empty stack throws an exception alternate syntax"() {
		when:
		stack.pop()
		
		then:
		EmptyStackException e = thrown()	// confirm exception is thrown
		e.cause == null						// you can query the exception using this syntax
		stack.empty()
	}
	
	@IgnoreIf({System.getProperty("os.name").contains("Mac")})
	def "HashMap accepts a null key"() {
		HashMap map = new HashMap()
		
		when:
		map.put(null, "some value")
		
		then:
		notThrown(NullPointerException)	// confirm exception is not thrown
	}
	
}
