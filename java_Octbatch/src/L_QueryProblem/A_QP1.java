package L_QueryProblem;

import java.util.Scanner;

public class A_QP1 {
	public static int[] PrefixArray(int[] arr) {

		int[] prefix = new int[arr.length];
		prefix[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			prefix[i] = prefix[i - 1] + arr[i];
		}
		return prefix;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the element:");
			arr[i] = s.nextInt();
		}
		int[] prefix = PrefixArray(arr);
		System.out.println("Enter the number of queries:");
		int q = s.nextInt();
		while (q > 0) {
			System.out.print("enter the left limit:");
			int l = s.nextInt();
			System.out.print("Enter the right limit:");
			int r = s.nextInt();

			int ans = 0;

			if (l == 0) {
				ans = prefix[r];
			} else {
				ans = prefix[r] - prefix[l - 1];
			}
			System.out.println(ans);

			q--;
		}

	}

}
