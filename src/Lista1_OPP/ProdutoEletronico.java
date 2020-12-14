package Lista1_OPP;

public class ProdutoEletronico {
	
	public String categoria;
	public String marca;
	
	public ProdutoEletronico(String categoria, String marca)
	{
		this.categoria = categoria;
		this.marca = marca;
	}
	
	public void Produto() 
	{
		System.out.println("O produto é da categoria: " + categoria);
		System.out.println("O produto marca: " + marca);
	}
}
