package N_TwoDArrayQues;

import java.util.Scanner;

public class F_Spiralmatrix {

	public static void spiral(int[][] arr) {
		int minr = 0;
		int maxr = arr.length - 1;
		int minc = 0;
		int maxc = arr[0].length - 1;

		int count = 0;
		int total = arr.length * arr[0].length;
		while (count < total) {
			// 1st boundary
			for (int i = minc; i <= maxc && count < total; i++) {
				System.out.print(arr[minr][i] + " ");
				count++;
			}
			minr++;
			// 2nd boundary
			for (int j = minr; j <= maxr && count < total; j++) {
				System.out.print(arr[j][maxc] + " ");
				count++;
			}
			maxc--;
			// 3rd boundary
			for (int i = maxc; i >= minc && count < total; i--) {
				System.out.print(arr[maxr][i] + " ");
				count++;
			}
			maxr--;
			// 4th boundary
			for (int j = maxr; j >= minr && count < total; j--) {
				System.out.print(arr[j][minc] + " ");
				count++;
			}
			minc++;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("Enter the element of [" + i + "][" + j + "]:");
				arr[i][j] = s.nextInt();
			}
		}
		spiral(arr);
	}

}