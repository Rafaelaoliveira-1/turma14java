package Lista1_OPP;

public class Aviao {

	public String tipoAviao;
	public double velocidadeMinima;
	public double velocidadeMaxima;
	public boolean EstadoAviao;
	
	public Aviao()
	{
		
	}
	public Aviao(double velocidadeMinima, double velocidadeMaxima)
	{
		this.velocidadeMinima = velocidadeMinima;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public char EstadoAviao(char aviao)
	{
		if(EstadoAviao == true)
		{
			System.out.println("Avi�o Ligado");
		}else {
			System.out.println("Avi�o Desligado");
		}
		return 'A';
	}
	
}
