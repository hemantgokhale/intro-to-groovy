package intro.to.groovy.collections

List<String> colors = ["Aero", "Aqua", "Auburn"]

// index from end of the list
assert colors[-1] == "Auburn"
 
// add an item to the list
colors << "Blue"
assert colors[3] == "Blue"

// replace item in the list
colors[2] = "Red"
assert colors[2] == "Red"

// slice
assert colors[1..3] == ["Aqua", "Red", "Blue"]

