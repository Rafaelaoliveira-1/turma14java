import java.util.Scanner;

public class Exercicio2_Lista2 {

	/* Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas
	 * trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
	 * Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, 
	 * caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. 
	 * No final do processamento imprimir o salário total e o salário excedente.
	 */
	
	// INICIO
	
	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner (System.in);
		
		double C = 0; //Código do Funcionário;
		double N = 0; //Horas trabalhadas do Funcionário;
		double E = 0; //Horas excedentes trabalhadas do Funcionário; 
		double Salario; //Salário Total Funcionário;
		
		linha();
		System.out.println("CÁLCULO SALÁRIO TOTAL");
		linha();
		pulaLinha();
		
		System.out.println("Digite o código do funcionário: ");
		C = leia.nextDouble();
		linha();

		System.out.println("Digite o número de horas trabalhadas: \n");
		N = leia.nextDouble();
		
		if(N >= 50)
		{
			Salario = (N-1)*10;
			E = (N-50)*20 + Salario;
			
		System.out.println("O seu salário é de: R$" + Salario);
		}
		else
		{
			 Salario = (N*10);
			 E=0;
			 
			 System.out.println("Não realizou hora extra, seu salario é de: R$" + Salario);
			 System.out.println ("\n Horas extras é de: " + E);
			 
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
