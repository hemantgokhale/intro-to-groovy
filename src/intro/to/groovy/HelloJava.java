package intro.to.groovy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HelloJava {
	Map<String, String> colors = new HashMap<>();
	public static void main(String[] args) {
		String subject = args.length > 0 ? args[0] : "World";
		System.out.println("Hello " + subject + "!");
		
		List<String> list = Arrays.asList("a", "a", "b", "c");
		Set<String> set = new HashSet<String>(list);
		System.out.println(set);
	}
}
