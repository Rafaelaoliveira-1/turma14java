package lojaSafari;

public abstract class Pessoa {

	private String nome;
	private char genero;
	private int anoNascimento;	
	private int idade;
	
	//CONTRUTORES
	
	public Pessoa()
	{
		
	}
	
	public Pessoa (String nome)
	{
		this.nome = nome;
	}
	
	public Pessoa(String nome, char genero, int anoNascimento, int idade) {
		this.nome = nome;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
		this.idade = idade;
	}
	
	public Pessoa(String nome, char genero, int idade) {
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
	}
	
	//METODO
	
	public void voltaIdade(int idade)
	{
		this.idade = 2020 - this.anoNascimento;
	}
	
	public void voltaIdade()
	{
		this.idade = 2020 - this.anoNascimento;
	}

	//GET AND SET
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
}
