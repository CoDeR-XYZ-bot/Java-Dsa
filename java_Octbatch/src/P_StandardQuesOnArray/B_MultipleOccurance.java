package P_StandardQuesOnArray;

import java.util.Arrays;

public class B_MultipleOccurance {
	
	public static int multipleoccurance(int []arr,int target) {
		int low=0;
		int high=arr.length-1;
		int pc=0;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==target) {
				pc=mid;
				high=mid-1;
			}else if(arr[mid]<target) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return pc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr = {9,8,5,6,7,4,3,1,2};
		int target = 4;
		Arrays.sort(arr);
		int index = multipleoccurance(arr,target);
		System.out.println(index);
	}

}
