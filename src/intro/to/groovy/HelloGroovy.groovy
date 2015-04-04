package intro.to.groovy

import groovy.json.JsonBuilder
import groovy.json.JsonOutput;
import groovy.json.JsonSlurper

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

String subject = args ? args[0] : "World" 
println "Hello $subject!"

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