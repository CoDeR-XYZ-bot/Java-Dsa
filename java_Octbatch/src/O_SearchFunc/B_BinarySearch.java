package O_SearchFunc;

import java.util.Arrays;

public class B_BinarySearch {
	
	public static int binarysearch(int [] arr,int target) {
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
		   //int mid = low+(high-low)/2;
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid]<target) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,56,42,3,9,4,6,7};
		int target = 55;
		Arrays.sort(arr);
		System.out.println(binarysearch(arr,target));
	}

}
