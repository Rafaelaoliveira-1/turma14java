package loja;

import java.util.Scanner;

public class CadLoja {

	// INICIO

	public static void main(String[] args) {

		// PROGRAMA RODA AQUI

		Scanner leia = new Scanner(System.in);

		// VETORES

		String produtos[] = { "Urso Marrom Pequeno", "Urso Marrom Grande",
				"Coruja Pequeno", "Hipopótamo Médio",
				"Leão Grande", "Tigre Grande",
				"Arara Azul Grande", "Tartaruga Média",
				"Coelho Grande", "Girafa Média" };
		String unidade[] = { "Unidade", "Unidade", "Unidade", "Unidade", "Unidade", "Unidade", "Unidade", "Unidade",
				"Unidade", "Unidade"};
		double precos[] = {50,100,50,75,100,100,100,75,100,75};
		int estoque[] = {10,10,10,10,10,10,10,10,10,10,};
		String codigoLoja [] = new String [10];
		String sacola;
		int carrinho[] = new int [10];
				
		// FIM VETORES

		// VARIAVEIS

		int comprarProdutos, gerenciarEstoque, sair;
		String nomeCliente;
		char generoCliente;
		int opcaoMenu;
		final int tamanhoLinha = 80;
		char continuar = 'S';
		int escolha = 0;
		int quantidadeCompra;

		// FIM VARIAVEIS

		// MENU
		
		
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

			switch (opcaoMenu) {

			// COMPRAR PRODUTO

			case 1:
				leia.nextLine(); // É usado para limpar e colocar o nome completo.
				System.out.println("Qual o seu nome:");
				nomeCliente = leia.nextLine();
				System.out.println("Gênero - Aperte [M] Masculino, [F] Feminino ou [O] Outrx");
				generoCliente = leia.next().toUpperCase().charAt(0);
				pularLinha();

				System.out.printf("\nSeja bem-vind%s, %s", retornaGenero(generoCliente), nomeCliente);
				pularLinha();
				//ESTOQUE
				linha(tamanhoLinha);
				System.out.println("\n CODIGO\t\tR$(UN)\t\tESTOQUE\t\tNOME PRODUTO");
				linha(tamanhoLinha);
				for (int x=0;x<10;x++)
				{
					codigoLoja[x] = (x < 9) ? "P-0" + (x + 1) : "P-" + (x + 1);
					
					System.out.printf("\n %s\t\t%.2f\t\t%d\t%s\n", codigoLoja[x], precos[x], estoque[x], produtos[x]);
					
				}
				
				//FIM ESTOQUE
			//SOLICITA CÓDIGO PARA COMPRA
				pularLinha();
				System.out.println("Selecione pelo código o produto:");
				sacola = leia.next().toUpperCase();
				
				System.out.println("Quantos itens você deseja levar?");
				quantidadeCompra = leia.nextInt();
				
				
				
				for (int x=0;x<9;x++)
				{
					
					if (estoque[x]<quantidadeCompra)
					{
						System.out.println("Quantidade indisponível");
						break;
					}
					
					else {
						if (sacola.equals(codigoLoja[x]))
						{
							System.out.printf("Você escolheu %s",produtos[x]);
							System.out.println("\n Valor total: " + (precos[x]*quantidadeCompra));
							estoque[x] = estoque[x]-quantidadeCompra;
						}
					}
					
				}
				
				
				
				System.out.printf("\nDeseja continuar? [S] SIM OU [N] NÃO");
				continuar = leia.next().toUpperCase().charAt(0);
				pularLinha();
				break;

			// FIM COMPRAR PRODUTO

			case 2:

			// GERENCIAR ESTOQUE

							
				System.out.println("WIP");
				
				for ()
				{
					
				}
				System.out.printf("\nDeseja continuar? [S] SIM OU [N] NÃO");
				continuar = leia.next().toUpperCase().charAt(0);
				pularLinha();
				break;

			// FIM GERENCIAR ESTOQUE

			case 3:

			// SAIR

				pularLinha();
				linha(tamanhoLinha);
				System.out.print("\n                      Obrigado por visitar nossa loja.");
				System.out.print("\n                             VOLTE SEMPRE!!!");
				pularLinha();

				break;

			// FIM SAIR
				
			}

		} while (continuar == 'S');

		// FIM MENU
	}

	
	
	
	// FUNCOES

	public static void pularLinha() {
		System.out.println("\n");
	}

	public static void linha(int tamanhoLinha) {

		for (int x = 0; x <= tamanhoLinha; x++) {
			System.out.print("x");
		}

	}

	public static String retornaGenero(char generoCliente) {

		String tipo;

		if (generoCliente == 'M' || generoCliente == 'm') {
			tipo = "o";
		} else if (generoCliente == 'F' || generoCliente == 'f') {
			tipo = "a";
		} else if (generoCliente == 'O' || generoCliente == 'o') {
			tipo = "x";
		} else {
			tipo = "*";
		}

		return tipo;

	}

	// FIM PROGRAMA
}
