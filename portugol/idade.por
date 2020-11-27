programa
{
	
	funcao inicio()

	{

		cadeia nomePessoa  //variavel utilizada para pedir o nome do usuário.
		const inteiro anoAtual = 2020 //variavel ano atual
		inteiro anoNascimento, idade //variavel usada para pegar o ano de nascimento da usuário.
		
		escreva("Digite o seu nome: ")
		leia (nomePessoa)

		escreva ("Digite sua data de nascimento [aaaa]: ")
		leia (anoNascimento)

		idade = anoAtual - anoNascimento //variavel utilizada para fazer a conta para idade.
				
		escreva ("Olá Alune " + nomePessoa + ", seja bem vinde ao Generation Brasil. Sua idade é " + idade + " anos.")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 115; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */