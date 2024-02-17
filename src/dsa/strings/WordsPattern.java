package dsa.strings;

import java.util.HashMap;

public class WordsPattern {

	static boolean words(String pattern, String s) {
		String[] arr = s.split(" ");
		if (pattern.length() != arr.length) {
			return false;
		}
		HashMap<Character, String> hm = new HashMap<>();
		for (int i = 0; i < pattern.length(); i++) {

			char ch = pattern.charAt(i);
			boolean containsKey = hm.containsKey(ch);
			if (hm.containsValue(arr[i]) && !containsKey) {
				return false;
			} else if (containsKey && !hm.get(ch).equals(arr[i])) {
				return false;
			} else {
				hm.put(ch, arr[i]);
			}

		}
		return true;
	}

	public static void main(String[] args) {

		String s = "hiii hi hello hii";
		String pattern = "abca";
		System.out.println(words(pattern, s));
	}

}
