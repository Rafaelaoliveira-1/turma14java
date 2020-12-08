import java.util.Scanner;

public class Exercicio7_Lista2 {

	//INICIO
	
	public static void main(String[] args)
	{
		Scanner leia = new Scanner (System.in);
		
		double base, altura, triangulo;
		

		linha();
		System.out.println("C�LCULO - BASE/ALTURA TRI�NGULOS");
		linha();
		
		System.out.println("Digite a base do tri�ngulo: \n");
		base = leia.nextDouble();
		linha();

		System.out.println("Digite a altura do tri�ngulo: \n");
		altura = leia.nextDouble();
		
		if  (base < 0 && altura < 0)
		{
			System.out.println("N�o � poss�vel calcular com n�mero negativo. Escolha um n�mero positivo");
		}
		else
		{
			triangulo = ((base*altura)/2);
			System.out.println ("A �rea do tri�ngulo � de " + triangulo);

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
