package Heranca_Encapsulamento;

import java.util.Scanner;

public class Empresa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//VARIAVEIS
		
		String nome, telefone, endereco;
		double credito, debito;
		
		//DADOS DAS PESSOAS
		
		Pessoa pessoa = new Pessoa();
		Fornecedor fornecedor = new Fornecedor("Renato", "(11) 91234-5678");
		Empregado empregado = new Empregado("Sueli", "(11)91234-5678", 900, 0.10);
		
		//COMEÇO PROGRAMA
		
		
		System.out.println("--------------------------------------------------------");
		System.out.println("                  DADOS CLIENTE");
		System.out.println("--------------------------------------------------------");
		System.out.println("Digite o nome:");
		nome = leia.nextLine();
		pessoa.setNome(nome);
		
		System.out.println("Digite o número de telefone: ");
		telefone = leia.nextLine();
		
		pessoa.setTelefone(telefone);
		
		System.out.println("Digite o endereço dessa pessoa: ");
		endereco = leia.nextLine();
		pessoa.setEndereco(endereco);
		
		System.out.println("Dados Cliente");
		System.out.println("Nome: " + pessoa.getNome() + " Telefone: " + pessoa.getTelefone() + " Endereço: " + pessoa.getEndereco());
		
		System.out.println("--------------------------------------------------------");
		System.out.println("                  DADOS FORNECEDOR");
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Digite crédito desse fornecedor: ");
		credito = leia.nextDouble();
		
		System.out.println("Digite dívida desse fornecedor? ");
		debito = leia.nextDouble();
		
		fornecedor.setValorCredito(credito);
		fornecedor.setValorDivida(debito);
		System.out.println("Dados Fornecedor");
		System.out.println("Nome: " + fornecedor.getNome() + " Telefone: " + fornecedor.getTelefone() + " Saldo: R$" + fornecedor.obterSaldo());
		leia.close();
		
		System.out.println("--------------------------------------------------------");
		System.out.println("                  DADOS EMPREGADOS");
		System.out.println("--------------------------------------------------------");
		

		System.out.println("Detalhes do salário");	
		System.out.println("Salário base de R$ 900.00 e imposto de 10%:");	
		
		System.out.println("Nome: " + empregado.getNome() + " Telefone: " + empregado.getTelefone() + " Salário líquido: " + empregado.calcularSalario());

	}

}
