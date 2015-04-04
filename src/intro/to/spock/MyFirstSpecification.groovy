package intro.to.spock

import spock.lang.*


class MyFirstSpecification extends Specification {

	void emptyList() {
		
		List<String> list = new ArrayList()
		
		expect:
		list.size() == 0
	}
	
}
