package programming1;

import java.util.Arrays;
import java.util.Scanner;

public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String first_input = scan.nextLine();

		System.out.print("Enter second string: ");
		String second_input = scan.nextLine();

		boolean anagram = isAnagram(first_input, second_input);

		if (anagram) {
			System.out.println("Anagram!");
		} else {
			System.out.println("No anagram.");
		}

	}

	public static boolean isAnagram(String first_input, String second_input) {

		String allowed = "[A-ZÅÄÖa-zåäö\\ \\.\\,]{0,}";
		String noLetters = "[\\ \\.\\,]{0,}";
		String replace = "[\\ \\.\\,]{1,}";

		if (first_input.matches(noLetters) || second_input.matches(noLetters)) {

		} else if (first_input.matches(allowed) || second_input.matches(allowed)) {

			String trimmed1 = first_input.replaceAll(replace, "").toLowerCase();

			String trimmed2 = second_input.replaceAll(replace, "").toLowerCase();

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
