programa

		// O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos 
		//(aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
		//escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
{
	
	funcao inicio(){

		real valorCarro, totalDistribuicao, totalImposto,carroNovo
		real custoDistribuidor = 0.28
		real custoImposto = 0.45

		escreva ("Qual é o valor do carro: \n")
		leia(valorCarro)

		totalDistribuicao = valorCarro * custoDistribuidor
		totalImposto = valorCarro * custoImposto

		carroNovo = valorCarro + totalDistribuicao + totalImposto

		escreva ("O valor total do carro com os imposto é de R$ " + carroNovo + "00,00")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 550; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */