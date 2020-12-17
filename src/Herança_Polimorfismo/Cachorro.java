package Herança_Polimorfismo;

public class Cachorro extends Animal {


	public Cachorro(String nome, int idade)
	{
		super(nome,idade);
	}
	
	public String correr()
	{
		return "Cachorro correndo";
	}
	
	public String emitirSom()
	{
		return "au-au";
	}
	
}
