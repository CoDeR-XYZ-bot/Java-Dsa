package J_ArrayQues;

import java.util.Scanner;

public class E_SumOfArray {
	
	public static int sumofarray(int [] arr) {
		int sum = 0;
		int n = arr.length;
		for(int i=0;i<n;i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int [] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		System.out.print(sumofarray(arr));
	}

}
