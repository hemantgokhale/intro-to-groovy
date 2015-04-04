package intro.to.groovy

// A simple closure
Closure c1 = { println "This is a simple closure"}
c1()

// A closure that takes one argument
Closure c2 = { String str -> println "This closure was called with '$str'"}
c2("some text")

// A closure that takes two arguments
Closure c3 = { String str, int i -> println "This closure was called with '$str' and '$i'"}
c3("some text", 5)

// If there is only one argument, it has a default name 'it'
Closure c4 = { println "This closure was called with one argument: '$it'" }
c4("xyz")

// Closure as a method argument

void arithmaticOperation(Number n1, Number n2, Closure operation) {
	Number result = operation(n1, n2)
	println "The result of this operation is: $result"
}

Closure add = {Number a, Number b -> a + b}
Closure subtract = {Number a, Number b -> a - b}

arithmaticOperation(10, 5, add)
arithmaticOperation(10, 5, subtract)

// in-line closure definition
arithmaticOperation(10, 5, {Number a, Number b -> a * b})

// Special syntax when Closure is the last argument
arithmaticOperation(10, 5) {Number a, Number b -> a / b}


