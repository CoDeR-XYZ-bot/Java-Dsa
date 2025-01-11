package P_StandardQuesOnArray;

import java.util.Arrays;

public class A_SingleOccurance {

	public static int singleoccurance(int []arr) {
		int low=0;
		int high=arr.length-1;
		int pc=0;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==1) {
				pc=mid;
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return pc;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 0, 1, 0, 1, 0, 1 };
		Arrays.sort(arr);
		int index = singleoccurance(arr);
		System.out.println(index);
	}

}
