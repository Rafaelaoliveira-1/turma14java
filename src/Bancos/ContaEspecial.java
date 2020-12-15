package Bancos;

public class ContaEspecial extends ContaCorrente{


private double valorLimite;

		//encapsulamento
	
	public ContaEspecial(int numeroConta, double valorLimite) {
		super(numeroConta);
		
		this.valorLimite = valorLimite;
	}

	public double getValorLimite() {
		return valorLimite;
	}

	public void setValorLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}
	
}
