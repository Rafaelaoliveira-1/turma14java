import java.util.Random;
import java.util.Scanner;

public class banco_teste {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner leia = new Scanner(System.in);
		
		String nomeCliente[] = { "Allen de Lima Vieira", "Andr� de Brito Silva da Costa", "B�rbara Liboni Guerra",
				"Beatriz Martins", "Beymar Jhoel Acapa Lima", "Breno Nogueira Botelho Noccioli",
				"Daniel Augusto Gomes Ferreira Filho", "Danilo Mendes Ferreira", "Danilo Pereira da Silva",
				"Davi Silva Vieira", "Diego Vinicio da Silva Nascimento", "Erick Costa Ferreira", "Ewerton Inacio Lima",
				"Fernanda Agapito", "Fernanda Barbosa Ferraz", "Francisco Jos� Pires", "Gabriel Enrique Cabral Silva",
				"Gabriel S�rgio Nascimento Santos Gon�alves", "Gide�o da Silva Idelfonso", "Gilson Amorim de Matos",
				"Guilherme Gon�alves da Silva", "Gustavo Rabelo Teles", "Heloisa Beatriz de Oliveira Costa",
				"Igor Mateus Queiroz Gato", "Isabel Emiko Yamakawa Oyama", "Jackeline Akemi de Moura",
				"Jos� Jorge Hauck J�nior", "Juliana Santos Andr�", "K�lven Cleiton de Ara�jo Brand�o",
				"La�s Lima Santos", "Lucas anseloni barros", "Lucas Gon�alves da Silva", "Luis felipe da silva",
				"Luiz Felipe da Silva Magalh�es", "Marcos Eduardo Gomes Gon�alves", "Micaely da Silva Lima",
				"Rafaela Oliveira Silva", "Tiago dos Santos Martins", "Ver�nica Navarro Almena",
				"Vinicius Alves Miranda" };
		
		int tipoConta[] = new int[40];
		int controle[] = new int[40];

		System.out.printf("\nDETALHES DOS CLIENTES");
		
		System.out.printf("\n N� CONTA:  \t\t NOME CLIENTE:  \t\t TIPO CONTA: ");
		System.out.printf("\n");
		
		for (int x = 0; x < 40; x++) {
			
			int sorteio = random.nextInt(5) + 1;

			controle[x] = (x + 1);
			tipoConta[x] = sorteio;
			
			switch(sorteio)
			{
			case 1:
				//ContaPoupanca();
				System.out.println(" - Conta Poupan�a");
				break;
			case 2:
				//ContaCorrente();
				System.out.println(" - Conta Corrente");
				break;
			case 3:	
				//ContaEspecial()
				System.out.println(" - Conta Especial");
				break;
			case 4:
				///ContaEmpresa()
				System.out.println(" - Conta Empresa");
				break;
			case 5:
				//ContaUniversitaria()
				System.out.println(" - Conta Universit�ria");
				break;
			}
			
			System.out.printf("\n %d \t %s \t%s", controle[x], nomeCliente[x], sorteio);

		}
		
		
		
		if(saldo <= 0) {
	        System.out.println("Opera��o n�o realizada.");
	        System.out.println("\n Aperte V para retornar \n");
	        char voltar = leia.next().toUpperCase().charAt(0);
	        if (tipo == 'V'){

	            //menu();
	        }
	    }

	    else if
	    {
	        for (int x = 0; x < 3; x++) {
	            System.out.println("\n Impress�o de Tal�o de Cheque (S) para Sim, (N) para N�o");
	            char tipo = leia.next().toUpperCase().charAt(0);
	            if (tipo == 'S') {

	                acumuladorTalao++;

	                System.out.println(" \n Tal�o de cheque impresso com sucesso!");
	                System.out.println(" \n O saldo atual � de:" + saldo);
	                System.out.println(" \n Total de tal�o impresso no m�s:" + acumuladorTalao);
	            }
	        }
	    }

	}
	
	//FUN�OES
	
	public static void contaEmpresa() 
	{
		
		
		
	}
	
}
