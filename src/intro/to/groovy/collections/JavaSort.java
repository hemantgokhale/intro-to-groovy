package intro.to.groovy.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaSort {

	public static void main(String[] args) {
		List<String> colors = 
				Arrays.asList("aqua", "Aero", "Auburn");
		
		Collections.sort(colors, new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				return s1.compareToIgnoreCase(s2);
			}
			
		});
		
		System.out.println("Sorted colors: " + colors);
	}
}
