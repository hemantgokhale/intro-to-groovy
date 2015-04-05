package intro.to.spock

import spock.lang.Specification
import spock.lang.Unroll;


class DataDrivenTests extends Specification {

	def "maximum of two numbers"() {
		expect:
		Math.max(0, 1) == 1
		Math.max(-1, 1) == 1
		Math.max(100, 12) == 100
	}
	
	def "maximum of two numbers using where block"(int a, int b, int c) {
		expect:
		Math.max(a, b) == c
		
		where:
		 a  |  b |  c
		  0 |  1 |   1
		 -1 |  1 |   1
		100 | 12 | 100
	}
	
	@Unroll
	def "maximum of #a and #b is #c"(int a, int b, int c) {
		expect:
		Math.max(a, b) == c
		
		where:
		 a  |  b |  c
		  0 |  1 |   1
		 -1 |  1 |   1
		100 | 12 | 100
	}

	
	@Unroll
	def "maximum of #a and #b is #c. (using data pipe)"(int a, int b, int c) {
		expect:
		Math.max(a, b) == c
		
		where:
		[a, b , c] << getNumbers()
	}

	List<List<Number>> getNumbers() {
		def stream = getClass().getResource("/numbers.txt"); assert stream
		List numbers = []
		stream.eachLine {
			numbers << it.tokenize()*.toInteger()
		}		
		numbers
	}
}
