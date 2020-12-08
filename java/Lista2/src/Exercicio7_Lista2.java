import java.util.Scanner;

public class Exercicio7_Lista2 {

	//INICIO
	
	public static void main(String[] args)
	{
		Scanner leia = new Scanner (System.in);
		
		double base, altura, triangulo;
		

		linha();
		System.out.println("CÁLCULO - BASE/ALTURA TRIÂNGULOS");
		linha();
		
		System.out.println("Digite a base do triângulo: \n");
		base = leia.nextDouble();
		linha();

		System.out.println("Digite a altura do triângulo: \n");
		altura = leia.nextDouble();
		
		if  (base < 0 && altura < 0)
		{
			System.out.println("Não é possível calcular com número negativo. Escolha um número positivo");
		}
		else
		{
			triangulo = ((base*altura)/2);
			System.out.println ("A área do triângulo é de " + triangulo);

		}
		
		
	}
	
	//FUNCOES
	public static void pulaLinha()
	{
		System.out.println("\n");
	}
	public static void linha()
	{
		System.out.println("******************************************");
	}
}
