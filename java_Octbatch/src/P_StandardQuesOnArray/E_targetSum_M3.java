package P_StandardQuesOnArray;

import java.util.Arrays;

public class E_targetSum_M3 {
	
	public static boolean check(int []arr,int target) {
		//two pointer approach
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int sum = arr[i]+arr[j];
			if(sum==target) {
				return true;
			}else if(sum<target) {
				i++;
			}else {
				j--;
			}
		}
		return false;
	}

	public static void main(String[] args){
		int[] arr = { 3, 1, 6, 5, 7, 2, 9 };
		int target = 12;
		Arrays.sort(arr);
		boolean ans = check(arr, target);
		System.out.println(ans);
	}
}
