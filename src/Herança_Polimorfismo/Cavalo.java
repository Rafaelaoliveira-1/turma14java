package Herança_Polimorfismo;

public class Cavalo extends Animal {

	
	
	public Cavalo(String nome, int idade)
	{
		super(nome,idade);
	}
	
	public String correr()
	{
		return "Cavalo correndo";
	}
	
	public String emitirSom()
	{
		return "Hin in in";
	}
	
}
