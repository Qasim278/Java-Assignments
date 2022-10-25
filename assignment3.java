/* Create a class called ArrayStatLibrary for storing generic reusable methods. That is, the ArrayStatLibrary class is a method library class and it does not have the main method. Instead, the class should have the following methods: max, min, median, mean, and standardDeviation. Each method should take an array of integers as parameter (argument) and return the appropriate result.

Create a program called ArrayStatistics that uses methods of the ArrayStatLibrary class. First, 
the main method should ask the user how many values there are in the sample. Then, the main method should input the values from the user and save them to an array. Finally, the program should compute the required descriptive statistics from the sample data and display them. See the example output for more details.

The main method should call the methods max, min, median, mean, and standardDeviation of the ArrayStatLibrary class to get the values to be printed.

The minimum allowed sample size is 3. If the user enters less than 3 as the number of values, then the program should just print the text "Sorry, at least 3 values required". */


import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;

public class ArrayStatistics {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of values: ");

		int number = Integer.parseInt(input.nextLine());

		int[] array = new int[number];

		if (number >= 3) {

			for (int i = 0; i < number; i++) {

				System.out.print("Enter an integer: ");

				array[i] = Integer.parseInt(input.nextLine());

			}
		System.out.println("");

		System.out.println("n = " + array.length);

		ArrayStatLibrary.min(array);
		System.out.println(ArrayStatLibrary.max(array));
		ArrayStatLibrary.median(array);
		System.out.println("Mean: " + ArrayStatLibrary.mean(array));
		ArrayStatLibrary.standardDeviation(array);

			System.out.print("Sample data: ");
			
		for (int i = 0; i < array.length; i++) {

			System.out.print( array[i] + " ");
		}

		} else {
		System.out.println("Sorry, at least 3 values required");
	}

}
}

class ArrayStatLibrary {

	public static void min(int[] input) {

		int i = input[0];

		for (int s : input) {

			if (s < i) {
				i = s;
			} 

		}

		System.out.println("Min: " + i);

	}

	public static String max(int[] input) {

		int i = input[0];

		for (int s : input) {

			if (s > i) {

				i = s;
			}

		}

		return ("Max: " + i);

	}

			public static void median(int[] input) {

		DecimalFormat oneDecimal = new DecimalFormat("0.0");

		int[] array = new int[input.length];

		int i = 0;
		for (int s : input) {
			array[i] = s;
			i++;
		}

		Arrays.sort(array);

		int arrayLength = array.length;

		int median = array[(arrayLength / 2)];

		String answer = oneDecimal.format(array[(arrayLength / 2)]);

		System.out.println("Median: " + answer.replace(".", ","));

	}


	public static String mean(int[] input) {

		DecimalFormat oneDecimal = new DecimalFormat("0.0");

		double all = 0;

		for (int s : input) {

			all = all + s;

		}

		String answer = oneDecimal.format(all / input.length);

		return answer.replace(".", ",");

	}

	public static void standardDeviation(int[] input) {

		DecimalFormat oneDecimal = new DecimalFormat("0.0");

		double sum = 0;

		for (int s : input) {

			sum = sum + s;

		}

		double mean = sum / input.length;

		int j = 0;

		double summing = 0;

		while (j < input.length) {

			double i = input[j];

			double difference = (mean - i);
			difference = difference * difference;

			summing = difference + summing;

			j++;

		}

		summing = summing / (input.length - 1);

		summing = Math.sqrt(summing);

		System.out.println("Sample standard deviation: " + oneDecimal.format(summing));

	}

}
