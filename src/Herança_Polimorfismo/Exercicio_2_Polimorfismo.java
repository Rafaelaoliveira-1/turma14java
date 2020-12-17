package Herança_Polimorfismo;

public class Exercicio_2_Polimorfismo {

	public static void main(String[] args) {
		
		
		
		Cachorro cachorro = new Cachorro("Zeus", 8);
		Cavalo cavalo = new Cavalo ("Faísca", 10);
		Preguica preguica = new Preguica ("Fast", 2);
		
		System.out.println("O nome do Cachorro " + cachorro.getNome() + " e faz o seguinte barulho: " + cachorro.emitirSom());
		System.out.println("O nome do Cavalo " + cavalo.getNome() + " e faz o seguinte barulho: " + cavalo.emitirSom());
		System.out.println("O nome da Preguiça " + preguica.getNome() + " e faz o seguinte barulho: " + preguica.emitirSom());
	}

}
