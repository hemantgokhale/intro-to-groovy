package intro.to.groovy

//int a = 3, b = 4, c = 8
//assert c == a + b

assert 123 == "123" as int

List<String> names = ['Barack', 'George W']
names << 'Bill'
List<String> expected = ['Barack', 'George W'] 
assert expected == names