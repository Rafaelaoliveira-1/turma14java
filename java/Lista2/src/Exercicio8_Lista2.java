import java.util.Scanner;

public class Exercicio8_Lista2 {

	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner (System.in);
		
		double N;
		int valor;
		
		System.out.println("Escreva um número:");
		N = leia.nextDouble();
		
		if(N<100)
		{
			System.out.println("O seu número foi " + "0");
		}
		else
		{
			System.out.println("O seu número foi " + N);
		}
		
	}
	
	//FUNCOES
}
