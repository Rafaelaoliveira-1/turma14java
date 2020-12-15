package Heranca_Encapsulamento;

public class Empregado extends Pessoa {

	// codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem
	// retida dos impostos)

	private int codigoSetor;
	private double salarioBase;
	private double imposto;

	public Empregado() {

	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public double calcularSalario() {
		return this.salarioBase * (1 - imposto);
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public Empregado(String nome, String telefone, double salarioBase, double imposto) {
		super(nome, telefone);
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

}
