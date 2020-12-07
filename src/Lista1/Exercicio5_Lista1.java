package aulas;

import java.util.Scanner;

public class Exercicio5_Lista1 {

	//Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
	//Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
	
	public static void main(String[] args) 
	{
		String aluno;
		float nota1,nota2,nota3, media, total;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println ("Digite o nome do Alunx:");
		aluno = leia.next();
		
		System.out.println ("Qual 1º nota do aluno: ");
		nota1 = leia.nextFloat();
		
		System.out.println ("Qual 2º nota do aluno: ");
		nota2 = leia.nextFloat();
		
		System.out.println ("Qual 3º nota do aluno: ");
		nota3 = leia.nextFloat();
		
		media = (nota1 * 2) + (nota2 * 3) + (nota3 * 5);
		total = (media / 10);
		
		System.out.println ("A nota aluno foi " + total);
		total = leia.nextFloat();
		
	}
	
	
	
}
