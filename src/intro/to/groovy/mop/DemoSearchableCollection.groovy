package intro.to.groovy.mop

import intro.to.groovy.Element

def elements = new SearchableCollection()
elements.things.add(new Element('Hydrogen', 'H', 1)) 
elements.things.add(new Element('Helium', 'He', 2))
elements.things.add(new Element('Lithium', 'Li', 3))
elements.things.add(new Element('Beryllium', 'Be', 4))

println elements.findbyName("Hydrogen")
println elements.findbySymbol("Li")
println elements.findbyNumber(4)
