package collections;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		// find unique characters => set
		// Tree => sorted order
		// Hash =>
		// LinkedHash

		Set<Character> treeSet = new TreeSet<>(characters); // TreeSet is sorting the unique characters
		System.out.println("treeSet " + treeSet);

		Set<Character> linkedHashSet = new LinkedHashSet<>(characters); // returning the unique w/out sort // characters
																		// w/out sort
		System.out.println("linkedHashSet " + linkedHashSet);

	}

}
