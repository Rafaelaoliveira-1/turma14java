package Lista5;

import java.util.Scanner;

public class Exercicio1_Lista5 {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		double precoEtiqueta, precoFinal;
		
		int opcao;
		
		System.out.println("Qual o valor de etiqueta do produto? R$ ");
		
		precoEtiqueta = sc.nextDouble();
		
		System.out.println("[1] - � vista em dinheiro ou cheque");
		System.out.println("[2] - � vista no cart�o de cr�dito");
		System.out.println("[3] - Parcelado em duas vezes");
		System.out.println("[4] - Parcelado em tr�s vezes");
		System.out.println("Digite qual op��o de pagamento: ");
		
		opcao = sc.nextInt();
		
		switch(opcao)
		
		{
		case 1:
			precoFinal = validarPrecoFinal(precoEtiqueta,-0.2);
			System.out.println("o pre�o de R$ "+precoEtiqueta+" est� saindo por R$"+precoFinal);
			break;
		case 2:
			precoFinal = validarPrecoFinal(precoEtiqueta,-0.15);
			System.out.println("o pre�o de R$ "+precoEtiqueta+" est� saindo por R$"+precoFinal);
			break;
		case 3:
			precoFinal = validarPrecoFinal(precoEtiqueta,0.0);
			System.out.println("O valor final da sua compra � R$ "+precoFinal);
			break;
		case 4:
			precoFinal = validarPrecoFinal(precoEtiqueta,0.1);
			System.out.println("O valor final da sua compra � R$ "+precoFinal);
			break;
		default:
			System.out.println("Valor digitado foi incorreto.");
		}

	}

	static double validarPrecoFinal(double preco, double porcentagem){
		return (preco * (1+porcentagem));
	}
	
}
