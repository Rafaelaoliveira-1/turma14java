package lojaSafari;

public class Cliente extends Pessoa {
	
	private String CPF; //Sem o SET
	private String corrigeCPF;

	public String getCPF() {
		return CPF;
	}
	
	public void novoCPF()
	{
		this.CPF = this.corrigeCPF;
	}
	
	public void novoCPF (String corrigeCPF)
	{
		this.CPF = this.corrigeCPF;
	}
	
}
