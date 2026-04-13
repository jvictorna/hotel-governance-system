Algoritmo "GovernancaPousada"
Var
   statusQuartos: vetor [1..5] de inteiro
   i, opcao, numQuarto: inteiro
   resp, frig, tel, cama, enx, toa, final: caractere
   pausa_fake: caractere

Procedimento ErroQuartoInvalido()
Inicio
      Escreval("-------------------------------------------")
      Escreval("ERRO: Quarto inválido! Use apenas de 1 a 5 ")
      Escreval("-------------------------------------------")
      Leia(pausa_fake)
FimProcedimento

Procedimento RealizarCheckList()
Inicio
         Escreval("( ) Frigobar OK? (S/N) ")
         Leia(Frig)
         Escreval("( ) Televisão OK? (S/N) ")
         Leia(Tel)
         Escreval("( ) Cama OK? (S/N) ")
         Leia(Cama)
         Escreval("( ) Enxoval OK? (S/N) ")
         Leia(Enx)
         Escreval("( ) Toalhas OK? (S/N) ")
         Leia(Toa)
FimProcedimento

Inicio
   Para i de 1 ate 5 faca
      statusQuartos[i] <- 1
   FimPara

   Repita
      Escreval("--- SISTEMA DE GOVERNANÇA ---")
      Para i de 1 ate 5 faca
      Escreva("Quarto ", i, ": ")

        Se statusQuartos[i] = 1 Entao
                    Escreval("DISPONÍVEL")
        SeNao
             Se statusQuartos[i] = 2 Entao
                    Escreval("SUJO (Aguardando)")
             SeNao
                    Escreval("EM LIMPEZA")
             FimSe
        FimSe
      FimPara

      Escreval("-----------------------------")
      Escreval("1. Check-out (Sujar Quarto)")
      Escreval("2. Iniciar Limpeza")
      Escreval("3. Finalizar (Checklist)")
      Escreval("0. Sair")
      Leia(opcao)

      Escolha opcao
         Caso 1

            Escreval("Digite o número do quarto para CHECK-OUT: ")
            Leia(numQuarto)
            Se (numQuarto >= 1) e (numQuarto <= 5) entao
                statusQuartos[numQuarto] <- 2 // Muda para Sujo
                Escreval("Quarto ", numQuarto, " agora está aguardando limpeza ")
                Leia(pausa_fake)
            SeNao
               ErroQuartoInvalido()
            FimSe

         Caso 2

            Escreval("Qual quarto vai limpar agora? ")
            Leia(numQuarto)
            Se (numQuarto >= 1) e (numQuarto <= 5) entao
                statusQuartos[numQuarto] <- 3 // Muda para Em Limpeza
                Escreval("Quarto ", numQuarto, " está sendo limpo ")
                Leia(pausa_fake)
            SeNao
               ErroQuartoInvalido()
            FimSe

         Caso 3

            Escreval("Qual quarto deseja inspecionar? ")
            Leia(numQuarto)
            Se (numQuarto >= 1) e (numQuarto <= 5) entao //C1: Validação SEG
               Escreval("Iniciar Check-list do quarto ", numQuarto, "? (S/N) ")
               Leia(resp)
                   Se (resp = "s") ou (resp = "S") Entao
                       RealizarCheckList()

             Escreval("Finalizar limpeza do quarto ", numQuarto, "? (S/N)")
                // Lógica de retorno para Disponível (1)
             Leia(Final)
                   Se (Final = "S") ou (Final = "s") Entao
                      statusQuartos[numQuarto] <- 1  // Volta para disponível
                      Escreval("Quarto ", numQuarto, " finalizado com sucesso! ")
                      Leia(pausa_fake)
                   SeNao
                      Escreval("Limpeza interrompida: o quarto continua SUJO!")
                      Leia(pausa_fake)
                  FimSe

                    SeNao
                        Escreval("Check-list não iniciado! ")
                        Leia(pausa_fake)
                    FimSe
            SeNao
                ErroQuartoInvalido()
            FimSe

      FimEscolha
      LimpaTela
   Ate opcao = 0
Fimalgoritmo