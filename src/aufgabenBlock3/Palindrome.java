package aufgabenBlock3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useDelimiter("\n");
		System.out.print("Geben Sie einen Satz ein: ");
		String input = sc.next();
		sc.close();

		System.out.println("Palindrome:");

		printMapAsTable(getPalindromes(input));
	}

	public static String getReversed(String s) {
		return new StringBuilder(new String(s.toCharArray())).reverse().toString();

	}

	public static String getIfPalindrome(String str) {
		String reversed = getReversed(str);
		if (str.toLowerCase().equals(reversed.toLowerCase())) {
			return reversed;
		}
		return null;

	}

	public static Map<String, String> getPalindromes(String s) {
		Map<String, String> palindromes = new HashMap<String, String>();
		Matcher m = Pattern
				.compile("[\\pL]+", Pattern.UNICODE_CHARACTER_CLASS | Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE)
				.matcher(s);
		while (m.find()) {
			String w = m.group();
			String p = getIfPalindrome(w);
			if(p != null) 
				palindromes.put(w, p);
		}
		return palindromes;
	}

	public static void printMapAsTable(Map<String, String> map) {
		if (map.isEmpty())
			return;
		int maxLen = 0;
		for (String w : map.keySet()) {
			if (w.length() > maxLen) {
				maxLen = w.length();
			}
		}
		String line = "═".repeat(maxLen + 4);
		String singleLine = "─".repeat(maxLen + 4);
		System.out.format("╔%s╦%s╗%n", line, line);
		for (int i = 0; i < map.size(); i++) {
			System.out.format("║  %-" + maxLen + "s  ║  %-" + maxLen + "s  ║%n", map.keySet().toArray()[i],
					map.values().toArray()[i]);
			if (i != map.size() - 1)
				System.out.format("╟%s╫%s╢%n", singleLine, singleLine);
		}
		System.out.format("╚%s╩%s╝%n", line, line);
	}

}
