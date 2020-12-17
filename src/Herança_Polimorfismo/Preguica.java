package Heran�a_Polimorfismo;

public class Preguica extends Animal {
	
	private String emitirSom; 
	
	public Preguica(String nome, int idade)
	{
		super(nome,idade);
	}
	
	public String subirArvore()
	{
		return "Pregui�a subindo a �rvore";
	}
	
	public String emitirSom()
	{
		return "ZZZZZZZ";
	}
	
}
