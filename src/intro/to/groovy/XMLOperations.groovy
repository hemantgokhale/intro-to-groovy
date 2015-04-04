package intro.to.groovy

def xmlText = '''\
<langs type='current'>
  <language>Java</language>
  <language>Groovy</language>
  <language>JavaScript</language>
</langs>'''

// Reading XML
def rootNode = new XmlSlurper().parseText(xmlText)

assert rootNode.name() == 'langs'
assert rootNode.@type == 'current'
assert rootNode.language.size() == 3
assert rootNode.language[0].text() == 'Java'


// Writing XML
def writer = new StringWriter()
def builder = new groovy.xml.MarkupBuilder(writer)
builder.langs(type:"current"){
  language("Java")
  language("Groovy")
  language("JavaScript")
}

assert writer.toString() == xmlText