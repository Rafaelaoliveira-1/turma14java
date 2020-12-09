package Lista3;

import java.util.Scanner;

public class EnquantoPara_Exercicio2_Lista3 {

	public static void main (String[] args)
	{
		Scanner leia = new Scanner (System.in);
		
		int numero = 0, soma=0, contador=0;

		System.out.println("Digite um número do seu teclado:");
		numero = leia.nextInt();
		
		do
		{
			contador++;
			soma= (soma+contador);

		}
		while (contador<numero);
		{
			System.out.println("A soma é igual à " + soma);
		}
	}
		
	
}
