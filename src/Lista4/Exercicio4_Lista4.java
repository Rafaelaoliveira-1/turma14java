package Lista4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio4_Lista4 
{

	public static void main (String [] args)
	{
		int matriz [][] = new int[3][3];
		int soma = 0;
		
		Scanner leia = new Scanner(System.in);
		Random sorteio = new Random ();
		
		      for(int linha = 0; linha < 3; linha++)
		       {
		            for (int coluna = 0; coluna < 3; coluna++)
		            {
		                matriz[linha][coluna] = sorteio.nextInt(9);
		            }


		        for(int linha1 = 0; linha1 < 3; linha1++)
		        {
		            for(int coluna = 0; coluna < 3; coluna++)
		            {
		                soma = soma + matriz[linha1][coluna];
		            }

		        }

		        System.out.println("A soma das matriz � de: " + soma);
		        System.out.println("\n");

		         for(int linha1 = 0; linha1 < 3; linha1++)
		         {
		            for(int coluna = 0; coluna < 3; coluna++)
		            {
		                if(linha1 == coluna)
		                {
		                    soma = matriz[linha1][coluna] + soma;
		                }

		            }

		        }
		        System.out.println("A soma da matriz diagonal �: " + soma);

		    }
	}
	
}
