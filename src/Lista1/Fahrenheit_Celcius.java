package aulas;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Fahrenheit_Celcius {

	public static void main(String[] args)
	{	
		Scanner leia = new Scanner(System.in);
		
		double grausCelsius;
		double grausFahrenheit;
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("Qual a temperatura em Celsius: ");
		grausCelsius = leia.nextDouble();
		grausFahrenheit = ( grausCelsius * 1.8 )+32;
		System.out.println("Temperatura em Celsius: "+ df.format(grausFahrenheit)+ "C");
		
	}
	
}
