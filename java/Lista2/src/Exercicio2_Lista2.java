import java.util.Scanner;

public class Exercicio2_Lista2 {

	/* Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de horas
	 * trabalhadas de um oper�rio. E calcule o sal�rio sabendo-se que ele ganha R$ 10,00 por hora. 
	 * Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento armazenando-o na vari�vel E, 
	 * caso contr�rio zerar tal vari�vel. A hora excedente de trabalho vale R$ 20,00. 
	 * No final do processamento imprimir o sal�rio total e o sal�rio excedente.
	 */
	
	// INICIO
	
	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner (System.in);
		
		double C = 0; //C�digo do Funcion�rio;
		double N = 0; //Horas trabalhadas do Funcion�rio;
		double E = 0; //Horas excedentes trabalhadas do Funcion�rio; 
		double Salario; //Sal�rio Total Funcion�rio;
		
		linha();
		System.out.println("C�LCULO SAL�RIO TOTAL");
		linha();
		pulaLinha();
		
		System.out.println("Digite o c�digo do funcion�rio: ");
		C = leia.nextDouble();
		linha();

		System.out.println("Digite o n�mero de horas trabalhadas: \n");
		N = leia.nextDouble();
		
		if(N >= 50)
		{
			Salario = (N-1)*10;
			E = (N-50)*20 + Salario;
			
		System.out.println("O seu sal�rio � de: R$" + Salario);
		}
		else
		{
			 Salario = (N*10);
			 E=0;
			 
			 System.out.println("N�o realizou hora extra, seu salario � de: R$" + Salario);
			 System.out.println ("\n Horas extras � de: " + E);
			 
		}
		
		
	}
		
	
	//FUNCOES
	
	public static void pulaLinha()
	{
		System.out.println("\n");
	}
	public static void linha()
	{
		System.out.println("************************************");
	}

//FIM PROGRAMA	
	
}
