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
		
		//Exemplo de utilização de equals e String;
		//String é uma classe do JAVA e já possui métodos na linguagem que não podem ser alterados.
		// Não pode usar comparação (Ex: ==)
		
		
		System.out.println("Informe sua idade");
		idade = leia.nextInt();
		cliente.setIdade(idade);
		
		System.out.println("Seu endereço");
		leia.nextLine();
		endereco = leia.nextLine();
		cliente.setEndereco(endereco);
		
		System.out.println("Digite seu CPF");
		cpf = leia.next();
		cliente.setCpf(cpf);
		
		System.out.println("Olá " + cliente.getNome() + ", \n" + cliente.getIdade() + "\n" + cliente.getEndereco() + "\n" + cliente.getCpf());
		
		/*if (nome.equals("Rafaela")) 
		{
			System.out.println("O nome é igual");
		}
		else 
		{
			System.out.println("O nome não é igual");
		}*/
		
	}
	
	

}
