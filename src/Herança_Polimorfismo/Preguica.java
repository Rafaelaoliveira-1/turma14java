package Herança_Polimorfismo;

public class Preguica extends Animal {
	
	private String emitirSom; 
	
	public Preguica(String nome, int idade)
	{
		super(nome,idade);
	}
	
	public String subirArvore()
	{
		return "Preguiça subindo a árvore";
	}
	
	public String emitirSom()
	{
		return "ZZZZZZZ";
	}
	
}
