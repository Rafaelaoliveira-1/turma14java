import java.util.Scanner;

public class Exercicio1_Lista2 {

	/*Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento 
	 * di�rio de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo 
	 * regulamento do estado de S�o Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. 
	 * Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P (peso de tomates) e verifique se h� 
	 * excesso. Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor da multa que Jo�o 
	 * dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.
*/
	
	public static void main(String[] args) 
	{
		double P, E = 0, M = 0;
		
		Scanner leia = new Scanner (System.in);
		
		linha();
		System.out.println("C�LCULO RENDIMENTO DI�RIO");
		linha();
		pulaLinha();
		
		System.out.println("Ol� Jo�o, digite o rendimento de peso (KG) hoje: ");
		P = leia.nextDouble();
		
		if (P<=50)
		{
			System.out.print("Jo�o, seu rendimento foi "+ P + ", sem nenhum excedente hoje.");
		}
		else
		{
			E = P - 50;
			M = (E * 4);
					
			System.out.print("Jo�o, Carga excedente de " + E + " e o valor da sua multa �: " + M);	
		}
		
		
	}
	
	public static void pulaLinha()
	{
		System.out.println("\n");
	}
	public static void linha()
	{
		System.out.println("************************************");
	}
	
	
}
