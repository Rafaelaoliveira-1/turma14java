package Lista4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio3_Lista4 {

	public static void main (String [] args) 
	{
		Scanner leia = new Scanner(System.in);
		Random sorteio = new Random ();
					
		    int linha, coluna;
	        int matrizN1[][] = new int[4][6];
	        int matrizN2[][] = new int[4][6];
	        int matrizM1[][] = new int[4][6]; //0-3 0-5
	        int matrizM2[][] = new int[4][6];

	        System.out.println("MATRIZ N1");

	        for (linha = 0; linha < 4; linha++) {
	            for (coluna = 0; coluna < 6; coluna++) {
	                matrizN1[linha][coluna] = sorteio.nextInt(9);
	                System.out.print(matrizN1[linha][coluna] + " ");
	            }

	            System.out.println("");
	        }
	        System.out.println("\nMATRIZ N2");

	        for (linha = 0; linha < 4; linha++) {
	            for (coluna = 0; coluna < 6; coluna++) {
	                matrizN2[linha][coluna] = sorteio.nextInt(9);
	                System.out.print(matrizN2[linha][coluna] + " ");
	            }

	            System.out.println("");
	        }
	        System.out.println("\nMATRIZ M1");
	        for (linha = 0; linha < 4; linha++) {
	            for (coluna = 0; coluna < 6; coluna++) {
	                matrizM1[linha][coluna] = matrizN1[linha][coluna] + matrizN2[linha][coluna];
	                System.out.print(matrizM1[linha][coluna] + " ");
	            }
	            System.out.println("");

	        }

	        System.out.println("\nMATRIZ M2");
	        for (linha = 0; linha < 4; linha++) {
	            for (coluna = 0; coluna < 6; coluna++) {
	                matrizM2[linha][coluna] = matrizN1[linha][coluna] - matrizN2[linha][coluna];
	                System.out.print(matrizM2[linha][coluna] + " ");
	            }
	            System.out.println("");

	        }
	}
	
}
