package O_SearchFunc;

public class A_LinearSearch {
	
	public static boolean linearsearch(int []arr,int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,2,4,8,6,7,10,12};
		int target = 6;
		System.out.println(linearsearch(arr,target));
	}

}
