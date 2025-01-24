package F_Lec8;

public class D_PreAndPostIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int i=12;
		
//		i=i+1;
//		i++;
		
		int b= i++;
		System.out.println(i + " "+ b);
		
		System.out.println(i--);
		System.out.println(i--);
		
		int a= i++ -12 + --i - 13 ;
		System.out.println(a+ " "+ i);
	}

}
