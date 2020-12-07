package aulas;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio1_Lista1 {

	public static void main(String[] args) 
	{
		
/* Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a 
 * expressa apenas em dias.*/
		
		Scanner leia = new Scanner (System.in);
		
		int dia, mes, ano, tempoAnos;
		
		System.out.print ("Digite o ANO do seu nascimento: ");
		ano = leia.nextInt();
		
		System.out.print ("Digite o MÊS do seu nascimento: ");
		mes = leia.nextInt();
		
		System.out.print ("Digite o DIA do seu nascimento: ");
		dia = leia.nextInt();
		
		tempoAnos = (((ano*365)+(mes*30)) + dia);
		
		System.out.print ("Você viveu "+ tempoAnos +  " dias");

	}
	
}
