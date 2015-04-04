package intro.to.groovy.mop

class SearchableCollection {
	 
	def things = []
	
	def methodMissing(String name, Object args) {
		things.find { it[name.toLowerCase() - 'findby'] == args[0] }
	}
	
	def add(def thing) {
		things << thing
	}
}
