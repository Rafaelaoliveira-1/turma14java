package lojaSafari;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class LojaFinal {

	public static void main(String[] args) {
		//variveis
		
		Scanner leia = new Scanner(System.in);
		
		int escolhido = 0;
		String escolha;
		int  numeroParcela = 0;
		int anoNascimento;
		int qtdeVendida;
		int produtoCompra;
		int anoAtual = 2020;
		String cpf;
		
		List<Produto> lista = new ArrayList<>();
		List<Produto> carrinho = new ArrayList<>();
		
		lista.add(new Produto("P-001", "Urso Marrom Pequeno", 50, 10));
		lista.add(new Produto("P-002", "Urso Marrom Grande", 100, 10));
		lista.add(new Produto("P-003", "Coruja Pequeno", 50, 10));
		lista.add(new Produto("P-004", "Hipopótamo Médio", 75, 10));
		lista.add(new Produto("P-005", "Leão Grande", 100, 10));
		lista.add(new Produto("P-006", "Tigre Grande", 100, 10));
		lista.add(new Produto("P-007", "Arara Azul Grande", 100, 10));
		lista.add(new Produto("P-008", "Tartaruga Média", 75, 10));
		lista.add(new Produto("P-009","Coelho Grande", 100, 10));
		lista.add(new Produto("P-010", "Girafa Média", 75, 10));
		
		
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
				System.out.println("Olá " + nomeCliente + " ,digite O gênero que te define");
				System.out.print(" [M] Masculino, [F] Feminino ou [O] Outro ");
				char generoCliente = leia.next().toUpperCase().charAt(0);
				System.out.printf("Seja bem-vind%s loja %s!!!\n",voltaGenero(generoCliente),nomeCliente);
				/*System.out.println("Qual o ano do seu nascimento");
				anoNascimento = leia.nextInt();
				if (anoNascimento < 1850 || anoNascimento > anoAtual) {
					System.out.println("Ano incorreto. Digite novamente seu ano de nascimento: ");
					anoNascimento = leia.nextInt();
				}
				*/
				System.out.println(nomeCliente + ",digite o seu CPF: ");
				cpf = leia.nextLine();
				
				Cliente cliente = new Cliente(nomeCliente, genero, anoNascimento, cpf);
				
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
						System.out.println("Escolhdo foi " + x);
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

