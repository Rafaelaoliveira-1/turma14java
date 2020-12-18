package lojaSafari;

public class Produto extends Pessoa {
	
	private String nomeProduto;
	private String codigo;
	private double precoUnitario;
	private int qtdeProdutoEstoque;
	
	private int tiraEstoque;
	
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	
	//MEUS METODOS - MINHAS REGRAS
		public void tiraEstoque(int saida) 
		{
			if (testarEstoque(saida))
			{
				//this.qtdeProdutoEstoque = this.qtdeProdutoEstoque - saida;
				this.qtdeProdutoEstoque -= saida;
			}
			else 
			{
				System.out.println("ESTOQUE INDISPONIVEL");
			}
			
		}
		
		public void adicionaEstoque(int entrada) 
		{
			
			//this.qtdeProdutoEstoque = this.qtdeProdutoEstoque + entrada;
			this.qtdeProdutoEstoque += entrada;
		}
		
		public boolean testarEstoque(int valor) 
		{
			
			if (valor > this.qtdeProdutoEstoque) 
			{
				return false;
			}
			else if (valor == 0)
			{
				return false;
			}
			else if (this.qtdeProdutoEstoque == 0)
			{
				return false;
			}
			else if (this.qtdeProdutoEstoque < 0)
			{
				return false;
			}
			else	
			{
				return true;
			}
			
		}
		
		
		public double venda(int qtdeVendida) 
		{
			
			if (testarEstoque(qtdeVendida))
			{
				tiraEstoque(qtdeVendida);
				return qtdeVendida * this.precoUnitario;
			
			} 
			else 
			{
				System.out.println("Venda negada!!!");
				return 0;
			}
		
		
		}
}
