package Heranca_Encapsulamento;

public class Funcionario {

	public static void main(String[] args) {
		Empregado empregado = new Empregado("Sueli", "(11)91234-5678", 1000, 0.05);
		
		System.out.println("Considerando um salário base de R$ 1000 e imposto de 5%:");
		System.out.println("Nome: " + emp.getNome() + " Telefone: " + emp.getTelefone() + " Salário líquido: "
				+ emp.calcularSalario());

	}

}
