package collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		// Given a String: "blah blah blah"
		// How many times each character is present in a string

		String str = "This is a great thing. " + "This has never happened before.";

		Map<Character, Integer> occurances = new HashMap<>();

		char[] characters = str.toCharArray();
		for (char character : characters) {
			// Get the characters and check inside the hashmap
			// if not there, initialize to 1
			// if it is there, increment the count

			Integer integer = occurances.get(character);
			if (integer == null) {
				occurances.put(character, 1);
			} else {
				occurances.put(character, integer + 1);
			}
		}

		System.out.println(occurances);

		// Given a String: "blah blah blah"
		// How many times each word is present in a string

		Map<String, Integer> stringOccurances = new HashMap<>();
		String[] words = str.split(" ");

		for (String word : words) {
			// Get the characters and check inside the hashmap
			// if not there, initialize to 1
			// if it is there, increment the count

			Integer integer = stringOccurances.get(word);
			if (integer == null) {
				stringOccurances.put(word, 1);
			} else {
				stringOccurances.put(word, integer + 1);
			}
		}

		System.out.println(stringOccurances);

	}

}
