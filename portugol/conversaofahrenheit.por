programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real celsius,fahrenheit
		escreva ("**Conversão de Fahrenheit (Fº) para Celsius (Cº)***\n")
		escreva ("Digite a temperatura em Fahrenheit (Fº) : ")
		leia (fahrenheit)

		celsius = (fahrenheit-32) * 5/9;
		celsius = Matematica.arredondar (celsius,2);

		escreva ("A temperatura em celsius é de " + celsius + " Cº");
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 154; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */