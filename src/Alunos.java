import java.util.Scanner;

public class Alunos {

	public static void main(String[] args) 
	//INICIO
	{
		Scanner leia = new Scanner (System.in);
		
		String alunos[] = {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva","Davi Silva Vieira","Gabriel Enrique Cabral Silva","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","Fernanda Agapito","Fernanda Barbosa Ferraz","Francisco José Pires","Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso","Gilson Amorim de Matos","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles","Heloisa Beatriz de Oliveira Costa","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André","Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros","Lucas Gonçalves da Silva","Luis felipe da silva","Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Verônica Navarro Almena","Vinicius Alves Miranda"};
		char sexo[] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','M','F','M','F','F','M','F','M','F','M','M','M','M','M','F','F','M','F','M','M'};
		int notas[] = new int[40];
		int matriculas[] = new int[40];
		
		
		inserirLinha(60);
		
		//NUMERO DE MATRÍCULA DO ALUNO.
		
		for (int i=0;i<40;i++) 
		{
			matriculas[i] = i+1;
		}
		
		//SEXO DO ALUNO.
				{
		for (int i=0;i<40;i++) 
			if (sexo[i] == 'M')
			{
				System.out.println("\n" + "Nº Matrícula: G-"+ matriculas[i] + "\nAluno: " + alunos[i]);
			}
			else
			{
				System.out.println("\n" + "Nº Matrícula: G-"+ matriculas[i] + "\nAluna: " + alunos[i]);
			}
		}
		
		

	}
	
	//FUNCÕES
	
	public static void inserirLinha(int tamanho) 
	{
		for (int x = 0; x < tamanho; x++) 
		{
			System.out.print("▬");
		}
		System.out.print("\n");
	}

	
	
}
