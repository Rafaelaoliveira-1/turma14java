package Bancos;

import java.util.Scanner;

public class TESTEEMPRESA {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		char debitoCredito;
		double credito = 0;
		double debito = 0;
		double saldo = 0;
		int numeroConta = 0;
		String nomeCliente = "Rafaela Oliveira Silva";
		char opcao;
		char opcaoSimouNao;
		double valorEmprestimo = 0.0;
		double valor;

		ContaEmpresa empresa = new ContaEmpresa(numeroConta, 10000); //VALOR DE LIMITE EMPRESTIMO � 10 MIL REAIS
	
		//public(){
			
		//}
		
	for (int x = 0; x < 10; x++) {
		System.out.printf("\nOl� " + nomeCliente + "\n");
		System.out.println("Qual a opera��o que deseja fazer? ");
		System.out.println("[C] CR�DITO ou [D] D�BITO");
		opcao = leia.next().toUpperCase().charAt(0);

		if (opcao == 'C') {

			System.out.println(nomeCliente + ", Digite o valor para CREDITAR: ");
			valor = leia.nextDouble();
			empresa.credito(valor);
			
			System.out.println("Saldo Atual: " + empresa.getSaldo());
			
			System.out.println("Deseja Continuar?");
			System.out.println("Para [S]Sim ou [N]N�o");
			opcaoSimouNao = leia.next().toUpperCase().charAt(0);
			
			if(opcaoSimouNao == 'N') {
				break;
			}
			
		} else if (opcao == 'D') {
			System.out.println(nomeCliente + "Digite o valor para DEBITAR:");
			valor = leia.nextDouble();
			empresa.debito(valor);

			System.out.println("Seu SALDO atual �: " + empresa.getSaldo());
			
			System.out.println("Deseja Continuar?");
			System.out.println("Para [S]Sim ou [S]N�o");
			opcaoSimouNao = leia.next().toUpperCase().charAt(0);
			
			if(opcaoSimouNao == 'N') {
				break;
			}
			
		} else {
			System.out.println("OPERA��O INV�LIDA!! ");
			System.out.println("Procure seu gerente");
		}
		
		//COME�A CODIGO EMPRESTIMO
		
		empresa.emprestimoSolicitado(valorEmprestimo);
		
		double limiteEmprestimo = 10000;
		
		System.out.println("\nVoc� gostaria de um EMPRESTIMO HOJE?");
		
		System.out.println("TEMOS �TIMAS CONDI��ES PARA VOC�!!");
		
		System.out.println("Para [S]Sim ou [S]N�o");
		opcaoSimouNao = leia.next().toUpperCase().charAt(0);

		if (opcaoSimouNao == 'S')
		{
			System.out.printf("Ol� " + nomeCliente + " ,que bom que aproveitou a melhor condi��o do mercado!");
			
			System.out.printf("\nQuanto voc� gostaria de pegar?");
			valorEmprestimo = leia.nextDouble();
			
			if (valorEmprestimo > 0 && valorEmprestimo <= limiteEmprestimo)
			{
					
				empresa.saldo = empresa.saldo + valorEmprestimo;
					
					System.out.printf("\n PARAB�NS! Voc� acabou de adquirir R$ %f\n", valorEmprestimo);
					System.out.printf("\nSeu saldo atual � %f", empresa.saldo, "\n");
			}
			
		}
	}
	
	//TERMINACODIGO EMPRESTIMO
	
	
}
	

	//FUNCOES
	
	public static void sair() 
	{
		System.out.println("AGRADECEMOS POR USAR O G5 BANK, AT� A PR�XIMA");
	
	}
	
}
