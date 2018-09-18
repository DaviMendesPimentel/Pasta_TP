package Class_Packge;

import java.util.Scanner;

public class Tabuada {
	
	
	public static void main(String [] arg) {
		
		Scanner escaner = new Scanner(System.in);
		
		int numerotabuada = escaner.nextInt();
		int x=0;
	
		
		for(x=0;x <= 20; x++) 
			

			
			System.out.println(numerotabuada +"x" + x +"="+ numerotabuada*x);
			
		
	}

}
