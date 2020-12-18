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

		ContaEmpresa empresa = new ContaEmpresa(numeroConta, 10000); //VALOR DE LIMITE EMPRESTIMO É 10 MIL REAIS
	
		//public(){
			
		//}
		
	for (int x = 0; x < 10; x++) {
		System.out.printf("\nOlá " + nomeCliente + "\n");
		System.out.println("Qual a operação que deseja fazer? ");
		System.out.println("[C] CRÉDITO ou [D] DÉBITO");
		opcao = leia.next().toUpperCase().charAt(0);

		if (opcao == 'C') {

			System.out.println(nomeCliente + ", Digite o valor para CREDITAR: ");
			valor = leia.nextDouble();
			empresa.credito(valor);
			
			System.out.println("Saldo Atual: " + empresa.getSaldo());
			
			System.out.println("Deseja Continuar?");
			System.out.println("Para [S]Sim ou [N]Não");
			opcaoSimouNao = leia.next().toUpperCase().charAt(0);
			
			if(opcaoSimouNao == 'N') {
				break;
			}
			
		} else if (opcao == 'D') {
			System.out.println(nomeCliente + "Digite o valor para DEBITAR:");
			valor = leia.nextDouble();
			empresa.debito(valor);

			System.out.println("Seu SALDO atual é: " + empresa.getSaldo());
			
			System.out.println("Deseja Continuar?");
			System.out.println("Para [S]Sim ou [S]Não");
			opcaoSimouNao = leia.next().toUpperCase().charAt(0);
			
			if(opcaoSimouNao == 'N') {
				break;
			}
			
		} else {
			System.out.println("OPERAÇÃO INVÁLIDA!! ");
			System.out.println("Procure seu gerente");
		}
		
		//COMEÇA CODIGO EMPRESTIMO
		
		empresa.emprestimoSolicitado(valorEmprestimo);
		
		double limiteEmprestimo = 10000;
		
		System.out.println("\nVocê gostaria de um EMPRESTIMO HOJE?");
		
		System.out.println("TEMOS ÓTIMAS CONDIÇÕES PARA VOCÊ!!");
		
		System.out.println("Para [S]Sim ou [S]Não");
		opcaoSimouNao = leia.next().toUpperCase().charAt(0);

		if (opcaoSimouNao == 'S')
		{
			System.out.printf("Olá " + nomeCliente + " ,que bom que aproveitou a melhor condição do mercado!");
			
			System.out.printf("\nQuanto você gostaria de pegar?");
			valorEmprestimo = leia.nextDouble();
			
			if (valorEmprestimo > 0 && valorEmprestimo <= limiteEmprestimo)
			{
					
				empresa.saldo = empresa.saldo + valorEmprestimo;
					
					System.out.printf("\n PARABÉNS! Você acabou de adquirir R$ %f\n", valorEmprestimo);
					System.out.printf("\nSeu saldo atual é %f", empresa.saldo, "\n");
			}
			
		}
	}
	
	//TERMINACODIGO EMPRESTIMO
	
	
}
	

	//FUNCOES
	
	public static void sair() 
	{
		System.out.println("AGRADECEMOS POR USAR O G5 BANK, ATÉ A PRÓXIMA");
	
	}
	
}
