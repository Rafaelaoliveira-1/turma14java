package aulas;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio7_Lista1 {

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner (System.in);
		
		double A,B,C,D,E,F, X, Y;
		
		
		System.out.println ("Escreva número A: ");
		A = leia.nextDouble();
		
		System.out.println ("Escreva número B: ");
		B = leia.nextDouble();
		
		System.out.println ("Escreva número C: ");
		C = leia.nextDouble();
		
		System.out.println ("Escreva número D: ");
		D = leia.nextDouble();
		
		System.out.println ("Escreva número E: ");
		E = leia.nextDouble();
		
		System.out.println ("Escreva número F: ");
		F = leia.nextDouble();
		
		X = ((C*E) - (B*F)) / ((A*E) - (B*D));
		Y = ((A*F) - (C*D)) / ((A*E) - (B*D));
		
		System.out.printf ("O valor de X é: %.2f " , X );
		System.out.printf("\n valor de Y foi: %.2f " , Y);
		
		
	}
	

	
}
