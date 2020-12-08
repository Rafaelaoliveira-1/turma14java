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
		
		
		linha();
		System.out.println("                   SAFÁRI PELUCIAS            ");
		linha();
		System.out.println("              'Tenha uma vida mais fofa'      \n");

		
		System.out.println("Digite [1] COMPRAR PRODUTOS \n");
		System.out.println("Digite [2] GERENCIAR ESTOQUE \n");
		System.out.println("Digite [3] SAIR \n");
		System.out.println("ESCOLHA UMA DAS OPÇÕES ACIMA");
		opcaoMenu = leia.nextInt();
		
		switch(opcaoMenu);
		{
		case 1:
			System.out.println("Qual o seu nome: \n");
			nomeCliente = leia.next();
			System.out.println ("Gênero - Aperte [M] Masculino, [F] Feminino ou [O] Outrxs");
			generoCliente = leia.next().charAt(0);
		//	
			break;
			
		case 2:
			
			System.out.println("Em construção...");
			break;
			
		case 3:
			linha();
			System.out.println("Obrigado por visitar nossa loja. ");
			pularLinha();
			System.out.println("VOLTE SEMPRE!!!");
			linha();
			break;
		}

	}

	//FUNCOES
	
	public static void pularLinha()
	{
		System.out.println("\n");
	}
	public static void linha()
	{
		System.out.println("×××××××××××××××××××××××××××××××××××××××××××××××××××××××××××");
	}
	
	public static String retornaGenero(char generoCliente);
	{
		
		String tipo;
		
			if (generoCliente == 'M');
			{
				tipo = "Masculino";
			}
			else if (generoCliente == 'F');
			{
				tipo = "Feminino";
			}
			else if (generoCliente == 'O');
			{
				tipo = "Outro";
			}
			else
			{
				tipo = "*";
			}
			
	
		return tipo;
		
	}

	
	//FIM PROGRAMA
}
