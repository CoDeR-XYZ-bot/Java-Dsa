package N_TwoDArrayQues;

public class E_TransposeOfMatrix {
	
	public static void transpose(int [][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(j<i) {
					continue;
				}else {
					System.out.print("Swap Between ( "+i+ " "+ j+" )" );
					System.out.println("( "+ j+ " "+ i+ " )");
					System.out.println("swap between("+i+" "+j+")");
					int temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		transpose(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
