package Bancos;

import java.util.Scanner;

public class Banco {
		
		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			
			char debitoCredito;
			double credito = 0;
			double debito = 0;
			double saldo = 0;
			int numeroConta = 0;
			int menu;
			String nomeCliente = "Ednilson Nascimento";

			linha();
			System.out.print("\n              BANCO G5 \n");
			linha();
			System.out.print("\nDIGITE O SEU NÚMERO DE CONTA: ");
			numeroConta = leia.nextInt();
			
			System.out.println("■■■■■■■ DETALHES DA CONTA ■■■■■■");
			System.out.println("[1] - Abertura de conta");
			System.out.println("[2] - Acesso a uma conta existente ");
			System.out.println("[3] - Sair");
			System.out.println("    ■■■■■■■ BEM VINDO ■■■■■■");
			
			menu = leia.nextInt();
			
			if(menu == 1) {
				
				System.out.println("\n");
				System.out.printf("\nOlá " + nomeCliente + "\n");
				System.out.println("■■■■■■■ CONTAS DISPONÍVEIS ■■■■■■");
				System.out.println("■[1] - Conta Corrente");
				System.out.println("■[2] - Conta Poupança");
				System.out.println("■[3] - Conta Especial");
				System.out.println("■[4] - Conta Empresa");
				System.out.println("■[5] - Conta Universitária");
				System.out.println("■[6] - SAIR");
				
				menu = leia.nextInt();
				
				do {
					switch(menu) {
					
					case 1:
						
						System.out.println("EM CONTRUÇÃO!!");
						sair();
						break;
					
					case 2:
						
						System.out.println("EM CONTRUÇÃO!!");
						sair();
						break;
					
					case 3:
						
						System.out.println("EM CONTRUÇÃO!!");
						sair();
						break;
						
					case 4:
						//COMEÇA CODIGO EMPRESTIMO
						ContaEmpresa empresa = new ContaEmpresa(numeroConta, 10000); //VALOR DE LIMITE EMPRESTIMO É 10 MIL REAIS

						String cpf;
						char opcao;
						char opcaoSimouNao;
						double valorEmprestimo = 0.0;
						double valor;
						
						
					for (int x = 0; x < 10; x++) {
						
						System.out.println("■■■■■■■ CONTA EMPRESA ■■■■■■");
						System.out.println("DIGITE SEU CPF");
						cpf = leia.next();
						linha();
						
						System.out.printf("\nOlá " + nomeCliente + "\n");
						linha();
						System.out.println("\nSeu SALDO atual é: " + empresa.getSaldo());
						linha();
						System.out.println("\nQual a operação que deseja fazer? ");
						System.out.println("[C] CRÉDITO ou [D] DÉBITO");
						opcao = leia.next().toUpperCase().charAt(0);

						if (opcao == 'C') {
							linha();
							System.out.println("\nSeu SALDO atual é: " + empresa.getSaldo());
							linha();
							
							System.out.println("\n" + nomeCliente + ", Digite o valor para CREDITAR: ");
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
							linha();
							System.out.println("\nSeu SALDO atual é: " + empresa.getSaldo());
							linha();
							
							System.out.println("\n" + nomeCliente + ", Digite o valor para DEBITAR:");
							valor = leia.nextDouble();
							empresa.debito(valor);

							System.out.println("Seu SALDO atual é: " + empresa.getSaldo());
							
							System.out.println("Deseja Continuar?");
							System.out.println("Para [S]Sim ou [N]Não");
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
						linha();
						System.out.println("\nVocê gostaria de um EMPRESTIMO HOJE?");
						System.out.println("TEMOS ÓTIMAS CONDIÇÕES PARA VOCÊ!!");
						linha();
						System.out.println("Para [S]Sim ou [N]Não");
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
					
					//TERMINA CODIGO EMPRESTIMO
						
						break;
						
					case 5:
						
						System.out.println("EM CONTRUÇÃO!!");
						sair();
						
						break;
						
					case 6:
						linha();
						sair();
						linha();
						break;
					
					}
					//FIM DO
				}while (menu > 6);
				{
					
				}
			}
			else if(menu==2){
				System.out.println("EM CONTRUÇÃO!!");
			}
			else if(menu==3) {
				sair();
			}
			else {
				System.out.println("ERRO, TENTE REALIZAR A OPERAÇÃO NOVAMENTE");
				sair();
			}
	}
		

		//FUNCOES
		
		public static void sair() 
		{
			linha();
			System.out.println("\nAGRADECEMOS POR USAR O G5 BANK, ATÉ A PRÓXIMA");
			linha();
		}
		
		public static void linha() 
		{
			for (byte x = 0; x < 35; x++) {
				System.out.print("■");
			}
		}	
}
