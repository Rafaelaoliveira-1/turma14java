package Lista1_OPP;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main (String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		Cliente cliente = new Cliente("Rafaela Oliveira Silva","Feminino", 1994,"rafaela.oliveira_@hotmail.com");

		cliente.retornaIidade();
		System.out.println("Seu nome � " + cliente.nomeCompleto);
		System.out.println("Voc� � do genero " + cliente.genero);
		System.out.println("Voc� nasceu em " + cliente.anoNascimento);
		System.out.println("E sua idade � "+ cliente.idade + " anos.");
		System.out.println("Seu e-mail � "+ cliente.email );
		
	}
	
	
	
	

}
