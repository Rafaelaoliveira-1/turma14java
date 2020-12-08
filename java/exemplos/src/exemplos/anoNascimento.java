package exemplos;

import java.util.Scanner;

public class anoNascimento {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		int anoNascimento;	
		
		System.out.print("Digite o seu ano de nascimento: ");
		anoNascimento = leia.nextInt();	
		
		calculaIdade (anoNascimento);
		
		System.out.print(calculaIdade(anoNascimento));

	}

	static int calculaIdade(int ano)
	{
		int idade = 2020 - ano;
		
		return (idade);
				
	}

}
