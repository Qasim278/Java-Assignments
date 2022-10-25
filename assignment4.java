package programming1;

public class ArrayMatrixSum {

	public static void main(String[] args) {

		int[][] first = { { 1, 2, 0 }, { 2, 3, 4 } };
		int[][] second = { { 3, 2, 5 }, { 6, 4, 3 } };
		int[][] third = { { 1, 1, 1, 1 }, { 4, 3, 2, 1 }, { 2, 2, 2, 2 } };
		int[][] fourth = { { 2, 2, 2, 3 }, { 2, 3, 2, 0 }, { 1, 2, 3, 4 } };

		printSum(first, second);
		System.out.println();

		printSum(third, fourth);
	}

	public static void printSum(int[][] firstValue, int[][] secondValue) {

		int[][] returnArray = new int[firstValue.length][firstValue[0].length];

		for (int i = 0; i < firstValue.length; i++) {
			for (int j = 0; j < firstValue[0].length; j++) {
				returnArray[i][j] = firstValue[i][j] + secondValue[i][j];
				System.out.print(returnArray[i][j] + " ");
			}

			System.out.println();

		}
	}

	public static void printSum2(int[][] a, int[][] b) {

		int c[][] = new int[3][3]; 

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j]; 
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
