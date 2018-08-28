package Class_Packge;
import java.util.Scanner;

public class First_Class_Project {
	
	private int number1, number2;	//cria duas variáveis de um objeto da classe First_Class_Project
	
	//Soma os inteiros recebidos
	public int soma()	//declaração da função soma()
	{
		return number1 + number2;	//retorna a soma de number1 com number2
	}
	
	//Subtrai os inteiros recebidos
	public int sub()	//declaração da função sub()
	{
		return number2 - number1;	//retorna a subtração de number1 com number2
	}
	
	//Mutiplica os inteiros recebidos
	public int mult()	//declaração da função mult()
	{
		return number1 * number2;	//retorna a multiplicação de number1 com number2
	}
	
	//Divide os decimais recebidos
	public double div()	//declaração da função div()
	{
		return (double)(number1 / number2);	//retorna a divisão de number1 com number2(em double)
	}
	
	
	public static void main(String args[]) {
		First_Class_Project FCPobj = new First_Class_Project();	//instancia um objeto de First_Class_Project
		FCPobj.number1 = 6;	//inicializa number1 com 6
		FCPobj.number2 = 6;	//incializa number2 com 10
		
		System.out.println(FCPobj.soma());	//imprime a soma
		System.out.println(FCPobj.sub());	//imprime a subtração
		System.out.println(FCPobj.mult());	//imprime a multiplicação
		System.out.println(FCPobj.div());	//imprime a divisão
	}
}
