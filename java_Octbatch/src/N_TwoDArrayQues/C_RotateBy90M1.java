package N_TwoDArrayQues;

public class C_RotateBy90M1 {
	
	public static void reversefor2D(int [][]arr) {
		int rowi = 0;
		int rowj=arr.length-1;
		while(rowi<=rowj) {
			for(int j=0;j<=rowj;j++) {
				int temp = arr[rowi][j];
				arr[rowi][j] = arr[rowj][j];
				arr[rowj][j] = temp;
			}
			rowi++;
			rowj--;
		}
	}

	
	public static void Transpose(int [][] arr) {
		int row = arr.length;
		int column = arr[0].length;
		for (int i = 0; i <row; i++) {
			for (int j = 0; j <column; j++)
			// other method for(int j=i;j<arr[0].length;j++)
			{
				if (j < i) {
					continue;
				} else {
					System.out.println("swap between(" + i + " " + j + ")");
					int temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		Transpose(arr);
		reversefor2D(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
