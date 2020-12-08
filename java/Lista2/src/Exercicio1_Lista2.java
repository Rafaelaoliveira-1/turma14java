import java.util.Scanner;

public class Exercicio1_Lista2 {

	/*João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento 
	 * diário de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo 
	 * regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. 
	 * João precisa que você faça um sistema que leia a variável P (peso de tomates) e verifique se há 
	 * excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João 
	 * deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.
*/
	
	public static void main(String[] args) 
	{
		double P, E = 0, M = 0;
		
		Scanner leia = new Scanner (System.in);
		
		linha();
		System.out.println("CÁLCULO RENDIMENTO DIÁRIO");
		linha();
		pulaLinha();
		
		System.out.println("Olá João, digite o rendimento de peso (KG) hoje: ");
		P = leia.nextDouble();
		
		if (P<=50)
		{
			System.out.print("João, seu rendimento foi "+ P + ", sem nenhum excedente hoje.");
		}
		else
		{
			E = P - 50;
			M = (E * 4);
					
			System.out.print("João, Carga excedente de " + E + " e o valor da sua multa é: " + M);	
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
