package Projeto_pkg;

public class Projet_classe {
	
	public static void main(String []args) {
		
// primeiro exercício:
		int matriz[][] = {{1, 	10, 	20},
				
						  {2, 	20, 	40},
						  
						  {3, 	52, 	74}};
		int result1 = 0;
		int result2 = 0;
		double result3 = 0d;
		
		
/* segundo exercício:
	 * 
		for(int i = 0; i < 2; i++) {
			result1 += matriz[i][i];
			System.out.println(matriz[i][i]);
		}
		*/
		
/* terceiro exercício:
	 * 
		int dec = 2, inc = 0;
		for(int i = 0; i < 3; i++) {
			result2 = matriz[inc][dec];
			System.out.println(matriz[inc][dec]);
			++inc;
			--dec;
		}*/
		
/* quarto exercício:
	 * 
		result3 = matriz[1][1] / matriz[2][1];
		System.out.printf("%d e %d\n", matriz[1][1], matriz[2][1]);
		System.out.println(result3);
		*/
	}
}
