Algoritmo "GovernancaPousada"
Var
   statusQuartos: vetor [1..5] de inteiro
   statusAnterior: vetor [1..5] de inteiro
   i, opcao, numQuarto, opcaoManut: inteiro
   frig, arcond, tel, cama, enx, toa, ban, lixo, cor: caractere
   resp, final, pausa_fake: caractere

Procedimento InicializarQuarto()
Inicio
Para i de 1 ate 5 faca
      statusQuartos[i] <- 1
      statusAnterior[i] <- 0
   FimPara
   
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
      Escreval("DIGITE A TECLA ENTER PARA INICIAR O MENU ")
      Escreval(" ")
      Leia(pausa_fake)
      Escreval("=========================================")
      Escreval(" ")
      Escreval("1. Check-out (Sujar Quarto)")
      Escreval("2. Iniciar Limpeza do quarto")
      Escreval("3. Finalizar (Checklist)")
      Escreval("4. Quarto Ocupado ")
      Escreval("5. Arrumação Pendente ")
      Escreval("6. Revisão Geral ")
      Escreval("7. Bloquear para Manutenção ")
      Escreval("8. Concluir Manutenção ")
      Escreval("0. Sair")
      Leia(opcao)

FimProcedimento

Procedimento ErroQuartoInvalido()
Inicio
      Escreval("==================================================")
      Escreval("  ERRO: QUARTO INVÁLIDO! - Use apenas de 1 a 5 -  ")
      Escreval("         DIGITE ENTER E TENTE NOVAMENTE     ")
      Escreval("==================================================")
      Leia(pausa_fake)
      
FimProcedimento

Procedimento SolicitarNumeroQuarto()
Inicio
Se (opcao >= 1) e (opcao <= 8) Entao
      Escreval("Informe o número do quarto: ")
      Leia(numQuarto)
         Se (numQuarto < 1) ou (numQuarto > 5) Entao
            ErroQuartoInvalido()
      opcao <- -1
         FimSe
   FimSe

FimProcedimento

Procedimento CabecalhoCaso()
Inicio
Para i de 1 ate 5 faca
      Escreva("Quarto ", i, ": ")
        Escolha statusQuartos[i]
            Caso 1
               Escreval("DISPONÍVEL ")
            Caso 2
               Escreval("SUJO ")
            Caso 3
               Escreval("EM LIMPEZA ")
            Caso 4
               Escreval("OCUPADO ")
            Caso 5
               Escreval("ARRUMAÇÃO PENDENTE ")
            Caso 6
               Escreval("REVISÃO DE LONGA DATA ")
            Caso 7
               Escreval("EM MANUTENÇÃO ")
            Caso 8
               Escreval("MANUTENÇÃO URGENTE ")
            Caso 9
               Escreval("REVISÃO PÓS MANUTENÇÃO ")
        FimEscolha
    FimPara

FimProcedimento

Procedimento RealizarCheckOut()
Inicio
          statusQuartos[numQuarto] <- 2
          Escreval("============ A T E N Ç Ã O ==============")
          Escreval("    O quarto ", numQuarto, " foi definido como SUJO!    ")
          Escreval("          AGUARDANDO LIMPEZA         ")
          Escreval("==========================================")
          Leia(pausa_fake)
          
FimProcedimento

Procedimento RealizarLimpeza()
Inicio
          statusAnterior[numQuarto] <- statusQuartos[numQuarto]
          statusQuartos[numQuarto] <- 3
          Escreval("============ A T E N Ç Ã O ==============")
          Escreval(" A limpeza do quarto ", numQuarto, " foi INICIADA ")
          Escreval("  AGUARDANDO LIBERAÇÃO DA CAMAREIRA   ")
          Escreval("==========================================")
          Leia(pausa_fake)

FimProcedimento

Procedimento CheckListRapido()
Inicio
      LimpaTela
      Escreval("==========================================")
      Escreval("          INSPEÇÃO DE GOVERNANÇA         ")
      Escreval("     - ARRUMAÇÃO DE QUARTO OCUPADO -      ")
      Escreval("==========================================")
      Escreval(" ")
      Repita
         Escreva("  [ ] Arrumação da CAMA OK? (S/N)........: ")
         Leia(cama)
      Ate (cama = "S") ou (cama = "s") ou (cama = "N") ou (cama = "n")
      Repita
         Escreva("  [ ] Troca de ENXOVAL: OK? (S/N)........: ")
         Leia(enx)
      Ate (enx = "S") ou (enx = "s") ou (enx = "N") ou (enx = "n")
      Repita
         Escreva("  [ ] Troca de TOALHAS: OK? (S/N)........: ")
         Leia(toa)
      Ate (toa = "S") ou (toa = "s") ou (toa = "N") ou (toa = "n")
      Repita
         Escreva("  [ ] Limpeza do BANHEIRO: OK? (S/N).....: ")
         Leia(ban)
      Ate (ban = "S") ou (ban = "s") ou (ban = "N") ou (ban = "n")
      Repita
         Escreva("  [ ] Retirada do LIXO: OK? (S/N)........: ")
         Leia(lixo)
      Ate (lixo = "S") ou (lixo = "s") ou (lixo = "N") ou (lixo = "n")
      Repita
         Escreva("  [ ] Teste do FRIGOBAR: OK? (S/N).......: ")
         Leia(frig)
      Ate (frig = "S") ou (frig = "s") ou (frig = "N") ou (frig = "n")
      Repita
         Escreva("  [ ] Teste do AR CONDICIONADO: OK (S/N).: ")
         Leia(arcond)
      Ate (arcond = "S") ou (arcond = "s") ou (arcond = "N") ou (arcond = "n")
      Repita
         Escreva("  [ ] Teste da TELEVISÃO: OK (S/N).......: ")
         Leia(tel)
      Ate (tel = "S") ou (tel = "s") ou (tel = "N") ou (tel = "n")
      Escreval(" ")
      Escreval("===========================================")
      Escreval("         CHECKLIST CONCLUÍDO!              ")
      Escreval("===========================================")
      Escreval(" ")
      
FimProcedimento

Procedimento CheckListGeral()
Inicio
      LimpaTela
      Escreval("==========================================")
      Escreval("          INSPEÇÃO DE GOVERNANÇA         ")
      Escreval("        - REVISÃO GERAL DETALHADA -      ")
      Escreval("==========================================")
      Escreval(" ")
      Repita
         Escreva(" [ ] JANELAS/CORTINAS (S/N)...........:  ")
         Leia(cor)
      Ate (cor = "S") ou (cor = "s") ou (cor = "N") ou (cor = "n")
      Repita
         Escreva(" [ ] TESTE AR CONDICIONADO (S/N) .....:  ")
         Leia(arcond)
      Ate (arcond = "S") ou (arcond = "s") ou (arcond = "N") ou (arcond = "n")
      Repita
         Escreva(" [ ] HIGIENIZAÇÃO COLCHÃO (S/N) ......:  ")
         Leia(cama)
      Ate (cama = "S") ou (cama = "s") ou (cama = "N") ou (cama = "n")
      Repita
         Escreva(" [ ] TESTE LÂMPADAS/TOMADAS (S/N) ....:  ")
         Leia(toa)
      Ate (toa = "S") ou (toa = "s") ou (toa = "N") ou (toa = "n")
      Repita
         Escreva(" [ ] TESTE TELEVISÃO (S/N) ...........:  ")
         Leia(tel)
      Ate (tel = "S") ou (tel = "s") ou (tel = "N") ou (tel = "n")
      Repita
         Escreva(" [ ] TESTE FRIGOBAR (S/N).............:  ")
         Leia(frig)
      Ate (frig = "S") ou (frig = "s") ou (frig = "N") ou (frig = "n")
      Escreval(" ")
      Escreval("===========================================")
      Escreval("         CHECKLIST CONCLUÍDO!              ")
      Escreval("===========================================")
      Escreval(" ")
      
FimProcedimento

Procedimento RealizarCheckList()
Inicio
      LimpaTela
      Escreval("==========================================")
      Escreval("          INSPEÇÃO DE GOVERNANÇA         ")
      Escreval("  - ARRUMAÇÃO DE QUARTO PÓS CHECK-OUT -  ")
      Escreval("==========================================")
      Escreval(" ")
      Repita
         Escreva("  [ ] Frigobar OK? (S/N)........: ")
         Leia(frig)
      Ate (frig = "S") ou (frig = "s") ou (frig = "N") ou (frig = "n")
      Repita
         Escreva("  [ ] Ar Condicionado OK? (S/N).: ")
         Leia(arcond)
      Ate (arcond = "S") ou (arcond = "s") ou (arcond = "N") ou (arcond = "n")
      Repita
         Escreva("  [ ] Televisão OK? (S/N).......: ")
         Leia(tel)
      Ate (tel = "S") ou (tel = "s") ou (tel = "N") ou (tel = "n")
      Repita
         Escreva("  [ ] Cama/Enxoval OK? (S/N)....: ")
         Leia(cama)
      Ate (cama = "S") ou (cama = "s") ou (cama = "N") ou (cama = "n")
      Repita
         Escreva("  [ ] Toalhas OK? (S/N).........: ")
         Leia(toa)
      Ate (toa = "S") ou (toa = "s") ou (toa = "N") ou (toa = "n")
      Escreval(" ")
      Escreval("===========================================")
      Escreval("         CHECKLIST CONCLUÍDO!              ")
      Escreval("===========================================")
      Escreval(" ")
FimProcedimento

Procedimento RealizarInspecao()
Inicio
      Escreval("Deseja iniciar a INSPEÇÃO do quarto ", numQuarto, "? (S/N) ")
      Leia(resp)
      Se (resp = "s") ou (resp = "S") Entao

         Se statusQuartos[numQuarto] = 9 Entao
              CheckListGeral()
              Se (frig = "N") ou (frig = "n") ou (arcond = "N") ou (arcond = "n") ou (tel = "N") ou (tel = "n") Entao
                 statusQuartos[numQuarto] <- 7
                 Escreval("============ A T E N Ç Ã O ==============")
                 Escreval("DEFEITO TÉCNICO DETECTADO APÓS MANUTENÇÃO ")
                 Escreval("  QUARTO RETORNA PARA MANUTENÇÃO TÉCNICA  ")
                 Escreval(" ")
                 Leia(pausa_fake)
              FimSe
         SeNao
              Escolha statusAnterior[numQuarto]
                 Caso 2
                      RealizarCheckList()
                    Se (frig = "N") ou (frig = "n") ou (arcond = "N") ou (arcond = "n") ou (tel = "N") ou (tel = "n") Entao
                       statusQuartos[numQuarto] <- 7
                       Escreval("============ A T E N Ç Ã O ==============")
                       Escreval("DEFEITO TÉCNICO DETECTADO DURANTE CHECK OUT ")
                       Escreval("       QUARTO EM MANUTENÇÃO            ")
                       Leia(pausa_fake)
                    FimSe
                 Caso 5
                      CheckListRapido()
                    Se (frig = "N") ou (frig = "n") ou (arcond = "N") ou (arcond = "n") ou (tel = "N") ou (tel = "n") Entao
                       statusQuartos[numQuarto] <- 8
                       Escreval("============ A T E N Ç Ã O ==============")
                       Escreval("DEFEITO TÉCNICO DETECTADO DURANTE ARRUMAÇÃO ")
                       Escreval("     QUARTO EM MANUTENÇÃO - URGÊNCIA -      ")
                       Leia(pausa_fake)
                    FimSe
                 Caso 6
                      CheckListGeral()
                    Se (frig = "N") ou (frig = "n") ou (arcond = "N") ou (arcond = "n") ou (tel = "N") ou (tel = "n") Entao
                       statusQuartos[numQuarto] <- 7
                       Escreval("============ A T E N Ç Ã O ==============")
                       Escreval("DEFEITO TÉCNICO DETECTADO DURANTE INSPEÇÃO ")
                       Escreval("       QUARTO EM MANUTENÇÃO            ")
                       Escreval(" ")
                       Leia(pausa_fake)
                    FimSe
              FimEscolha
         FimSe

         Se (statusQuartos[numQuarto] <> 7) e (statusQuartos[numQuarto] <> 8) Entao
            Escreval("Finalizar limpeza e liberar o quarto ", numQuarto, "? (S/N)")
            Leia(final)
            Se (final = "S") ou (final = "s") Entao
                Se statusAnterior[numQuarto] = 5 Entao
                    statusQuartos[numQuarto] <- 4
                    Escreval("============ A T E N Ç Ã O ==============")
                    Escreval("Check-out NÃO detectado! Quarto segue OCUPADO ")
                SeNao
                    statusQuartos[numQuarto] <- 1
                    Escreval("O quarto ", numQuarto, " agora está DISPONÍVEL. ")
                FimSe
                Leia(pausa_fake)
            SeNao
                Escreval("AVISO: Limpeza não finalizada! Quarto permanece em limpeza ")
                Leia(pausa_fake)
            FimSe
         FimSe

      SeNao
            Escreval("Check-list não iniciado! ")
            Leia(pausa_fake)
      FimSe

FimProcedimento

Procedimento RealizarCheckIn()
Inicio
          statusQuartos[numQuarto] <- 4
          Escreval("============ A T E N Ç Ã O ==============")
          Escreval("O quarto ", numQuarto, " está OCUPADO. ")
          Escreval("==========================================")
          Leia(pausa_fake)
          
FimProcedimento

Procedimento ArrumacaoQuarto()
Inicio
          statusQuartos[numQuarto] <- 5
          Escreval("============ A T E N Ç Ã O ==============")
          Escreval("O quarto ", numQuarto, " está EM ARRUMAÇÃO. ")
          Escreval("  AGUARDANDO LIBERAÇÃO DA CAMAREIRA   ")
          Escreval("==========================================")
          Leia(pausa_fake)

FimProcedimento

Procedimento RealizarRevisao()
Inicio
          statusQuartos[numQuarto] <- 6
          Escreval("============ A T E N Ç Ã O ==============")
          Escreval("O quarto ", numQuarto, " precisa de REVISÃO DE LONGA DATA. ")
          Escreval("  AGUARDANDO INICIO DA LIMPEZA   ")
          Escreval("==========================================")
          Leia(pausa_fake)

FimProcedimento

Procedimento ManutencaoTec()
Inicio
          statusQuartos[numQuarto] <- 7
          Escreval("============ A T E N Ç Ã O ==============")
          Escreval(" Foi identificado um problema no quarto ", numQuarto, " ")
          Escreval(" QUARTO BLOQUEADO PARA MANUTENÇÃO TÉCNICA ")
          Escreval("=========================================")
          Leia(pausa_fake)
          
FimProcedimento

Procedimento ManutencaoGer()
Inicio
   Se (statusQuartos[numQuarto] = 7) ou (statusQuartos[numQuarto] = 8) Entao
          Escreval("=== CONCLUSÃO DE MANUTENÇÃO DO QUARTO " , numQuarto, " ===")
          Escreval(" 1. Manutenção em quarto COM HÓSPEDE ")
          Escreval(" 2. Manutenção em quarto VAZIO ")
          Escreval(" 3. Manutenção concluída ")
          Escreval(" ")
          Escreva("INDIQUE A OPÇÃO ADEQUADA: ")
          Leia(opcaoManut)

       Escolha opcaoManut
          Caso 1
               statusQuartos[numQuarto] <- 4
               Escreval("============ S U C E S S O ==============")
               Escreval("          MANUTENÇÃO FINALIZADA          ")
               Leia(pausa_fake)
          Caso 2
               statusQuartos[numQuarto] <- 1
               Escreval("============ S U C E S S O ==============")
               Escreval("          MANUTENÇÃO FINALIZADA          ")
               Leia(pausa_fake)
          Caso 3
               statusAnterior[numQuarto] <- statusQuartos[numQuarto]
               statusQuartos[numQuarto] <- 9
               Escreval("============ S U C E S S O ==============")
               Escreval("          MANUTENÇÃO FINALIZADA          ")
               Escreval("=========================================")
               Escreval("============ A T E N Ç Ã O ==============")
               Escreval("    AGUARDANDO INSPEÇÃO DA GOVERNANÇA ")
               Leia(pausa_fake)
       FimEscolha
   SeNao
              Escreval("ERRO: VERIFIQUE STATUS DO QUARTO! ")
   FimSe

FimProcedimento

Procedimento ValidarTravaSeguranca()
Inicio
   Se (opcao = 1) Entao
      Se (statusQuartos[numQuarto] <> 4) Entao
          Escreval("============ A T E N Ç Ã O ==============")
          Escreval("ERRO: Este quarto não possui hóspede ")
          Escreval("     CHECK-OUT NÃO PERMITIDO       ")
          Escreval("=========================================")
          Leia(pausa_fake)
          opcao <- -1
      FimSe
   FimSe

   Se (opcao = 2) Entao
       Se (statusQuartos[numQuarto] <> 2) Entao
         Se (statusQuartos[numQuarto] <> 5) Entao
           Se (statusQuartos[numQuarto] <> 6) Entao
             Se (statusQuartos[numQuarto] <> 9) Entao
       Escreval("============ A T E N Ç Ã O ==============")
       Escreval("ERRO: A limpeza não pode ser iniciada agora! ")
           Se (statusQuartos[numQuarto] = 4) Entao
              Escreval("MOTIVO: O quarto está OCUPADO! ")
              Escreval("Solicite primeiro a ARRUMAÇÃO PENDENTE (OPCAO 5) ")
           SeNao
              Escreval("MOTIVO: O quarto esta LIMPO ou DISPONÍVEL ")
           FimSe
      Escreval("==========================================")
      Leia(pausa_fake)
      opcao <- -1
             FimSe
           FimSe
         FimSe
       FimSe
   FimSe

   Se (opcao = 3) Entao
      Se (statusQuartos[numQuarto] <> 3) Entao
        Se(statusQuartos[numQuarto] <> 6) Entao
          Se (statusQuartos[numQuarto] <> 9) Entao
      Escreval("============ A T E N Ç Ã O ==============")
      Escreval("ERRO: Este quarto não está apto para finalização! ")
      Escreval("     VERIFIQUE ESTADO ATUAL DO QUARTO       ")
      Escreval("=========================================")
      Leia(pausa_fake)
      opcao <- -1
          FimSe
        FimSe
      FimSe
   FimSe
   
   Se (opcao = 5) Entao
     Se (statusQuartos[numQuarto] = 1) Entao
     Escreval("=================== A T E N Ç Ã O ====================")
     Escreval("ERRO: Este quarto encontra-se DISPONÍVEL! ")
     Escreval("Para revisão geral digte a  opção 6 no menu principal ")
     Escreval("======================================================")
     Leia(pausa_fake)
     opcao <- -1
     FimSe
   FimSe
   
Se (opcao = 4) Entao
      Se (statusQuartos[numQuarto] <> 1) Entao
          Escreval("============ A T E N Ç Ã O ==============")
          Escreval("ERRO: Check-in não permitido! ")
          Se (statusQuartos[numQuarto] = 4) Entao
             Escreval("MOTIVO: O quarto já está OCUPADO! ")
          SeNao
             Escreval("MOTIVO: O quarto não está DISPONÍVEL! ")
          FimSe
          Escreval("=========================================")
          Leia(pausa_fake)
          opcao <- -1
      FimSe
   FimSe

   Se (opcao = 6) Entao
      Se (statusQuartos[numQuarto] <> 1) Entao
          Escreval("============ A T E N Ç Ã O ==============")
          Escreval("ERRO: Revisão Geral não permitida! ")
          Escreval("MOTIVO: O quarto não está DISPONÍVEL! ")
          Escreval("=========================================")
          Leia(pausa_fake)
          opcao <- -1
      FimSe
   FimSe

   Se (opcao = 7) Entao
      Se (statusQuartos[numQuarto] = 7) ou (statusQuartos[numQuarto] = 8) Entao
          Escreval("============ A T E N Ç Ã O ==============")
          Escreval("ERRO: Quarto já está em MANUTENÇÃO! ")
          Escreval("=========================================")
          Leia(pausa_fake)
          opcao <- -1
      FimSe
   FimSe

   Se (opcao = 8) Entao
      Se (statusQuartos[numQuarto] <> 7) e (statusQuartos[numQuarto] <> 8) Entao
          Escreval("============ A T E N Ç Ã O ==============")
          Escreval("ERRO: Este quarto não está em manutenção! ")
          Escreval("MOTIVO: Verifique o status atual do quarto ")
          Escreval("=========================================")
          Leia(pausa_fake)
          opcao <- -1
      FimSe
   FimSe

FimProcedimento

Inicio

     InicializarQuarto()

  Repita
   
     CabecalhoInicio()
      
     CabecalhoCaso()

     CabecalhoOpcao()
      
     SolicitarNumeroQuarto()
   
     ValidarTravaSeguranca()
   
  Escolha opcao
   
     Caso 1
          RealizarCheckOut()
     Caso 2
          RealizarLimpeza()
     Caso 3
          RealizarInspecao()
     Caso 4
          RealizarCheckIn()
     Caso 5
          ArrumacaoQuarto()
     Caso 6
          RealizarRevisao()
     Caso 7
          ManutencaoTec()
     Caso 8
          ManutencaoGer()
          
   FimEscolha
      LimpaTela
   Ate opcao = 0
Fimalgoritmo