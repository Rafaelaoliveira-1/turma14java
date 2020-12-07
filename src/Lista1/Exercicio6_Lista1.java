package aulas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio6_Lista1 {

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		double x1=0.0, x2=0.0, y1=0.0,y2=0.0, d=0.0;
		
		System.out.println("Valor de X1: ");
		x1 = leia.nextInt();
		
		System.out.println("Valor de X2: ");
		x2 = leia.nextInt();
		
		System.out.println("Valor de Y1: ");
		y1 = leia.nextInt();
		
		System.out.println("Valor de Y2: ");
		y2 = leia.nextInt();
		
		d = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		
		System.out.println("Valor de D: "+ df.format(d));
	}
	
}
