Algoritmo "GovernancaPousada"
Var
   statusQuartos: vetor [1..5] de inteiro
   i, opcao, numQuarto: inteiro
   frig, arcond, tel, cama, enx, toa: caractere
   resp, final, pausa_fake: caractere

Procedimento ErroQuartoInvalido()
Inicio
      Escreval("==================================================")
      Escreval("  ERRO: QUARTO INVÁLIDO! - Use apenas de 1 a 5 -  ")
      Escreval("         DIGITE ENTER E TENTE NOVAMENTE     ")
      Escreval("==================================================")
      Leia(pausa_fake)
FimProcedimento

Procedimento RealizarCheckList()
Inicio
      LimpaTela
      Escreval("==========================================")
      Escreval("          INSPEÇÃO DE GOVERNANÇA         ")
      Escreval("==========================================")
      Escreval(" ")
      Escreva("  [ ] Frigobar OK? (S/N)........: ")
      Leia(frig)
      Escreva("  [ ] Ar Condicionado OK? (S/N).: ")
      Leia(arcond)
      Escreva("  [ ] Televisão OK? (S/N).......: ")
      Leia(tel)
      Escreva("  [ ] Cama/Enxoval OK? (S/N)....: ")
      Leia(cama)
      Escreva("  [ ] Toalhas OK? (S/N).........: ")
      Leia(toa)
      
      Escreval(" ")
      Escreval("===========================================")
      Escreval("         CHECKLIST CONCLUÍDO!              ")
      Escreval("===========================================")
      Escreval(" ")
FimProcedimento

Procedimento CabecalhoInicio()
Inicio
      Escreval("=========================================")
      Escreval("         SISTEMA DE GOVERNANÇA           ")
      Escreval("=========================================")
      Escreval(" ")

FimProcedimento

Procedimento CabecalhoOpcao()
Inicio
      Escreval(" ")
      Escreval("=========================================")
      Escreval(" ")
      Escreval("1. Check-out (Sujar Quarto)")
      Escreval("2. Iniciar Limpeza do quarto")
      Escreval("3. Finalizar (Checklist)")
      Escreval("0. Sair")
      Leia(opcao)

FimProcedimento

Procedimento CabecalhoCaso()
Inicio
Para i de 1 ate 5 faca
      Escreva("Quarto ", i, ": ")
        Escolha statusQuartos[i]
            Caso 1
               Escreval("DISPONÍVEL ")
            Caso 2
               Escreval("SUJO (Aguardando) ")
            Caso 3
               Escreval("EM LIMPEZA ")
        FimEscolha
    FimPara

FimProcedimento

Inicio
   Para i de 1 ate 5 faca
      statusQuartos[i] <- 1
   FimPara

   Repita
      CabecalhoInicio()
      
      CabecalhoCaso()

      CabecalhoOpcao()
      
   Se (opcao >= 1) e (opcao <= 3) Entao
      Escreval("Informe o número do quarto: ")
      Leia(numQuarto)
         Se (numQuarto < 1) ou (numQuarto > 5) Entao
            ErroQuartoInvalido()
      opcao <- -1
         FimSe
   FimSe
   
   Escolha opcao
     Caso 1
          statusQuartos[numQuarto] <- 2
          Escreval("============ A T E N Ç Ã O ==============")
          Escreval("    O quarto ", numQuarto, " foi definido como SUJO!    ")
          Escreval("          AGUARDANDO LIMPEZA         ")
          Escreval("==========================================")
          Leia(pausa_fake)
     Caso 2
          statusQuartos[numQuarto] <- 3
          Escreval("============ A T E N Ç Ã O ==============")
          Escreval(" A limpeza do quarto ", numQuarto, " foi INICIADA ")
          Escreval("  AGUARDANDO LIBERAÇÃO DA CAMAREIRA   ")
          Escreval("==========================================")
          Leia(pausa_fake)
     Caso 3
          Escreval("Deseja iniciar o check-list do quarto ", numQuarto, "? (S/N) ")
          Leia(resp)
             Se (resp = "s") ou (resp = "S") Entao
                 RealizarCheckList()
                 
          Escreval("Finalizar limpeza e liberar o quarto ", numQuarto, "? (S/N)")
          Leia(final)
                 Se (final = "S") ou (final = "s") Entao
                     statusQuartos[numQuarto] <- 1
                     Escreval("O quarto ", numQuarto, " agora está DISPONÍVEL. ")
                     Leia(pausa_fake)
                 SeNao
                     Escreval("AVISO: Limpeza não finalizada! Quarto permanece em limpeza ")
                     Leia(pausa_fake)
                 FimSe
              SeNao
                 Escreval("Check-list não iniciado! ")
                 Leia(pausa_fake)
             FimSe
              
      FimEscolha
      LimpaTela
   Ate opcao = 0
Fimalgoritmo