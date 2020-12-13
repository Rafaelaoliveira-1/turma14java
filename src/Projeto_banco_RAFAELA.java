import java.util.Random;
import java.util.Scanner;

public class Projeto_banco_RAFAELA {
	static Scanner leia = new Scanner(System.in);
	static Random random = new Random();
	
	//VETORES
	
	static int tipoConta[] = new int[40]; // IDENTIFICAR O TIPO DE CONTA DE CADA CLIENTE;
	static String nomeCLientes[] = { "Allen de Lima Vieira", "André de Brito Silva da Costa", "Bárbara Liboni Guerra",
			"Beatriz Martins", "Beymar Jhoel Acapa Lima", "Breno Nogueira Botelho Noccioli",
			"Daniel Augusto Gomes Ferreira Filho", "Danilo Mendes Ferreira", "Danilo Pereira da Silva",
			"Davi Silva Vieira", "Diego Vinicio da Silva Nascimento", "Erick Costa Ferreira", "Ewerton Inacio Lima",
			"FERNANDA AGAPITO", "Fernanda Barbosa Ferraz", "Francisco José Pires",
			"Gabriel Sérgio Nascimento Santos Gonçalves", "Gideão da Silva Idelfonso", "GILSON AMORIM DE MATOS",
			"Guilherme Gonçalves da Silva", "Gustavo Rabelo Teles", "HELOISA BEATRIZ DE OLIVEIRA COSTA",
			"Igor Mateus Queiroz Gato", "Isabel Emiko Yamakawa Oyama", "Jackeline Akemi de Moura",
			"José Jorge Hauck Júnior", "Juliana Santos André", "Kélven Cleiton de Araújo Brandão", "Laís Lima Santos",
			"Lucas anseloni barros", "Lucas Gonçalves da Silva", "Luis felipe da silva",
			"Luiz Felipe da Silva Magalhães", "Marcos Eduardo Gomes Gonçalves", "Micaely da Silva Lima",
			"Rafaela Oliveira Silva", "Tiago dos Santos Martins", "Verônica Navarro Almena", "Vinicius Alves Miranda",
			"Gabriel Enrique Cabral Silva" }; //NOME DOS CLIENTES
	static int controle[] = new int[40]; //SERVE PARA SABER QUAL CONTA PERTENCE AO CLIENTE EX. ERICK - CONTA POUPANÇA.
	static char sexoClientes[] = { 'M', 'M', 'F', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'M',
			'M', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'F',
			'M', 'M' };
	static int numConta[] = new int[40]; //ARMAZENA A CONTA DE CADA CLIENTE
	static char escolha;
	static double saldo[] = new double [40]; //ARMAZENA O SALDO DE CADA CLIENTE
	static double emprestimo[] = new double [40]; //ARMAZENA VALORES DE EMPRESTIMO PARA CONTA
	static int talao [] = new int [3]; //QUANTIDADE DE TALAO DISPONÍVEL;
	
	
	//FIM VETORES
	
	
	//VARIAVEIS
	
	static int sorteio; //SERVE PARA SORTEAR AS CONTAS DE CADA CLIENTE
	static int volta = 0; // PARA VOLTAR A TELA
	static int pesquisa = -1; //VARRER O VETOR DOS NOMES;
	static int numeroConta; //NUMERO DA CONTA DO CLIENTE
	static double saldoInicial = 0; //SALDO INICIAL
	static double credito = 0.0; //CRÉDITO = DEPOSITO INICIAL
	static double debito = 0.0; //CRÉDITO = SAQUE INICIAL
	static double emprestimoEmpresa = 10.000; //EMPRESTIMO EMPRESA
	static int escolhido = 0; //USADA PARA ENCONTRAR A CONTA DESEJADA;
	static int opcao = 0; //PARA OPCAO DO MENU INTERNO DE CADA FUNÇAO
	static int escolhaUsuario = 0;
	static int opcaoSimouNao; //CRIADA PARA MOVIMENTO SIM OU NAO
	static int x;
	
	//FIM VARIAVEIS
	
	// COMEÇO DO PROGRAMA
	
	public static void main(String[] args) 
	{//COMEÇO MAIN
		
		//VERIFICAÇÃO DE CONTA COM NOME E TIPO DE CONTA.
		
		telaInicial();
		pularLinha();
		
		for (int x = 0; x < 40; x++) 
		{
			sorteio = random.nextInt(5) + 1;
			controle[x] = (x + 1);
			tipoConta[x] = sorteio;
			numConta[x] = x + 1;
		
		}	
		
		//VERIFICAÇÃO DE GENERO 
		
		for (int indice = 0; indice < 40; indice++) 
		{
			if (numConta[indice] == numeroConta) {
				pesquisa = indice;
			}
		}

		if ((sexoClientes[pesquisa] == 'M')) 
			{
				System.out.println("Seja bem vindo,");
			} else if ((sexoClientes[pesquisa] == 'F')) {
				System.out.println("Seja bem vinda");

		} else {
			System.out.println("/n Erro. Tente novamente, ");
		}
		
		for (x = 0; x < 40; x++) 
		{
			if (numeroConta == controle[x]) 
			{
				if(sorteio==1)
				{
					System.out.printf("\n%s ", nomeCLientes[x]);
					System.out.println("\nConta Conta Poupança");
					
					escolhido = x;
				}
				else if (sorteio==2)
				{
					System.out.printf("%s ", nomeCLientes[x]);
					System.out.println("\nConta Conta Corrente");
					escolhido = x;
				}
				else if (sorteio==3)
				{
					System.out.printf("%s", nomeCLientes[x]);
					System.out.println("\nConta Conta Especial");
				
					escolhido = x;
				}
				else if (sorteio==4)
				{
					System.out.printf("%s ", nomeCLientes[x]);
					System.out.println("\nConta Conta Empresa");
					escolhido = x;
				}
				else
				{
					System.out.printf("%s ", nomeCLientes[x]);
					System.out.println("\nConta Universitária");
					escolhido = x;
				}
				
			}
			
		}
		
		//DEVE SER FEITA A ALTERAÇÃO!!!!
		switch(sorteio)
		{
		case 1:
			contaEmpresa();
			//System.out.println("Conta 1 - TESTE USO PARA FUNÇÃO POUPANÇA");
			//contaPoupança();
			break;
		case 2:
			contaEmpresa();
			//System.out.println(" Conta 2 - TESTE USO PARA FUNÇÃO CORRENTE");
			//contaCorrente();
			break;
		case 3:
			contaEmpresa();
			//System.out.println(" Conta 3 - TESTE USO PARA FUNÇÃO ESPECIAL");
			//contaEspecial();
			break;
		case 4:
			contaEmpresa();
			break;
		case 5:
			contaEmpresa();
			//System.out.println(" Conta 5 - TESTE USO PARA FUNÇÃO UNIVERSITARIO");
			//contaUniversitaria();
			break;
		}
		
		
	}//FIM MAIN
	
	//FUNCOES
	
	//LINHA PARA UX;
	
	public static void linha() 
	{
		for (byte x = 0; x < 35; x++) {
			System.out.print("■");
		}
	}
	
	//LINHA PARA PULAR LINHA;
	
	public static void pularLinha() 
	{
		System.out.print("\n");
	}
	
	//LINHA PARA SAIR;
	
	public static void sair() 
	{
		linha();
		System.out.println("AGRADECEMOS POR USAR O G5 BANK, ATÉ A PRÓXIMA");
		linha();
		telaInicial();
	}

	//LINHA PARA VOLTAR;
	
	public static void voltar() 
	{
		System.out.println("\n [1] VOLTAR [2]SAIR ");
		volta = leia.nextInt();
		if (volta == 1) 
		{
			contaEmpresa();
		} else if (volta == 2) {
			sair();
		} else {
			System.out.println("Voce digitou um numero invalido !!!");
		}
	}
		
	//LINHA PARA TELA INICIAL - COMEÇO DO CÓDIGO COM NÚMERO DA CONTA;
	
	public static void telaInicial()
	{
		linha();
		System.out.print("\n              BANCO G5 \n");
		linha();
		System.out.print("\nDigite o NÚMERO DA CONTA: ");
		numeroConta = leia.nextInt();
		linha();
	}
	
	public static void emprestimo()
	{
		int opcaoEmprestimo = 0;
		double limiteEmprestimo = 10.000;
		double valorEmprestimo = 0.0;
		
		
		System.out.println("\nVocê gostaria de um EMPRESTIMO HOJE?");
		pularLinha();
		System.out.println("TEMOS ÓTIMAS CONDIÇÕES PARA VOCÊ!!");
		pularLinha();
		linha();
		pularLinha();
		System.out.println("Para [1]Sim ou [2]Não");
		
		opcaoEmprestimo = leia.nextInt();
		
			if (opcaoEmprestimo == 1)
			{
				System.out.printf("Olá %s, que bom que aproveitou a melhor condição do mercado!", nomeCLientes[x]);
				pularLinha();
				System.out.printf("Você tem %f, quanto você gostaria de pegar?", limiteEmprestimo);
				valorEmprestimo = leia.nextDouble();
				
				if (valorEmprestimo > 0 && valorEmprestimo <= limiteEmprestimo)
				{
						
					saldo[numeroConta] = saldo[numeroConta] + valorEmprestimo;
						
						System.out.printf("PARABÉNS! Você acabou de adquirir R$ %f.", valorEmprestimo);
						System.out.printf("Seu saldo atual é %f.", saldo[numeroConta]);
				}
				voltar();
				
			}
			else 
			{
				voltar();	
			}
	}
	
	
	public static void contaEmpresa()
	{
		linha();
    	System.out.println("\nESCOLHA UMA OPERAÇÃO : ");
    	System.out.println("[1] MOVIMENTAÇÃO");
    	System.out.println("[2] SALDO");
    	System.out.println("[3] SAIR");
    	linha();
       	opcao = leia.nextInt();
       	
       	switch (opcao)
       	{
       	case 1:
       		
       		for (x=0;x<10;x++)
       		{
       			
       			System.out.println("\nDeseja iniciar os movimentos: [1]Sim ou [2] Não");
    			opcaoSimouNao = leia.nextInt();
    			
    			
    		if (opcaoSimouNao == 1) 
    		{
    			//CADA UM VAI TER QUE ALTERAR DEVIDO MUDANÇAS DE CONTA
    			
    			System.out.println("Seu saldo é:" + saldo[numeroConta]);
    			linha();
    			System.out.println("\nVOCE DESEJA FAZER [1] CRÉDITO [2]DEBITO [3]EMPRESTIMO");
           		escolhaUsuario = leia.nextInt();
           		
    			//IF OARA CREDITO = DEPOSITO;
    			
    			if (escolhaUsuario == 1) 
    			{
    				System.out.println("Quanto você deseja DEPOSITAR?");
    				credito = leia.nextDouble();
    				
    					if (credito > 0.0)
    					{
    						for (int x = 0;x<40;x++)
    						{
    							saldo[x] = saldo[x] + credito;
    						}
    					System.out.printf("Seu saldo atual é %f", saldo[numeroConta]);
    							emprestimo();
    							voltar();
    					}
    					else
    					{
    						System.out.println("Não é possível realizar o débito.");
    					}
    					
    			} 
    			
    			//IF OARA DEBITO = SAQUE
    			
    			else if (escolhaUsuario == 2) 
    			{
    				
    				System.out.println("Quanto você deseja RETIRAR?");
    				debito = leia.nextDouble();
    				
    				if (debito > 0.0 && saldo[numeroConta] > 0)
    				{
    					for (int x = 0;x<40;x++)
    					{
    						saldo[x] = saldo[x] - debito;
    					}
    					System.out.printf("Seu saldo atual é %f", saldo[numeroConta]);
    					emprestimo();
    					voltar();
    				}
    				
    				else if (debito <= 0 && saldo[numeroConta] > 0)
    				{
    					System.out.println("Não é possível realizar a retirada.");
    					emprestimo();
    				}
    				
    				else if (escolhaUsuario == 3)
    				{
    					emprestimo();
    					voltar();
    				}
    				
    			}else 
    				{
    					System.out.println("Voce digitou um número invalido !!!");
    				}
    			emprestimo();
    			voltar();
           	
    			
	    		} else if (opcaoSimouNao == 2)
	    			
	    			//AQUI NÃO MUDA
	    			
	    			{
	    				sair();
	    				
	    			} else {
	    				System.out.println("Voce digitou um numero invalido !!!");
	    		}
       			
       		}
        		       		
       		break;
       	
       	case 2:
      		
       		System.out.printf("Seu saldo atual é %f", saldo[numeroConta]);
       		emprestimo();
			voltar();
			linha();
				
       		break;
       	
       	case 3:
       		sair();
       		break;
       	}
	}
	
	//FIM FUNCOES
	
	
}//FIM CÓDIGO
