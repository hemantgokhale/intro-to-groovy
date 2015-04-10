package intro.to.spock

import spock.lang.*


class MyFirstSpecification extends Specification {

	void "A new list is empty"() {
		
		List<String> list = new ArrayList()
		
		expect:
		list.size() == 0
	}
	
}
