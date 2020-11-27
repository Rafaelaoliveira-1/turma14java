programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
	//dias = 30
	//mes = 12
	//ano = 365
	
		inteiro tempoAnos,ano, mes, dia;

		escreva ("Digite o ano do seu nascimento: ")
		leia (ano)
		escreva ("Digite o mês do seu nascimento: ")
		leia (mes)
		escreva ("Digite o dia do seu nascimento: ")
		leia (dia)

		tempoAnos = (ano*365)+(mes*30)+dia;

		escreva ("Você viveu " + tempoAnos + " dias.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 185; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */