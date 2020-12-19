package lojaSafari;

public class Produto extends Pessoa {
	
	private String codigo;
	private String nomeProduto;
	private double precoUnitario;
	private int qtdeProdutoEstoque;
	private int qtdeVendida;

	public Produto(String codigo, String nomeProduto, double precoUnitario, int qtdeProdutoEstoque) {
		super();
		this.codigo = codigo;
		this.nomeProduto = nomeProduto;
		this.precoUnitario = precoUnitario;
		this.qtdeProdutoEstoque = qtdeProdutoEstoque;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQtdeProdutoEstoque() {
		return qtdeProdutoEstoque;
	}

	public int getQtdeVendida() {
		return qtdeVendida;
	}

	public void setQtdeVendida(int qtdeVendida) {
		this.qtdeVendida = qtdeVendida;
	}

	public boolean venda(int qtdeVendida) {
		if (qtdeVendida > this.qtdeProdutoEstoque || qtdeVendida <= 0) {
			return false;
		} else {
			return true;
		}

	}

	public void tiraEstoque(int qtdeVendida) {
		this.qtdeProdutoEstoque = this.qtdeProdutoEstoque - qtdeVendida;
	}

	public void adicionarEstoque(int entrada) {
		this.qtdeProdutoEstoque = this.qtdeProdutoEstoque + entrada;
	}

	public double carrinho(int qtdeVendida) {
		return (qtdeVendida * this.precoUnitario);
	}
}
