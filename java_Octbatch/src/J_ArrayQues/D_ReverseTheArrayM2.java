package J_ArrayQues;

import java.util.Scanner;

public class D_ReverseTheArrayM2 {

	public static void reverse(int[] arr) {
		// Normal Way
		int i = 0;
		int j = arr.length - 1;
		while (i <= j) {
			// Swap
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int[] arr = new int[n];

		// input the array
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		reverse(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
