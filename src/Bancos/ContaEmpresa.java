package Bancos;

public class ContaEmpresa extends Conta{

private double emprestimoEmpresa;
	
	//encapsulamento

	public ContaEmpresa(int numeroConta, double emprestimoEmpresa) {
		super(numeroConta);
		this.emprestimoEmpresa = emprestimoEmpresa;
	}

	
	public ContaEmpresa(int numeroConta, String cpf, double emprestimoEmpresa) {
		super(numeroConta, cpf);
		this.emprestimoEmpresa = emprestimoEmpresa;
	}


	//encapsulamento - getters and setters

	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	
	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	
	
}
