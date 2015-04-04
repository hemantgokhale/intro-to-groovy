package intro.to.spock

import spock.lang.Specification


class Fields extends Specification {

	List names = ["George", "John", "Thomas", "James"]
	
	def "Splicing a list"() {
		when:
		def fragment = names[1..2]
		
		then:
		fragment == ["John", "Thomas"]
	}
	
	def "Splicing a list; using when/then blocks"() {
		
		when:
		def fragment = names[1..2]
		
		then:
		fragment == ["John", "Thomas"]
	}
	
	def "Splicing a list using expect block"() {
		
		expect:
		names[1..2] == ["John", "Thomas"]
	}
}
