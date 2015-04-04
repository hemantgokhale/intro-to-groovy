package intro.to.groovy.collections

List<String> colors = ["aqua", "Aero", "Auburn"]
colors.sort{a, b -> a.compareToIgnoreCase(b)}
println "Sorted colors: $colors"

