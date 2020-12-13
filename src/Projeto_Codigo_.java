
import java.util.Scanner;
import java.util.Random;

public class Projeto_Codigo_ {

	static Scanner leia = new Scanner(System.in);
	static Random random = new Random();
	static int tipoConta[] = new int[40];
	static String nomeCLientes[] = { "Allen de Lima Vieira", "Andr� de Brito Silva da Costa", "B�rbara Liboni Guerra",
			"Beatriz Martins", "Beymar Jhoel Acapa Lima", "Breno Nogueira Botelho Noccioli",
			"Daniel Augusto Gomes Ferreira Filho", "Danilo Mendes Ferreira", "Danilo Pereira da Silva",
			"Davi Silva Vieira", "Diego Vinicio da Silva Nascimento", "Erick Costa Ferreira", "Ewerton Inacio Lima",
			"FERNANDA AGAPITO", "Fernanda Barbosa Ferraz", "Francisco Jos� Pires",
			"Gabriel S�rgio Nascimento Santos Gon�alves", "Gide�o da Silva Idelfonso", "GILSON AMORIM DE MATOS",
			"Guilherme Gon�alves da Silva", "Gustavo Rabelo Teles", "HELOISA BEATRIZ DE OLIVEIRA COSTA",
			"Igor Mateus Queiroz Gato", "Isabel Emiko Yamakawa Oyama", "Jackeline Akemi de Moura",
			"Jos� Jorge Hauck J�nior", "Juliana Santos Andr�", "K�lven Cleiton de Ara�jo Brand�o", "La�s Lima Santos",
			"Lucas anseloni barros", "Lucas Gon�alves da Silva", "Luis felipe da silva",
			"Luiz Felipe da Silva Magalh�es", "Marcos Eduardo Gomes Gon�alves", "Micaely da Silva Lima",
			"Rafaela Oliveira Silva", "Tiago dos Santos Martins", "Ver�nica Navarro Almena", "Vinicius Alves Miranda",
			"Gabriel Enrique Cabral Silva" };
	static int controle[] = new int[40];
	static char sexoClientes[] = { 'M', 'M', 'F', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'M',
			'M', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'F',
			'M', 'M' };
	static int sorteio;
	static int volta = 0;
	static int pesquisa = -1;
	static int numeroConta;
	static int numConta[] = new int[40];
	static char escolha;
	static double saldo[] = new double [40];
	static double saldoInicial = 0;
	static double credito = 0.0;
	static double debito = 0.0;
	static double emprestimo = 10.000;
	
	// o programa mesmo � aqui
	
	public static void main(String[] args) {

		// preenchendo o vetor de controle e tipo de conta
		
		for (int x = 0; x < 40; x++) {
			sorteio = random.nextInt(5) + 1;
			controle[x] = (x + 1);
			tipoConta[x] = sorteio;
			numConta[x] = x + 1;

		}

		menuPrincipal();
		System.out.print("\nDigite o numero da Conta do cliente: ");
		numeroConta = leia.nextInt();
		menuEntrada(numeroConta);

	}

	public static void menuEntrada(int numeroConta) {
		int escolhido = 0;

		for (int x = 0; x < 40; x++) {
			if (numeroConta == controle[x + 1]) {

				System.out.printf("\n %d \t %s \t%s", controle[x], nomeCLientes[x], sorteio);
				escolhido = x;
			}
		}

		switch (tipoConta[escolhido]) 
		{
		case 1:
			// ContaPoupanca();
			System.out.println(" - Conta Poupan�a");
			break;
		case 2:
			// ContaCorrente();
			System.out.println(" - Conta Corrente");
			break;
		case 3:
			// ContaEspecial()
			System.out.println(" - Conta Especial");
			break;
		case 4:
			/// ContaEmpresa()
			System.out.println(" - Conta Empresa");
			break;
		case 5:
			// ContaUniversitaria()
			System.out.println(" - Conta Universit�ria");
			break;
		}

		for (int indice = 0; indice < 40; indice++) 
		{
			if (numConta[indice] == numeroConta) {
				pesquisa = indice;
			}
		}

		if ((sexoClientes[pesquisa] == 'M')) 
		{
			System.out.printf("Seja bem vindo, " + nomeCLientes[pesquisa]);
		} else if ((sexoClientes[pesquisa] == 'F')) {
			System.out.println("Seja bem vinda, " + nomeCLientes[pesquisa]);

		} else {
			System.out.println("Erro");
		}
	}

	public static void menuPrincipal() {
		int tipo = 0;
		linha();
		System.out.println("\n            G5 BANK\n");
		linha();
		System.out.println("\n[1] - MOVIMENTA��O\r\n" + "[2] - SALDO\r\n" + "[3] - SAIR\r\n" + "");
		linha();
		tipo = leia.nextInt();

		switch (tipo) {
		case 1:
		case 2:
			/*for (int x = 0; x < 40; x++) {
				if (saldoInicial > 0)
				{
					System.out.printf("Seu saldo � %d",saldoInicial);
				}
				else
				{
					System.out.printf("Seu saldo � %d, n�o � poss�vel ficar negativa.",saldoInicial);
				}
			}
			]
			*/voltar();
			voltar();
			break;
		case 3:
			sair();
			break;
		}
	}

	public static void linha() 
	{
		for (byte x = 0; x < 35; x++) {
			System.out.print("-");
		}
	}

	public static void sair() 
	{
		System.out.println(" AGRADECEMOS POR USAR O G5 BANK, AT� A PROXIMA ");
		menuEntrada(numeroConta);
	}

	public static void voltar() 
	{
		System.out.println(" [1] VOLTAR [2]SAIR ");
		volta = leia.nextInt();
		if (volta == 1) {
			menuPrincipal();
		} else if (volta == 2) {
			sair();
		} else {
			System.out.println("Voce digitou um numero invalido !!!");
		}
	}
	
	//parte RAFAELA
	
	public static void contaEmpresa() 
	{
		//MENU PRINCIPAL
		System.out.print("\nDigite o numero da Conta do cliente: ");
		numeroConta = leia.nextInt();
		menuEntrada(numeroConta);
		
		for (int x = 0; x < 40; x++) 
		{
			sorteio = random.nextInt(5) + 1;
			controle[x] = (x + 1);
			tipoConta[x] = sorteio;
			numConta[x] = x + 1;
		}	
	}
		
		public static void menuEntrada(int numeroConta) {
			int escolhido = 0;

			for (int x = 0; x < 40; x++) {
				if (numeroConta == controle[x + 1]) {

					System.out.printf("\n %d \t %s \t%s", controle[x], nomeCLientes[x], sorteio);
					escolhido = x;
				}
			}

			switch (tipoConta[escolhido]) {
			case 1:
				// ContaPoupanca();
				System.out.println(" - Conta Poupan�a");
				break;
			case 2:
				// ContaCorrente();
				System.out.println(" - Conta Corrente");
				break;
			case 3:
				// ContaEspecial()
				System.out.println(" - Conta Especial");
				break;
			case 4:
				/// ContaEmpresa()
				System.out.println(" - Conta Empresa");
				break;
			case 5:
				// ContaUniversitaria()
				System.out.println(" - Conta Universit�ria");
				break;
			}
			
		
		int tipo = 0;
		linha();
		System.out.println("\n            G5 BANK\n");
		linha();
		System.out.println("\n[1] - MOVIMENTA��O\r\n" + "[2] - SALDO\r\n" + "[3] - SAIR\r\n" + "");
		linha();
		tipo = leia.nextInt();
		
		switch (tipo)
		{
		case 1:
			
			break;
		case 2:
			System.out.println("VOCE DESEJA FAZER [1] CREDITO [2]DEBITO [3]EMPRESTIMO");
			volta = leia.nextInt();
		
			if (credito == 1) 
			{
				System.out.println("Quanto voc� deseja depositar?");
				credito = leia.nextDouble();
				
					if (credito < 0)
					{
						System.out.println("N�o � poss�vel realizar o d�bito.");
					}
					else
					{
						for (int x = 0;x<40;x++)
						{
							saldo[x] = saldo[x] + credito;
							
							System.out.printf("Seu saldo atual � %d", saldo[x]);
						}
					}

			} 
			
			else if (debito == 2) 
			{
				
				System.out.println("Quanto voc� deseja retirar?");
				debito = leia.nextDouble();
				
				if (debito>0)
				{
					for (int x = 0;x<40;x++)
					{
						saldo[x] = saldo[x] - debito;
						
						System.out.printf("Seu saldo atual � %d", saldo[x]);
					}
				}
				
				else if (debito < 0)
				{
					System.out.println("N�o � poss�vel realizar a retirada.");
				}
				
				
			}else {
					System.out.println("Voce digitou um numero invalido !!!");
				}
			
			voltar();
			break;
		
		case 3:
			sair();
			break;
		}

		//[1] - MOVIMENTA��O
		//CREDITO = DEPOSITAR
		//DEBITO = SACAR
		
		
		
		
		//[2] - SALDO
		//[3] - SAIR

		
		//FIM FUNCAO
		}
}
