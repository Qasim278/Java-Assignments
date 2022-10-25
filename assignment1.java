
//Create a program called StringPalindrome that has a method called isPalindrome that determines whether a string contains a palindrome.

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a string: ");

		String input = scan.nextLine();

		boolean palindrome = isPalindrome(input);

		if (palindrome) {

			System.out.println("The text is a palindrome.");

		} else {

			System.out.println("No palindrome");
		}

	}

	public static boolean isPalindrome(String input) {

		String allowed = "[A-ZÅÄÖa-zåäö\\ \\.\\,\\:\\;\\?\\!\\-\\'\\\"]{0,}";
		String noLetters = "[\\ \\.\\,\\:\\;\\?\\!\\\\-\\\\'\\\"]{0,}";

		if (input.matches(noLetters)) {
			return false;
		} else if (input.matches(allowed)) {

			String notTrim = "[\\ \\.\\,\\:\\;\\?\\!\\-\\'\\\"]{1,}]";
			boolean trimDone = false;
			String trimmedStr = "";

			while (!trimDone) {

				String trimmed = input.replaceAll("[\\ \\.\\,\\:\\;\\?\\!\\-\\'\\\"]", "");

				if (trimmed.matches(notTrim)) {

					trimDone = false;
				} else {

					trimDone = true;
					trimmedStr = trimmed.toLowerCase();

				}

			}

			String reversedStr = new StringBuilder(trimmedStr).reverse().toString().toLowerCase();


			if (trimmedStr.equals(reversedStr)) {

				return true;
			} else {

				return false;
			}

		} else {
			return false;
		}

	}

}
