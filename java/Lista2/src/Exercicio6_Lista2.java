import java.util.Scanner;

/*Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos
*/

public class Exercicio6_Lista2 {

	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner (System.in);
		
		int idade;
		
		linha();
		System.out.println("ARQUIVO - CAMPEONATO ESTADUAL DE NATAÇÃO");
		linha();
		
		System.out.println("Olá, qual a idade do nadador? ");
		idade = leia.nextInt();
		linha();

		
		if (idade < 5)
		{
			System.out.println("Idade não legível para o campeonato.");
		}
		else if (idade > 5 && idade <= 7)
		{
			System.out.println("Categoria: INFANTIL A");
		}
		else if (idade > 8 && idade <= 11)
		{
			System.out.println("Categoria: INFANTIL B");
		}
		else if (idade > 12 && idade <= 13)
		{
			System.out.println("Categoria: JUVENIL A");
		}
		else if (idade > 14 && idade <= 17)
		{
			System.out.println("Categoria: JUVENIL B");
		}
		else
		{
			System.out.println("Categoria: ADULTO");
		}
		
	}
	
	//FUNCOES
	
	public static void pulaLinha()
	{
		System.out.println("\n");
	}
	public static void linha()
	{
		System.out.println("******************************************");
	}
	
	
	//FIM PROGRAMA
}
