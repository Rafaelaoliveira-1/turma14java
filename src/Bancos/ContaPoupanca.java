package Bancos;

public class ContaPoupanca extends Conta {

	//atributo
		private int dataAniversarioConta;
		
		
		//construtor
		public ContaPoupanca(int numeroConta, String cpf, int dataAniversarioConta) {
			super(numeroConta, cpf);
			this.dataAniversarioConta = dataAniversarioConta;
		}
		
		
		//ENCAPSULAMENTO - GETTER AND SETTERS
		
		public int getDataAniversarioConta() {
			return dataAniversarioConta;
		}

		public void setDataAniversarioConta(int dataAniversarioConta) {
			this.dataAniversarioConta = dataAniversarioConta;
		}
		
		
	
}
