package aulas;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio2_Lista1 {

		public static void main(String[] args) 
		
		{
			
			/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em 
			 * anos, meses e dias.*/

			Scanner leia = new Scanner (System.in);
			
			int dia, mes, ano, tempoDias;
			
			System.out.print ("Digite o tempo em dias: ");
			tempoDias = leia.nextInt();
	
			
			ano = (tempoDias / 365);
			mes = ((tempoDias % 365) / 30);
			dia = ((tempoDias % 365) % 30);

			
			System.out.print ("Você viveu " + ano + " anos e " + mes + " meses " + dia + " dias.");


		}	
}
