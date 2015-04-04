package intro.to.groovy

import groovy.transform.ToString;

@ToString(includeNames=true, includePackage=true)
class Element {
	String name
	String symbol
	int number


	public Element(String name, String symbol, int number) {
		super();
		this.name = name;
		this.symbol = symbol;
		this.number = number;
	}	
}
