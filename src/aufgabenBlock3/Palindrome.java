package aufgabenBlock3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useDelimiter("\n");
		System.out.print("Geben Sie einen Satz ein: ");
		String input = sc.next();
		sc.close();

		Map<String, String> palindromes = new HashMap<String, String>();
		for (String w : getWords(input)) {
			if (isPalindrome(w)) {
				palindromes.put(w, getReversed(w));
			}
		}
		System.out.println("Palindromes:");
		for (Entry<String, String> p : palindromes.entrySet()) {
			System.out.format("%s\t|\t%s\n", p.getKey(), p.getValue());
		}
	}

	public static boolean isPalindrome(String str) {
		if (str.toLowerCase().equals(getReversed(str.toLowerCase()))) {
			return true;
		}
		return false;

	}

	public static List<String> getWords(String s) {
		List<String> allMatches = new ArrayList<String>();
		Matcher m = Pattern.compile("[\\pL]+",
				Pattern.UNICODE_CHARACTER_CLASS | Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE).matcher(s);
		while (m.find()) {
			allMatches.add(m.group());
		}
		return allMatches;
	}

	public static String getReversed(String s) {
		return new StringBuilder(new String(s.toCharArray())).reverse().toString();

	}
}
