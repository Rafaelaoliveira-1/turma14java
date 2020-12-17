package FuncionarioTesteAula;

public class Funcionario {

	private String nome;
	private int horasMensais;
	private double valorHora;
	private double pagamentoSalario;
	
	public Funcionario()
	{
		
	}
	
	public Funcionario(String nome, int horasMensais, double valorHora) {
		this.nome = nome;
		this.horasMensais = horasMensais;
		this.valorHora = valorHora;
	}
	
	public Funcionario(String nome, double valorHora) {
		this.nome = nome;
		this.valorHora = valorHora;
	}
	
	public Funcionario(double pagamentoSalario)
	{
		this.pagamentoSalario = (horasMensais * valorHora);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHorasMensais() {
		return horasMensais;
	}

	public void setHorasMensais(int horasMensais) {
		this.horasMensais = horasMensais;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	
}
