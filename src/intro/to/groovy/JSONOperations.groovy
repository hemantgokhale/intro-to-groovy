package intro.to.groovy

import groovy.json.JsonBuilder
import groovy.json.JsonSlurper

// Read JSON
JsonSlurper slurper = new JsonSlurper()
def object = slurper.parseText('{"firstName": "Thomas"} /* JavaScript comment is OK */')

assert object instanceof Map
assert object.firstName == "Thomas"

// Write JSON
def builder = new JsonBuilder()
def root = builder.element {
		name 'Hydrogen'
		atomicNumber 1
	}
assert builder.toString() == '{"element":{"name":"Hydrogen","atomicNumber":1}}'

assert builder.toPrettyString() == '''\
{
    "element": {
        "name": "Hydrogen",
        "atomicNumber": 1
    }
}'''

