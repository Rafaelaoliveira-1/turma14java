package Lista4;

import java.util.Scanner;

public class Exercicio1_Lista4 {

	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner(System.in);
		
		int pontuacao[] = new int[5];
		int maior = 0;

		for (int x=0;x < 5; x++)

		{
			System.out.println("Escreva a sua pontuação:");
			pontuacao[x] = leia.nextInt();
			
			if (pontuacao[x] > maior)
			{
				maior = pontuacao[x];
			}			
			
		}
		
		for (int x=0;x < 5; x++)
		{
			System.out.println("\n" + pontuacao[x]);
		}
		
	}
	
}
