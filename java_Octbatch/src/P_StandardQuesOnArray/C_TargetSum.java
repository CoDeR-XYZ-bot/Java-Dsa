package P_StandardQuesOnArray;

public class C_TargetSum {
	
	public static boolean targetsum(int []arr,int target) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
		//		System.out.println("("+i+","+j+")");
				if(arr[i]+arr[j]==target) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr = {1,7,1,3,2,5,10};
		int target = 12;
		boolean ans = targetsum(arr,target);
		System.out.println(ans);
	}

}
