package by.academy.homework5;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
	public static void main(String... args) {
		Map<Character, Integer> frequencyDictionary = new HashMap<>();
		String str = "sfhgsjnvjxnnvryxvnxjv";
		for (int i = 0; i < str.length(); i++) {
			if (frequencyDictionary.containsKey(str.charAt(i))) {
				frequencyDictionary.put(str.charAt(i), frequencyDictionary.get(str.charAt(i)) + 1);
			} else {
				frequencyDictionary.put(str.charAt(i), 1);
			}
		}
		System.out.println(frequencyDictionary.entrySet());
	}
}
