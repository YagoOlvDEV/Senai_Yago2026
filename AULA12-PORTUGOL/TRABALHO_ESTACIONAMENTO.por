//TRABALHO SENAI PARK - HENRIQUE CHRIST, YAGO DE OLIVEIRA, PABLO BRANDÃO
programa
{

// IMPORTAÇÕES E MATRIZ GERAL

inclua biblioteca Util	
inteiro vagas[30]

	//FUNÇÃO START DO SISTEMA
	funcao inicio(){
		
	escreva("Sistema Senai Park\n","**VAGAS COM O NÚMERO **50** CORRESPONDEM À OCUPADAS\n")
	escreva("Vagas disponiveis:\n")
	criar_vagas()
	entrada_vagas()
	
	}
	
	//FUNÇÃO QUE CRIA AS 30 VAGAS E ATRIBUI O VALOR CORREPONDENTE A SUA POSIÇÃO
	funcao criar_vagas(){
		
		inteiro i=-1
			para (inteiro v=0;v<30;v++){
				i=i++
				vagas[v]=i
				escreva(vagas[v],"\t")
			}
	escreva("\n")
	}

	//FUNÇÃO PARA LOOPING DE SISTEMA, SO ENCERRA DIGITANDO ALGUM CARCTER != DE "s"
	funcao entrada_vagas(){
		
		inteiro vaga
		cadeia decida
		
		escreva("Digite a vaga escolhida:\n")
		leia(vaga)
			
			se(vagas[vaga]==50){
				escreva("Vaga já ocupada!","\n")
				imprimir_vagas()
				tempo()
				entrada_vagas()

			}
			
				se(vaga>=0 ou vaga<=29){
				vagas[vaga] = 50
				tempo()
				escreva("Vaga ",vaga," reservada!","\n")
				imprimir_vagas()
				tempo()
				escreva("Reservar outra vaga? (s/n) \n")
				leia(decida)
				
					se(decida=="s"){
					entrada_vagas()
					} 
					
						senao{
							escreva("Sistema Finalizado","\n")
					 
							}
		
				}
							senao{
								escreva("Vaga ocupada,escolha outra;\n")
								leia(vaga)
								vagas[vaga]=50
								imprimir_vagas()
								tempo()
								escreva("Reservar outra vaga? (s/n) \n")
								leia(decida)
									
									se(decida=="s"){
										entrada_vagas()
									}
					 				
					 				senao{
										escreva("Sistema Finalizado","\n")
					 
										}		
				
								}
			
	}

	//FUNÇÃO PARA IMPRIMIR VAGAS OCUPADAS
	funcao imprimir_vagas(){
		para(inteiro vv=0;vv<30;vv++){
			escreva(vagas[vv],"\t")
		}
	}
	
	//FUNÇÃO PARA TIMER E LIMPAR CÓDIGO
	funcao tempo(){
		Util.aguarde(2800)
		limpa()
		}
	
}
//TRABALHO SENAI PARK - HENRIQUE CHRIST, YAGO DE OLIVEIRA, PABLO BRANDÃO
programa
{

// IMPORTAÇÕES E MATRIZ GERAL

inclua biblioteca Util	
inteiro vagas[30]

	//FUNÇÃO START DO SISTEMA
	funcao inicio(){
		
	escreva("Sistema Senai Park\n","**VAGAS COM O NÚMERO **50** CORRESPONDEM À OCUPADAS\n")
	escreva("Vagas disponiveis:\n")
	criar_vagas()
	entrada_vagas()
	
	}
	
	//FUNÇÃO QUE CRIA AS 30 VAGAS E ATRIBUI O VALOR CORREPONDENTE A SUA POSIÇÃO
	funcao criar_vagas(){
		
		inteiro i=-1
			para (inteiro v=0;v<30;v++){
				i=i++
				vagas[v]=i
				escreva(vagas[v],"\t")
			}
	escreva("\n")
	}

	//FUNÇÃO PARA LOOPING DE SISTEMA, SO ENCERRA DIGITANDO ALGUM CARCTER != DE "s"
	funcao entrada_vagas(){
		
		inteiro vaga
		cadeia decida
		
		escreva("Digite a vaga escolhida:\n")
		leia(vaga)
			
			se(vagas[vaga]==50){
				escreva("Vaga já ocupada!","\n")
				imprimir_vagas()
				tempo()
				entrada_vagas()

			}
			
				se(vaga>=0 ou vaga<=29){
				vagas[vaga] = 50
				tempo()
				escreva("Vaga ",vaga," reservada!","\n")
				imprimir_vagas()
				tempo()
				escreva("Reservar outra vaga? (s/n) \n")
				leia(decida)
				
					se(decida=="s"){
					entrada_vagas()
					} 
					
						senao{
							escreva("Sistema Finalizado","\n")
					 
							}
		
				}
							senao{
								escreva("Vaga ocupada,escolha outra;\n")
								leia(vaga)
								vagas[vaga]=50
								imprimir_vagas()
								tempo()
								escreva("Reservar outra vaga? (s/n) \n")
								leia(decida)
									
									se(decida=="s"){
										entrada_vagas()
									}
					 				
					 				senao{
										escreva("Sistema Finalizado","\n")
					 
										}		
				
								}
			
	}

	//FUNÇÃO PARA IMPRIMIR VAGAS OCUPADAS
	funcao imprimir_vagas(){
		para(inteiro vv=0;vv<30;vv++){
			escreva(vagas[vv],"\t")
		}
	}
	
	//FUNÇÃO PARA TIMER E LIMPAR CÓDIGO
	funcao tempo(){
		Util.aguarde(2800)
		limpa()
		}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3788; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */