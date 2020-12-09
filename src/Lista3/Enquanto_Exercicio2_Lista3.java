package Lista3;

import java.util.Scanner;

public class Enquanto_Exercicio2_Lista3 {

	//INICIO
	
	public static void main (String[] args)
	{
		Scanner leia = new Scanner (System.in);
		
		int numero;
		
		
		System.out.println("Digite um número:");
		numero = leia.nextInt();
		
		System.out.println(numero + " ");
		
		while(numero <= 100)
			{
				numero = (numero * 3);
				System.out.println(numero + "");
			}
		
	} //FIM PUBLIC STATIC
	
	//FUNCOES
	
}
