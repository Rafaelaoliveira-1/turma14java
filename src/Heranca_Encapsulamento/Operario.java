package Heranca_Encapsulamento;

public class Operario extends Pessoa {

	// valorProducao (que corresponde ao valor monetário dos artigos efetivamente
	// produzidos pelo operário) e comissao (que corresponde à porcentagem do
	// valorProducao que será adicionado ao vencimento base do operário).

	private double valorProducao;
	private double comissao;

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

}
