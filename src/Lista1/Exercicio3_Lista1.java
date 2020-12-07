package aulas;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio3_Lista1 {

	public static void main(String[] args)
	{
		Scanner leia = new Scanner (System.in);
		
		int tempoSegundos, segundos, minutos, horas;
		
		System.out.print ("Digite o tempo do evento em segundos: ");
		tempoSegundos = leia.nextInt();
		
		horas = tempoSegundos / 3600;
		System.out.print ("\nO tempo do evento em horas foi de " + horas + " horas ");
		
				
		minutos = (tempoSegundos % 3600) / 60;
		System.out.print ("\nO tempo do evento em minutos foi de " + minutos + " minutos");
		
		
	    segundos = (tempoSegundos % 3600) % 60;
	    System.out.print ("\nO tempo do evento em segundos foi de " + segundos + " segundos");
		
	}
	
}
