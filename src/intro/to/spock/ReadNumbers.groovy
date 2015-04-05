package intro.to.spock

import java.util.List;

def stream = getClass().getResource("/numbers.txt")
assert stream
List numbers = []
stream.eachLine {
	numbers << it.tokenize()?.collect{it.toInteger()}
}

println numbers
