package Lista1_OPP;

public class Cliente {

	public String nomeCompleto;
	public String genero;
	public int anoNascimento;
	public int idade;
	public String email;

	public Cliente() {

	}

	public Cliente(String nomeCompleto, String genero, int anoNascimento, String email) {

		this.nomeCompleto = nomeCompleto;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
		this.email = email;
	}

	public void retornaIidade() {
		this.idade = 2020 - this.anoNascimento;
	}

	public void retornaIidade(int anoAtual) {
		this.idade = anoAtual - this.anoNascimento;
	}
	
}
