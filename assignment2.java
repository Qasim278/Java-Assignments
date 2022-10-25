
//Create a program called StringAnagram that has a method called isAnagram that determines whether two strings are anagrams of each other.

package programming1;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String first = scan.nextLine();

		System.out.print("Enter second string: ");
		String second = scan.nextLine();

		boolean anagram = isAnagram(first, second);

		if (anagram) {
			System.out.println("Anagram!");
		} else {
			System.out.println("No anagram.");
		}

	}

	public static boolean isAnagram(String first, String second) {

		String allowed = "[A-ZÅÄÖa-zåäö\\ \\.\\,]{0,}";
		String noLetters = "[\\ \\.\\,]{0,}";
		String replace = "[\\ \\.\\,]{1,}";

		if (first.matches(noLetters) || second.matches(noLetters)) {

		} else if (first.matches(allowed) || second.matches(allowed)) {

			String trimmed1 = first.replaceAll(replace, "").toLowerCase();

			String trimmed2 = second.replaceAll(replace, "").toLowerCase();

			if (trimmed1.length() == trimmed2.length()) {

				char[] firstChar = trimmed1.toCharArray();
				Arrays.sort(firstChar);
				String isAna1 = new String(firstChar);

				char[] secondChar = trimmed2.toCharArray();
				Arrays.sort(secondChar);
				String isAna2 = new String(secondChar);

				if (isAna1.equals(isAna2)) {
					return true;
				} else {
					return false;
				}

			} else {
				return false;
			}

		} else {
			return false;
		}
		return false;

	}
}
