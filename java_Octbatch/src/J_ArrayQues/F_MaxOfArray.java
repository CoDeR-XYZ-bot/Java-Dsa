package J_ArrayQues;

import java.util.Scanner;

public class F_MaxOfArray {
	
//	public static int minofarray(int [] arr) {
//		int min = arr[0];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]<min) {
//				min=arr[i];
//			}
//		}
//		return min;
//	}

//	public static int maxofarray(int[] arr) {
//		int max = arr[0];
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		return max;
//	}
	
	public static int [] getAll(int [] arr) {
		int max = arr[0];
		int min = arr[0];
		int sum = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		int [] ans = new int [3];
		ans[0] = sum;
		ans[1] = max;
		ans[2] = min;
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		// input the array
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
//		System.out.print(maxofarray(arr));
//		System.out.print(minofarray(arr));
		int [] ans = getAll(arr);
		System.out.print(ans[0]+" , "+ans[1]+" , "+ans[2]);
	}

}
