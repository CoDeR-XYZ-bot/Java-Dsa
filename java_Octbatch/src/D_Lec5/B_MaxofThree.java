package D_Lec5;

import java.util.Scanner;

public class B_MaxofThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner s= new Scanner(System.in);
	      int a= s.nextInt();
	      int b= s.nextInt();
	      int c= s.nextInt();
	      
	      if(a>b && a>c) {
	    	  System.out.println("a is Maximum");
	      }else {
	    	   
	    	  if(b>c) {
	    		  System.out.println("b is Maximum");
	    	  }else {
	    		 System.out.println("C is Maximum"); 
	    	  }
	      }
	}

}
