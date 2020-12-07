package aulas;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio8_Lista1 
{

	public static void main(String[] args) 
	{
		
		double valorCarro, totalDistribuicao, totalImposto, carroNovo;
		double custoDistribuidor = 0.28;
		double custoImposto = 0.45;

		
		Scanner leia = new Scanner (System.in);
		
		System.out.println ("Qual é o valor do carro: ");
		valorCarro = leia.nextDouble();
		
		totalDistribuicao = valorCarro * custoDistribuidor;
		totalImposto = valorCarro * custoImposto;

		carroNovo = valorCarro + totalDistribuicao + totalImposto;

		System.out.printf ("O valor total do carro com os imposto é de R$ %.2f" , carroNovo , ",00");
		valorCarro = leia.nextDouble();
		
		
	}
	
	
}
