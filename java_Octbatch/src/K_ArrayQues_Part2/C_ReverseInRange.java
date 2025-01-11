package K_ArrayQues_Part2;

public class C_ReverseInRange {
	public static void reversewithrange(int []arr,int a,int b) {
		int i = a;//starting point
		int j = b;//ending pont
		while(i<=j) {
			//swap with respect to limits
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		System.out.println("Doing reverse with respect to range");
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		
	}
	public static void reverse(int [] arr) {
		int i=0;
		int j=arr.length-1;
		while(i<=j) {
			//swap
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		System.out.println("Doing reverse without range");
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] brr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		reverse(arr);
		reversewithrange(arr,0,8);
	}

}
