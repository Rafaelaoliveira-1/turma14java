package Estudos;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		String endereco;
		String cpf;
		
		System.out.println("Qual o seu nome?");
		nome = leia.next();
		
		Pessoa cliente = new Pessoa(nome);
		
		//Exemplo de utiliza��o de equals e String;
		//String � uma classe do JAVA e j� possui m�todos na linguagem que n�o podem ser alterados.
		// N�o pode usar compara��o (Ex: ==)
		
		
		System.out.println("Informe sua idade");
		idade = leia.nextInt();
		cliente.setIdade(idade);
		
		System.out.println("Seu endere�o");
		leia.nextLine();
		endereco = leia.nextLine();
		cliente.setEndereco(endereco);
		
		System.out.println("Digite seu CPF");
		cpf = leia.next();
		cliente.setCpf(cpf);
		
		System.out.println("Ol� " + cliente.getNome() + ", \n" + cliente.getIdade() + "\n" + cliente.getEndereco() + "\n" + cliente.getCpf());
		
		/*if (nome.equals("Rafaela")) 
		{
			System.out.println("O nome � igual");
		}
		else 
		{
			System.out.println("O nome n�o � igual");
		}*/
		
	}
	
	

}
