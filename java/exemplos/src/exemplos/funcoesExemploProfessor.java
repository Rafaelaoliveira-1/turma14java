package exemplos;

import java.util.Scanner;

public class funcoesExemploProfessor {

	public class ProgramaIdade
	{
		public static void main(String[] args) // parte principal - programa mesmo
		{
			//variaveis
			Scanner leia = new Scanner(System.in); //instanciado o teclado
			int anoNascimento, idade;
			System.out.println("Digite o ano de nascimento da pessoa: ");
			anoNascimento = leia.nextInt();
			linha();
			//System.out.printf("A idade- da pessoa é %d anos de idade\n",voltaIdade(anoNascimento));
			//tipoIdade(anoNascimento);
			idade = rafaIdade(anoNascimento);
			System.out.println(idade+" anos de idade");
					
			
			
		
		}
		
		public static int voltaIdade(int anoNascimento)
		{
			int idade;
			idade = 2020 - anoNascimento;
			return idade;
		}
		
		public static void tipoIdade(int anoNascimento)
		{
			if (voltaIdade(anoNascimento)<18)
			{
				linha();
				System.out.println("Você é infanto-juvenil!!!");
				linha();
			}
			else if ((voltaIdade(anoNascimento)<=60))
			{
				System.out.println("Vc é adulto!!!");
			}
			else {
				System.out.println("Vc é idoso!!!!");
			}
			
		}
		
		public static void linha()
		{
			System.out.println("----------------------------------------------------");
		}
		
		public static int rafaIdade(int anoNascimento)
		{
			int idade;
			idade = 2020 - anoNascimento;
			
			if (idade<18)
			{
				linha();
				System.out.println("Você é infanto-juvenil!!!");
				linha();
			}
			else if (idade<=60)
			{
				System.out.println("Vc é adulto!!!");
			}
			else {
				System.out.println("Vc é idoso!!!!");
			}
			
			return idade;
					
		}
	
}
