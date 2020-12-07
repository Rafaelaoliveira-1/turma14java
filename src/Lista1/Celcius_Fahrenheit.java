package aulas;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Celcius_Fahrenheit {

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner(System.in);
		double grausCelsius;
		double grausFahrenheit;
		
		DecimalFormat df = new DecimalFormat("#.00");

		System.out.println("Qual a temperatura em Fahrenheit: ");
		grausFahrenheit = leia.nextDouble();
		grausCelsius = ( grausFahrenheit - 32 ) / 1.8;
		System.out.println("Temperatura em Celsius: "+ df.format(grausCelsius)+ "C");
	}
	
	
}
