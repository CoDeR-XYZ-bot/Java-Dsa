package P_StandardQuesOnArray;

import java.util.Arrays;

public class D_TargetSum_M2 {
		public static boolean bs(int[] arr, int low, int high, int target) {

			while (low <= high) {
				int mid = (high + low) / 2;
				if (arr[mid] == target) {
					return true;
				} else if (arr[mid] < target) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
			return false;
		}

		public static boolean check(int[] arr, int target) {
			for (int i = 0; i < arr.length; i++) {
				int secondvalue = target - arr[i];
				boolean ans = bs(arr, i + i, arr.length - 1, secondvalue);
				if (ans == true) {
					return true;
				}
			}
			return false;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int[] arr = { 3, 1, 6, 5, 7, 2, 9 };
			int target = 12;
			Arrays.sort(arr);
			boolean ans = check(arr, target);
			System.out.println(ans);

		}

	}

