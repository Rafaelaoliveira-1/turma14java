package Lista4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2_Lista4 {

	public static void main (String [] args) {
		
		Scanner leia = new Scanner(System.in);
		Random sorteio = new Random ();
		
		int lancamentos[] = new int[10];
		int valorDados, somarValor = 0, maiorValor = 0, ocorrencia = 0;
		
		
			for (int x=0; x<10; x++)
			{
				lancamentos[x] = sorteio.nextInt(6)+1;
				
				System.out.println("\nValor sorteado é o número foi: " + (lancamentos[x]));
	
				somarValor = somarValor + lancamentos[x];
				
				if (lancamentos[x] > maiorValor)
				{
					maiorValor = lancamentos[x];
				}
	
			for(int x1=0; x1<10; x1++)
			{
				if (lancamentos[x1] == maiorValor)
				{
					ocorrencia++;
				}

			}
			
			System.out.println ("\nA soma do valor é:" + somarValor);
			System.out.println ("\nA média é: " + somarValor / 10);
			System.out.println ("\nMaior número lançado " + maiorValor + " e o sorteio foi " + ocorrencia + " número de vezes");
			
		}
		
		
	}
	

	
	
}
