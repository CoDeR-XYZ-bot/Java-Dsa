package J_ArrayQues;

public class B_ReverseTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr= {1,2,3,4,5,6};
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
		int [] newArray = new int[arr.length];
		
		int j=0;
		
		for(int i=arr.length-1;i>=0;i--) {
			newArray[j] = arr[i];
			j++;
		}
		
		//copy the data
		for(int i=0;i<arr.length;i++) {
			arr[i] = newArray[j];
		}
		arr = newArray;
	}

}
