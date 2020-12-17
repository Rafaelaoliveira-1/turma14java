package FuncionarioTesteAula;

public class Terceiro extends Funcionario{

	private double valorHora;
	private double valorTerceiro;
			
	public Terceiro()
	{
		
	}
	
	public Terceiro(double pagamentoSalario)
	{
		this.pagamentoSalario = (super.horasMensais * super.valorHora);
	}
	
}
