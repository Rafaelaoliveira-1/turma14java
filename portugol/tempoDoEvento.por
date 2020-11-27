programa
{
	inclua biblioteca Matematica
	
	funcao inicio(){

	inteiro tempoSegundos, segundos, minutos, horas

	//segundos = 1
	//minutos = 60
	//horas = 3600
		
		escreva ("Digite o tempo do evento em segundos: ")
		leia (tempoSegundos)

	horas = tempoSegundos / 3600
	minutos = (tempoSegundos % 3600) / 60
	segundos = (tempoSegundos % 3600) % 60

	escreva ("O tempo do evento em minutos foi de " + minutos + " minutos e em horas foi de " + horas + " horas.")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 349; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */