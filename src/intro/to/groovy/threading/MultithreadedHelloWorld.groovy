package intro.to.groovy.threading

10.times { threadID ->
	Thread.start { println "$threadID. Hello world!" }
}