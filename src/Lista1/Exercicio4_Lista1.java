package aulas;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio4_Lista1 {

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner (System.in);
		
		double A,B,C,R,S,D;
		
		System.out.println ("Escreva n�mero A: ");
		A = leia.nextDouble();
		
		System.out.println ("Escreva n�mero B: ");
		B = leia.nextDouble();
		
		System.out.println ("Escreva n�mero C: ");
		C = leia.nextDouble();
		

		R = ((A+B)*(A+B));
		S = ((B+C)*(B+C));
		D = ((R+S) / 2);
		
		System.out.printf ("\nO resultado � %.2f " , D);
		D = leia.nextDouble();
		
	}
	
}
