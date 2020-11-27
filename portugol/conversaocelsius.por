programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real celcius, fahrenheit; //variaveis criadas para guardar a temperatura. 
		
		
		escreva ("***Conversão Celsius (Cº) para Fahrenheit (Fº)***\n")

		escreva ("Digite a temperatura em Celsius (Cº): ");
		leia (celcius);

		fahrenheit = (celcius * 1.8) + 32
		fahrenheit = Matematica.arredondar(fahrenheit, 2)

		escreva ("A temperatura em fahrenheit é " + fahrenheit + " Fº")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 420; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */