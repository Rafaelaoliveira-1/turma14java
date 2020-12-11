
import java.util.Scanner;
import java.util.Random;

public class Projeto_Codigo_ {

	static Scanner leia = new Scanner(System.in);
	static Random random = new Random();
	static int tipoConta [] = new int [40];
	static String nomeCLientes [] = {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires","Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso","GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles","HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André","Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros","Lucas Gonçalves da Silva","Luis felipe da silva","Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Verônica Navarro Almena","Vinicius Alves Miranda", "Gabriel Enrique Cabral Silva"};
	static int controle[] = new int[40];
	static char sexoClientes[] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F','F','M','F','M','F','M','M','M','M','M','F','F','M','F','M','M'};
	static int sorteio;
	
	//o programa mesmo é aqui
	public static void main(String[] args) 
	{
	
		
	    double saldo [] = new double [40];
	    
	    int volta = 0;
		int pesquisa=-1;
		int numeroConta;
		int numConta [] = new int [40];
		char escolha;
		
	    
	    
	    
	    //preenchendo o vetor de controle e tipo de conta
	    for (int x=0; x<40; x++) 
	    {
  
	    	sorteio = random.nextInt(5) + 1;
			controle[x] = (x + 1);
			tipoConta[x] = sorteio;
			numConta[x] = x+1;
			

	    }
		
	    menuPrincipal();
	    System.out.print("\nDigite o numero da Conta do cliente: ");
	  	numeroConta = leia.nextInt();
	    menuEntrada(numeroConta);
	     
	    
		
		
	}
	
	
	
	public static void menuEntrada(int numeroConta)
	{

		int escolhido;
		
		for (int x = 0; x < 40; x++) 
		{
			if (numeroConta==controle[x+1]) 
			{
				
				System.out.printf("\n %d \t %s \t%s", controle[x], nomeCLientes[x], sorteio);
				escolhido=x;
			}
		}
			
			switch(tipoConta[escolhido])
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
					

		}

	
	
  	   
  	   
  	  
  	  for (int indice=0; indice<40; indice++) 
			{
				if (numConta[indice]==numeroConta) {
					pesquisa = indice;
				}
			}
  	  
  	  if((sexoClientes[pesquisa] == 'M')) {
  		  System.out.printf("Seja bem vindo, " + nomeCLientes[pesquisa]);
  	  }
        else if ((sexoClientes[pesquisa] == 'F')) {
      	  System.out.println("Seja bem vinda, " + nomeCLientes[pesquisa]);
      	  
        } else {
            System.out.println( "Erro");
        }
	}
	
	public static void menuPrincipal()
	{
		    int tipo =0;
			linha();
			System.out.println("\n            G5 BANK\n");
			linha();
			System.out.println("\n[1] - MOVIMENTAÇÃO\r\n"
					+ "[2] - SALDO\r\n"
					+ "[3] - SAIR\r\n"
					+ "");
			linha();
				tipo = leia.nextInt();
			
			switch(tipo)
			{
			case 1:
			case 2:
				for(int x =0; x<40;x++)
				{
				
				}
				voltar();
				break;
			case 3: sair();
			break;
			}
	}
	
	public static void linha()
	{
		for( byte x =0;x<35;x++)
		{
			System.out.print("-");
		}
	}
	public static void sair()
	{
		System.out.println(" AGRADECEMOS POR USAR O G5 BANK, ATÉ A PROXIMA ");
		menuEntrada();
	}
	public static void voltar()
	{
		System.out.println(" [1] VOLTAR [2]SAIR ");
		volta = leia.nextInt();
		if (volta == 1)
		{
			 menuPrincipal();
		}else if (volta == 2)
		{
			sair();
		}
		else 
		{
			System.out.println("Voce digitou um numero invalido !!!");
		}
	}
	
}
