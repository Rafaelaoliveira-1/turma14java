package loja;

import java.util.Scanner;

public class CadLoja {

	//INICIO
	
	public static void main (String[] args) {
		
		// PROGRAMA RODA AQUI
		
		Scanner leia = new Scanner (System.in);
		
		int comprarProdutos, gerenciarEstoque, sair;
		String nomeCliente;
		char generoCliente;
		int opcaoMenu;
		final int tamanhoLinha = 80;
		char continuar = 'S';
		
		do {
			linha(tamanhoLinha);
			System.out.println("\n                             SAFÁRI PELÚCIAS");
			System.out.println("                        'Tenha uma vida mais fofa :)'");
			linha(tamanhoLinha);
			pularLinha();
			
			System.out.println("Digite [1] COMPRAR PRODUTOS \n");
			System.out.println("Digite [2] GERENCIAR ESTOQUE \n");
			System.out.println("Digite [3] SAIR \n");
			System.out.println("ESCOLHA UMA DAS OPÇÕES ACIMA \n");
			opcaoMenu = leia.nextInt();
			
			switch(opcaoMenu)
			{
			case 1:
				leia.nextLine(); //É usado para limpar e colocar o nome completo.
				System.out.println("Qual o seu nome: \n");
				nomeCliente = leia.nextLine();
				System.out.println ("Gênero - Aperte [M] Masculino, [F] Feminino ou [O] Outrx");
				generoCliente = leia.next().toUpperCase().charAt(0);
				pularLinha();
				
				System.out.printf("Seja bem-vind%s, %s",retornaGenero(generoCliente), nomeCliente);
				
				System.out.printf("\nDeseja continuar? [S] SIM OU [N] NÃO");
					continuar = leia.next().toUpperCase().charAt(0);
					pularLinha();
				break;
				
			case 2:
				
				System.out.println("WIP");
				System.out.printf("\nDeseja continuar? [S] SIM OU [N] NÃO");
				continuar = leia.next().toUpperCase().charAt(0);
				pularLinha();
				break;
				
			case 3:
				pularLinha();
				linha(tamanhoLinha);
				System.out.print("\n                      Obrigado por visitar nossa loja.");
				System.out.print("\n                             VOLTE SEMPRE!!!");
				pularLinha();

				break;
			}

		}
		while (continuar == 'S');
	
	}

	//FUNCOES
	
	public static void pularLinha()
	{
		System.out.println("\n");
	}
	
	public static void linha(int tamanhoLinha)
	{
		
		for (int x=0; x <= tamanhoLinha; x++)
		{		
			System.out.print("x");
		}
		
	}
	
	public static String retornaGenero(char generoCliente)
	{
				   
		String tipo;
	
			if (generoCliente == 'M' || generoCliente == 'm')
			{
				tipo = "o";
			}
			else if (generoCliente == 'F' || generoCliente == 'f')
			{
				tipo = "a";
			}
			else if (generoCliente == 'O' || generoCliente == 'o')
			{
				tipo = "x";
			}
			else
			{
				tipo = "*";
			}
			
	
		return tipo;
		
	}
	
	//FIM PROGRAMA
}
