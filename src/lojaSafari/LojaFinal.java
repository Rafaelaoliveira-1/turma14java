package lojaSafari;

import java.util.Scanner;

public class LojaFinal {

	public static void main(String[] args) {
		//variveis
		
		Scanner leia = new Scanner(System.in);
		String codigos[] = new String[10];
		String produtos[] =  { "Urso Marrom Pequeno", "Urso Marrom Grande",
				"Coruja Pequeno", "Hipopótamo Médio",
				"Leão Grande", "Tigre Grande",
				"Arara Azul Grande", "Tartaruga Média",
				"Coelho Grande", "Girafa Média" };
		double precoUnitarios[] = {50,100,50,75,100,100,100,75,100,75};
		int estoque[] = new int[10];
		int escolhido = 0;
		String escolha;
		
		
			
		linhaDetalhe();
		System.out.println("               SAFÁRI PELÚCIAS");
		System.out.println("         'Tenha uma vida mais fofa :)'");
		linhaDetalhe();
		System.out.println();
		
		// menu inicial
		
		System.out.println("[1] - COMPRAR PRODUTOS");
		System.out.println("[2] - GERENCIAR ESTOQUE");
		System.out.println("[3] - SAIR");
		System.out.println();
		System.out.print("DIGITE A OPÇÃO: ");
		char opcaoMenu = leia.next().charAt(0);
		switch (opcaoMenu) 
		{
			case '1':
			{
				System.out.print("Por favor informe o seu nome: ");
				String nomeCliente = leia.next().toUpperCase();
				System.out.print("Você de define como M-masculino, F-feminino ou O-outro :");
				char generoCliente = leia.next().toUpperCase().charAt(0);
				System.out.printf("Seja bem-vind%s loja %s!!!\n",voltaGenero(generoCliente),nomeCliente);
				//
				System.out.println("CODIGO\t\tR$(UN)\t\tESTOQUE\tPRODUTO");
				linhaDetalhe();
				for (int x=0; x<10; x++) 
				{
					estoque[x]=10;
					codigos[x]=(x<9)?"BES00"+(x+1):"BES0"+(x+1);
					System.out.printf("%s\t\t%.2f\t\t%d\t%s\n",codigos[x],precoUnitarios[x],estoque[x],produtos[x]);
											
				}
				System.out.println("Selecione pelo codigo um produto: ");
				escolha = leia.next().toUpperCase();
				for (int x=0; x<10; x++)
				{
					if (codigos[x]==escolha)
					{
						escolhido = x;
						System.out.println("Escolhdo foi "+x);
					}
					 
				}
				System.out.println("Produto escolhido: "+produtos[escolhido]);
				break;
				
			}
			case '2':
			{
				System.out.println("WIP");  // work in progress
				break;
			}
			case '3':
			{
				System.out.println("Volte sempre, adoramos sua visita!!!");
				break;
			}
				
		}
		
		

	}
	
	
	public static void linhaDetalhe() {
		System.out.println("═══════════════════════════════════════════════════════");
		
	}
	
	public static String voltaGenero(char generoCliente) {
		
		String tipo;
		if (generoCliente == 'M') 
		{
			tipo = "o";
		}
		else if (generoCliente == 'F') 
		{
			tipo = "a";
		}
		else if (generoCliente == 'O') 
		{
			tipo = "x";
		} 
		else
		{
			tipo = "*";
		}
			
		
		return tipo;
	
	}
	
	//FIM FUNCOES

}

