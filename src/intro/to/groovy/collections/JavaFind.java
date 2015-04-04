package intro.to.groovy.collections;

import intro.to.groovy.Element;

import java.util.ArrayList;
import java.util.List;

public class JavaFind {

	public static void main(String[] args) {
		List<Element> elements = new ArrayList<Element>();
		elements.add(new Element("Hydrogen", "H", 1));
		elements.add(null);
		elements.add(new Element("Helium", "He", 2));
		elements.add(new Element("Lithium", "Li", 3));

		System.out.println(find(elements, 2));
	}

	private static Element find(List<Element> elements, int number) {
		Element found = null;
		if (elements != null) {
			for (Element element : elements) {
				if (element != null) {
					if (element.getNumber() == number) {
						found = element;
						break;
					}
				}
			}
		}
		return found;
	}
}
