programa

//Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
//Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 

{
	
	funcao inicio()
	{
		cadeia aluno
		real nota1,nota2,nota3, media, total
		escreva ("***Mpedia de notas - Generation Brasil*** \n")

		escreva ("Qual o nome do aluno: ")
		leia (aluno)
		
			escreva ("Escreva a nota 1 do(a) " + aluno + ": ")
		leia (nota1)
				escreva ("Escreva a nota 2 do(a) " + aluno + ": ")
		leia (nota2)
				escreva ("Escreva a nota 3 do(a) " + aluno + ": ")
		leia (nota3)

		media = (nota1 * 2) + (nota2 * 3) + (nota3 * 5)
		total = media / 10

		escreva ("A média das notas do aluno foi de: " + total)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 554; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */