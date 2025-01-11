package K_ArrayQues_Part2;

import java.util.Scanner;

public class A_BubbleSort {

	public static void bubblesort(int [] arr) {
	
		for(int round=1;round<arr.length;round++) {
			for(int i=0;i<arr.length-round;i++) {
				//swaping
				if(arr[i+1]<arr[i]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		bubblesort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
