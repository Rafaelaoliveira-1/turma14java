package aulas;

import java.util.Scanner;

public class Exercicio5_Lista1 {

	//Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
	//Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente. 
	
	public static void main(String[] args) 
	{
		String aluno;
		float nota1,nota2,nota3, media, total;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println ("Digite o nome do Alunx:");
		aluno = leia.next();
		
		System.out.println ("Qual 1� nota do aluno: ");
		nota1 = leia.nextFloat();
		
		System.out.println ("Qual 2� nota do aluno: ");
		nota2 = leia.nextFloat();
		
		System.out.println ("Qual 3� nota do aluno: ");
		nota3 = leia.nextFloat();
		
		media = (nota1 * 2) + (nota2 * 3) + (nota3 * 5);
		total = (media / 10);
		
		System.out.println ("A nota aluno foi " + total);
		total = leia.nextFloat();
		
	}
	
	
	
}
