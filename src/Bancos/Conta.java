package Bancos;

public class Conta {

	//ATRIBUTOS
	private int numeroConta;//tem
	protected double saldo;//tem
	private String cpf;//tem


	public Conta(int numeroConta) 
	{
		this.numeroConta = numeroConta;
	}

	//SOBRECARGA
	
	public Conta(int numeroConta, String cpf)
	{
		this.numeroConta = numeroConta;
		this.cpf = cpf;
	}
	
	public Conta(String cpf)
	{
		
		this.cpf = cpf;
	}

	public int getNumeroConta() {
		return numeroConta;
	}


	public double getSaldo() {
		return saldo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	//FIM SOBRECARGA

	//METODOS 

	public void debito(double valorDebito) 
	{
		if (testarSaldo(valorDebito))  
		{
			this.setSaldo(this.getSaldo() - valorDebito);
			System.out.println("SALDO TOTAL: R$ " + this.getSaldo());
		} 
		else
		{
			System.out.println("SALDO INDISPONIVEL");
		}


	}



	public void credito (double valorCredito) 
	{
		this.setSaldo(this.getSaldo() + valorCredito);
		System.out.println("SALDO TOTAL: R$ " + this.getSaldo());
	}

	public boolean testarSaldo(double valor) 
	{

		boolean teste;
		if (valor <= this.getSaldo()) {
			teste = true;
		} else {
			teste = false;
		}

		return teste;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	//FIM METODOS 
	
}
