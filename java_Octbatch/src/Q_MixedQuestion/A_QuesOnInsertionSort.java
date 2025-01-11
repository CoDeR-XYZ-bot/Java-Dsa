package Q_MixedQuestion;

public class A_QuesOnInsertionSort {
	
	//i denote kaha tk array sorted hai(n-2)
	//temp kisko sahi postion pr pahuchana hai
	public static void insertfunc(int []arr, int i, int temp) {
		
		while(arr[i]>temp) {
			//shift element to insert
			arr[i+1]=arr[i];
			i--;
		}
		arr[i+1]=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,3,5,6,7,8,9,4};
		insertfunc(arr,arr.length-2,arr[arr.length-1]);//check
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
