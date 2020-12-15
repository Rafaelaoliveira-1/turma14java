package Heranca_Encapsulamento;

public class Fornecedor extends Pessoa {

	private double valorCredito;
	private double valorDivida;

	public Fornecedor() {

	}

	public double obterSaldo() {
		return (this.valorCredito - this.valorDivida);
	}

	public Fornecedor(String nome, String telefone) {
		super(nome, telefone);
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

}
