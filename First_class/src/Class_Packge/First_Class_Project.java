package Class_Packge;
import java.util.Scanner;

public class First_Class_Project {
	
	private int number1, number2;	//cria duas vari�veis de um objeto da classe First_Class_Project
	
	//Soma os inteiros recebidos
	public int soma()	//declara��o da fun��o soma()
	{
		return number1 + number2;	//retorna a soma de number1 com number2
	}
	
	//Subtrai os inteiros recebidos
	public int sub()	//declara��o da fun��o sub()
	{
		return number2 - number1;	//retorna a subtra��o de number1 com number2
	}
	
	//Mutiplica os inteiros recebidos
	public int mult()	//declara��o da fun��o mult()
	{
		return number1 * number2;	//retorna a multiplica��o de number1 com number2
	}
	
	//Divide os decimais recebidos
	public double div()	//declara��o da fun��o div()
	{
		return (double)(number1 / number2);	//retorna a divis�o de number1 com number2(em double)
	}
	
	
	public static void main(String args[]) {
		First_Class_Project FCPobj = new First_Class_Project();	//instancia um objeto de First_Class_Project
		FCPobj.number1 = 6;	//inicializa number1 com 6
		FCPobj.number2 = 6;	//incializa number2 com 10
		
		System.out.println(FCPobj.soma());	//imprime a soma
		System.out.println(FCPobj.sub());	//imprime a subtra��o
		System.out.println(FCPobj.mult());	//imprime a multiplica��o
		System.out.println(FCPobj.div());	//imprime a divis�o
	}
}
