package Class_Packge;

import java.util.Scanner;

public class guilhermesson {
	
	public static void main(String [] args) {
		
		System.out.println("digite sua idade:");
		
		Scanner velhice = new Scanner(System.in);
		int idade= velhice.nextInt();
		if(idade <= 5) {
			
			System.out.println("bebe ");
		}
		
		else if (idade > 5 && idade <=12) {
			
			System.out.println("Criança");
			
			
		}
		else if(idade <=19 && idade>12){
			
			System.out.println("Adolescente");
			
		}else if(idade>20 && idade <= 60) {
			
			System.out.println("adulto");
			
		}else if (idade > 60) {
			
			
			System.out.println("idoso");
		}else if(idade > 100) {
			System.out.println("ABRAÃO");
			
		}else 
				
				System.out.println("vc não existe");
			}
			
			
		
			
			
		}
		
		
		
	
	

