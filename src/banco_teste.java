import java.util.Random;
import java.util.Scanner;

public class banco_teste {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner leia = new Scanner(System.in);
		
		String nomeCliente[] = { "Allen de Lima Vieira", "André de Brito Silva da Costa", "Bárbara Liboni Guerra",
				"Beatriz Martins", "Beymar Jhoel Acapa Lima", "Breno Nogueira Botelho Noccioli",
				"Daniel Augusto Gomes Ferreira Filho", "Danilo Mendes Ferreira", "Danilo Pereira da Silva",
				"Davi Silva Vieira", "Diego Vinicio da Silva Nascimento", "Erick Costa Ferreira", "Ewerton Inacio Lima",
				"Fernanda Agapito", "Fernanda Barbosa Ferraz", "Francisco José Pires", "Gabriel Enrique Cabral Silva",
				"Gabriel Sérgio Nascimento Santos Gonçalves", "Gideão da Silva Idelfonso", "Gilson Amorim de Matos",
				"Guilherme Gonçalves da Silva", "Gustavo Rabelo Teles", "Heloisa Beatriz de Oliveira Costa",
				"Igor Mateus Queiroz Gato", "Isabel Emiko Yamakawa Oyama", "Jackeline Akemi de Moura",
				"José Jorge Hauck Júnior", "Juliana Santos André", "Kélven Cleiton de Araújo Brandão",
				"Laís Lima Santos", "Lucas anseloni barros", "Lucas Gonçalves da Silva", "Luis felipe da silva",
				"Luiz Felipe da Silva Magalhães", "Marcos Eduardo Gomes Gonçalves", "Micaely da Silva Lima",
				"Rafaela Oliveira Silva", "Tiago dos Santos Martins", "Verônica Navarro Almena",
				"Vinicius Alves Miranda" };
		
		int tipoConta[] = new int[40];
		int controle[] = new int[40];

		System.out.printf("\nDETALHES DOS CLIENTES");
		
		System.out.printf("\n Nº CONTA:  \t\t NOME CLIENTE:  \t\t TIPO CONTA: ");
		System.out.printf("\n");
		
		for (int x = 0; x < 40; x++) {
			
			int sorteio = random.nextInt(5) + 1;

			controle[x] = (x + 1);
			tipoConta[x] = sorteio;
			
			switch(sorteio)
			{
			case 1:
				//ContaPoupanca();
				System.out.println(" - Conta Poupança");
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
				System.out.println(" - Conta Universitária");
				break;
			}
			
			System.out.printf("\n %d \t %s \t%s", controle[x], nomeCliente[x], sorteio);

		}
		
		
		
		if(saldo <= 0) {
	        System.out.println("Operação não realizada.");
	        System.out.println("\n Aperte V para retornar \n");
	        char voltar = leia.next().toUpperCase().charAt(0);
	        if (tipo == 'V'){

	            //menu();
	        }
	    }

	    else if
	    {
	        for (int x = 0; x < 3; x++) {
	            System.out.println("\n Impressão de Talão de Cheque (S) para Sim, (N) para Não");
	            char tipo = leia.next().toUpperCase().charAt(0);
	            if (tipo == 'S') {

	                acumuladorTalao++;

	                System.out.println(" \n Talão de cheque impresso com sucesso!");
	                System.out.println(" \n O saldo atual é de:" + saldo);
	                System.out.println(" \n Total de talão impresso no mês:" + acumuladorTalao);
	            }
	        }
	    }

	}
	
	//FUNÇOES
	
	public static void contaEmpresa() 
	{
		
		
		
	}
	
}
