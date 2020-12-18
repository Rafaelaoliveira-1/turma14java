package Bancos;

public class ContaEmpresa extends Conta{

private double emprestimoEmpresa;
	
//INICIO CONTRUÇÕES


	public ContaEmpresa(int numeroConta,double emprestimoEmpresa)
	{
		super(numeroConta);
		this.emprestimoEmpresa=emprestimoEmpresa;
	}
	
	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	
	//FIM CONTRUÇÕES
	
	//INICIO METODO
	
	public void emprestimoSolicitado(double valorEmprestimo)
	{
		if(valorEmprestimo <= this.emprestimoEmpresa)
		{
			this.emprestimoEmpresa=this.emprestimoEmpresa-valorEmprestimo;
			this.saldo = this.saldo + valorEmprestimo;
			
			System.out.println("Valor disponível para NOVO emprestimo: " + this.emprestimoEmpresa);
			System.out.println("Saldo ATUAL: "+this.saldo);
		}
		else 
		{
			System.out.println("Valor indísponível. Verifique com seu gerente");
		}
		
	}
	
	//FIM METODO
	
	
}//FIM CONTA EMPRESA
