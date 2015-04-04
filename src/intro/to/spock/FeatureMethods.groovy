package intro.to.spock

import spock.lang.Specification


class FeatureMethods extends Specification {

	def "Splicing a list"() {
		setup:
		List names = ["George", "John", "Thomas", "James"]
		
		when:
		def fragment = names[1..2]
		
		then:
		fragment == ["John", "Thomas"]
	}
	
	def "setup label is optional"() {
		
		List names = ["George", "John", "Thomas", "James"]
		
		when:
		def fragment = names[1..2]
		
		then:
		fragment == ["John", "Thomas"]
	}
	
	def "using expect instead of when/then"() {
		
		List names = ["George", "John", "Thomas", "James"]
		
		expect:
		names[1..2] == ["John", "Thomas"]
	}
	
	def "using cleanup block"() {
		setup:
		File file = new File("/tmp/test.txt")
		file.createNewFile()
		
		expect:
		file.isFile()
		
		cleanup:
		file?.delete()
	}
}
