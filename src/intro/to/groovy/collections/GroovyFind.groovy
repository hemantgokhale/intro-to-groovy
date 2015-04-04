package intro.to.groovy.collections

import intro.to.groovy.Element;

import java.util.ArrayList;
import java.util.List;


List<Element> elements = [
	new Element("Hydrogen", "H", 1),
	null,
	new Element("Helium", "He", 2),
	new Element("Lithium", "Li", 3)]

println find(elements, 2)

Element find(List<Element> elements, int atomicNumber) {
	elements?.find {it?.number == atomicNumber}
}