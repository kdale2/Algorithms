//Program to determine maximum profit path of a matrix
//dynamic programming implementation

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MPP {

	public static void main(String[] args) throws FileNotFoundException {

		//Replace this with the path to your input file:
		File file = new File("C:\\Users\\Kris\\Desktop\\inputMatrix.txt");
		Scanner sc = new Scanner(file);
		int n = sc.nextInt();

		int[][] dataInput = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				dataInput[i][j] = sc.nextInt();
				//System.out.println(dataInput[i][j]);
			}
		}

		int result = MaximumProfitPath(dataInput, n);
		System.out.println(result);
		sc.close();
	}

	public static int MaximumProfitPath(int[][] q, int n) {

		int[][] profitTable = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i==0 && j == 0) {
					profitTable[i][j] = q[i][j];
					//System.out.println(newTable[i][j]);
				}
				else if (i == 0) {
					profitTable[i][j] = profitTable[i][j-1] + q[i][j];
				}
				else if (j==0) {
					profitTable[i][j] = profitTable[i-1][j] + q[i][j];
				}
				else {
					profitTable[i][j] = Math.max(profitTable[i][j], Math.max(profitTable[i][j-1], profitTable[i-1][j])) + q[i][j];
				}
			}
		}
		return profitTable[n-1][n-1];
	}
}
