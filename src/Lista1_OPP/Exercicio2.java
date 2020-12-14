package Lista1_OPP;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		char opcao;
		
		Aviao aviao1 = new Aviao();
		Aviao aviao = new Aviao (250,350);
		
		System.out.println("O avião está [L]ligado ou [D]desligado?");
		opcao = leia.next().charAt(0);
		aviao.EstadoAviao(opcao);
		
		System.out.printf("A velocidade mímina é %f e velocidade máxima é %f",aviao.velocidadeMinima, aviao.velocidadeMaxima);
		
	}

}
