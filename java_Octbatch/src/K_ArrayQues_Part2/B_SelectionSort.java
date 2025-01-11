package K_ArrayQues_Part2;

import java.util.Scanner;

public class B_SelectionSort {
	public static int minIndex(int[] arr, int l, int r) {

		int min = arr[l];
		int index=l;
		for (int i = l+1; i <=r; i++) {
			if (arr[i] < min) {
				min = arr[i];
				index=i;
			}
		}
		return index;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * SELECTION SORT CARRIES THE CONCEPT OF MINIMUM INDEX
		 */
		 int [] arr= {3,12,10,4,5,2};
		 for(int i=0; i<arr.length;i++) {
	    	 int minIndex= minIndex(arr, i, arr.length-1);
	    	 int temp=arr[minIndex];
	    	 arr[minIndex]=arr[i];
	    	 arr[i]=temp;
	     }
	     
		// printing array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
