
package hotelgovernancesystempoo;

import java.util.Scanner;

/**
 * Sistema de Governança Hoteleira
 * Controle de status e limpeza de quartos
 * Desenvolvido como projeto prático do curso de ADS
 * 
 * @author João Adorno
 * @version 3.0
 */

public class HotelGovernanceSystemPOO {

    static int opcao, numQuarto, opcaoManut, posicao;

    static String frigobar, arCondicionado, televisao;
    static String cama, enxoval, toalha, banheiro, lixo, lampada, cortina;
    static String resposta;

    static Scanner teclado = new Scanner(System.in);
       
    static Quarto[] quartos = new Quarto[38]; 
    
    static void inicializarQuartos() {
    
    quartos[0] = new Quarto(2, 0, "Standard Sem Varanda", "Triplo", "Pequeno"); 
    quartos[1] = new Quarto(3, 0, "Standard Sem Varanda", "Triplo" , "Pequeno");
    quartos[2] = new Quarto(4, 0, "Standard Sem Varanda", "Triplo", "Pequeno");
    quartos[3] = new Quarto(5, 0, "Standard Sem Varanda", "Casal", "Pequeno");
    quartos[4] = new Quarto(101, 1, "Varanda Lateral", "Casal", "Médio");
    quartos[5] = new Quarto(102, 1, "Varanda Lateral", "Casal", "Médio");
    quartos[6] = new Quarto(103, 1, "Varanda Lateral", "Casal", "Médio");
    quartos[7] = new Quarto(104, 1, "Varanda Lateral", "Casal", "Médio");
    quartos[8] = new Quarto(105, 1, "Varanda Lateral", "Casal", "Médio");
    quartos[9] = new Quarto(106, 1, "Varanda Lateral", "Casal", "Médio");
    quartos[10] = new Quarto(107, 1, "Varanda Lateral", "Casal", "Médio");
    quartos[11] = new Quarto(108, 1, "Varanda Frente Mar", "Casal", "Médio");
    quartos[12] = new Quarto(109, 1, "Varanda Frente Mar", "Casal", "Médio");
    quartos[13] = new Quarto(110, 1, "Standard Sem Varanda", "Quádruplo", "Extra Grande");
    quartos[14] = new Quarto(111, 1, "Standard Sem Varanda", "Quádruplo", "Extra Grande");
    quartos[15] = new Quarto(112, 1, "Standard Sem Varanda", "Quíntuplo", "Extra Grande");
    quartos[16] = new Quarto(201, 2, "Varanda Lateral", "Casal", "Médio");
    quartos[17] = new Quarto(202, 2, "Varanda Lateral", "Casal", "Médio");
    quartos[18] = new Quarto(203, 2, "Varanda Lateral", "Triplo", "Médio");
    quartos[19] = new Quarto(204, 2, "Varanda Lateral", "Triplo", "Médio");
    quartos[20] = new Quarto(205, 2, "Varanda Lateral", "Triplo", "Médio");
    quartos[21] = new Quarto(206, 2, "Varanda Lateral", "Triplo", "Médio");
    quartos[22] = new Quarto(207, 2, "Varanda Lateral", "Triplo", "Médio");
    quartos[23] = new Quarto(208, 2, "Luxo Varanda Frente Mar", "Casal", "Grande");
    quartos[24] = new Quarto(209, 2, "Standard Sem Varanda", "Quádruplo", "Extra Grande");
    quartos[25] = new Quarto(210, 2, "Standard Sem Varanda", "Quádruplo", "Extra Grande");
    quartos[26] = new Quarto(211, 2, "Standard Sem Varanda", "Quíntuplo", "Extra Grande");
    quartos[27] = new Quarto(301, 3, "Standard Sem Varanda", "Quíntuplo", "Extra Grande");
    quartos[28] = new Quarto(302, 3, "Standard Sem Varanda", "Triplo", "Pequeno");
    quartos[29] = new Quarto(303, 3, "Standard Sem Varanda", "Casal", "Pequeno");
    quartos[30] = new Quarto(304, 3, "Standard Sem Varanda", "Casal", "Pequeno");
    quartos[31] = new Quarto(305, 3, "Luxo Sem Varanda", "Casal", "Grande");
    quartos[32] = new Quarto(306, 3, "Standard Sem Varanda", "Casal", "Pequeno");
    quartos[33] = new Quarto(307, 3, "Varanda Frente Mar", "Triplo", "Médio");
    quartos[34] = new Quarto(308, 3, "Varanda Frente Mar", "Triplo", "Médio");
    quartos[35] = new Quarto(309, 3, "Standard Sem Varanda", "Quádruplo", "Extra Grande");
    quartos[36] = new Quarto(310, 3, "Standard Sem Varanda", "Quádruplo", "Extra Grande");
    quartos[37] = new Quarto(311, 3, "Standard Sem Varanda", "Quíntuplo", "Extra Grande");
    }


    
static void cabecalhoInicio(){    
        System.out.println("=========================================");
        System.out.println("          SISTEMA DE GOVERNANÇA          ");
        System.out.println("=========================================");  
        
} // Fechamento cabecalhoInicio();

static void exibirQuartos() {
    
       System.out.println("========================================="); 
       System.out.println("                T E R R E O              ");
       System.out.println("========================================="); 
       
   for (int i = 0; i < 4; i++) {
       
       System.out.println(
               "Quarto " 
               + quartos[i].getNumero()
               +": " 
               + quartos[i].getDescricaoStatus() );    
   }
   
       System.out.println("========================================="); 
       System.out.println("              1º A N D A R               ");
       System.out.println("========================================="); 
       
    for (int i = 4; i < 16; i++) {
        
        System.out.println(
                "Quarto "
                + quartos[i].getNumero() 
                + ": "
                + quartos[i].getDescricaoStatus() );
       
        }
    
       System.out.println("========================================="); 
       System.out.println("              2º A N D A R               ");
       System.out.println("========================================="); 
       
    for (int i = 16; i < 27; i++) {
        
        System.out.println(
                "Quarto " 
                + quartos[i].getNumero() 
                + ": "
                + quartos[i].getDescricaoStatus() );
    }

       System.out.println("========================================="); 
       System.out.println("              3º A N D A R               ");
       System.out.println("========================================="); 
       
    for (int i = 27; i <= 37; i++) {
        
        System.out.println(
                "Quarto " 
                + quartos[i].getNumero() 
                + ": "
                + quartos[i].getDescricaoStatus() );   
    }      
    
} // Fechamento exibirQuartos();

static void exibirMenu() {
        System.out.println("=========================================");
        System.out.println("           SELECIONE UMA OPÇÃO           ");
        System.out.println("=========================================");
        System.out.println("1. Checkout - ACIONAR CAMAREIRA II ");
        System.out.println("2. Arrumação pendente - ACIONAR CAMAREIRA I ");
        System.out.println("3. Limpeza iniciada - AGUARDANDO CONCLUSÃO ");
        System.out.println("4. Limpeza finalizada - INICIAR CHECK-LIST ");
        System.out.println("5. Check-in realizado - QUARTO OCUPADO ");
        System.out.println("6. Revisão geral - ACIONAR CAMAREIRA III ");
        System.out.println("7. Manutenção - BLOQUEAR QUARTO ");
        System.out.println("8. Manutenção concluída - LIBERAR QUARTO ");
        System.out.println("0. Encerrar sessão ");
        System.out.println("");
        
} // Fechamento exibirMenu();

static void solicitarDados() {
    if (opcao >= 1 && opcao <= 8) {
        System.out.print("Digite o número do quarto: ");
        
        try {
            numQuarto = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("=========== A T E N Ç Ã O ================");
            System.out.println("ERRO: Digite apenas números!");
            System.out.println("==========================================");
            System.out.println(" --- Pressione ENTER para continuar --- ");
            teclado.next();
            teclado.nextLine();
            teclado.nextLine();
            opcao = -1;
            return; 
        }
        
        posicao = -1;
        
        for (int i = 0; i < 38; i++) {
            if (quartos[i].getNumero() == numQuarto) {
                posicao = i;
            break;
            }
        }
        if (posicao == -1) {
            System.out.println("=========== A T E N Ç Ã O ================");
            System.out.println("QUARTO INVÁLIDO — verifique o número e tente novamente");
            System.out.println("==========================================");
            System.out.println(" --- Pressione ENTER para continuar --- ");
            teclado.nextLine();
            teclado.nextLine();
            opcao = -1;
        }
    }
} // Fechamento solicitarDados();
    
static void validarTrava() {
    if (opcao == -1 || posicao == -1) return;
    
    if (opcao == 1) {
        if (quartos[posicao].getStatus() != 4) {
            System.out.println("=============== A T E N Ç Ã O ================="); 
            System.out.println("ERRO: Este quarto não possui hóspede ");
            System.out.println("      CHECK-OUT NÃO PERMITIDO        ");
            System.out.println("===============================================");
            System.out.println(" --- Pressione ENTER para continuar --- ");
            teclado.nextLine();
            teclado.nextLine();
            opcao = -1;
        }
    }
    
    if (opcao == 3) {
        if (quartos[posicao].getStatus() != 2) {
            if (quartos[posicao].getStatus() != 5) {
                if (quartos[posicao].getStatus() != 6) {
                    if (quartos[posicao].getStatus() != 9) {
            System.out.println("=========== A T E N Ç Ã O ================");
            System.out.println("ERRO: A limpeza não pode ser iniciada agora!");
                       if (quartos[posicao].getStatus() == 4) {
                              System.out.println("MOTIVO: O quarto está OCUPADO! ");
                              System.out.println("Solicite primeiro a ARRUMAÇÃO PENDENTE (OPÇÃO 5)");
                       } else { System.out.println("MOTIVO: O quarto esta LIMPO ou DISPONÍVEL"); 
                            }
            System.out.println("==========================================");
            System.out.println(" --- Pressione ENTER para continuar --- ");
            teclado.nextLine();
            teclado.nextLine();
            opcao = -1;
                    }
                }
            }
        }
    }

    if (opcao == 4) {
        if (quartos[posicao].getStatus() != 3) {
            if (quartos[posicao].getStatus() != 9) {
                System.out.println("=========== A T E N Ç Ã O ================");
                System.out.println("ERRO: Este quarto não esta apto para finalização! ");
                System.out.println("     VERIFIQUE ESTADO ATUAL DO QUARTO     ");
                System.out.println("==========================================");
                System.out.println(" --- Pressione ENTER para continuar --- ");
                teclado.nextLine();
                teclado.nextLine();
                opcao = -1;
            }
        }
    }
    
    if (opcao == 2) {
        if (quartos[posicao].getStatus() != 4) {
            System.out.println("=========== A T E N Ç Ã O ================");
            System.out.println("ERRO: Arrumação não permitida! ");
            System.out.println("MOTIVO: O quarto não está OCUPADO  ");
            System.out.println("==========================================");
            System.out.println(" --- Pressione ENTER para continuar --- ");
            teclado.nextLine();
            teclado.nextLine();
            opcao = -1;
        }
    }
    
    if (opcao == 5) {
        if (quartos[posicao].getStatus() != 1) {
            System.out.println("=========== A T E N Ç Ã O ================");
            System.out.println("ERRO: Check-in não permitido! ");
            if (quartos[posicao].getStatus() == 4) {
                System.out.println("MOTIVO: O quarto já encontra-se OCUPADO ");                
            } else { System.out.println("MOTIVO: O quarto NÃO está DISPONÍVEL  "); }
            System.out.println("===========================================");
            System.out.println(" --- Pressione ENTER para continuar --- ");
            teclado.nextLine();
            teclado.nextLine();
            opcao = -1;
        }
    }
    
    if (opcao == 6) {
        if (quartos[posicao].getStatus() != 1) {
            System.out.println("=========== A T E N Ç Ã O ================");
            System.out.println("ERRO: Revisão geral não permitida! ");
            System.out.println("MOTIVO: O quarto NÃO está DISPONÍVEL ");
            System.out.println("==========================================");
            System.out.println(" --- Pressione ENTER para continuar --- ");
            teclado.nextLine();
            teclado.nextLine();
            opcao = -1; 
        }
    }
    
    if (opcao == 7) {
        if (quartos[posicao].getStatus() == 7 || (quartos[posicao].getStatus() == 8)) {
            System.out.println("=========== A T E N Ç Ã O ================");
            System.out.println("ERRO: Quarto já encontra-se em MANUTENÇÃO! ");
            System.out.println("===========================================");
            System.out.println(" --- Pressione ENTER para continuar --- ");
            teclado.nextLine();
            teclado.nextLine();
            opcao = -1; 
        }
    }
    
    if (opcao == 8) {
        if (quartos[posicao].getStatus() != 7 && (quartos[posicao].getStatus() != 8)) {
            System.out.println("=========== A T E N Ç Ã O ================");
            System.out.println("ERRO: Este quarto NÃO está em manutenção! ");
            System.out.println("Verifique o status atual do quarto ");
            System.out.println("==========================================");
            System.out.println(" --- Pressione ENTER para continuar --- ");
            teclado.nextLine();
            teclado.nextLine();
            opcao = -1;
        }
    }
    
} // Fechamento do validarTrava(); 


static void realizarCheckout() {
    
    quartos[posicao].realizarCheckout();
    
    System.out.println("=========== A T E N Ç Ã O ================");
    System.out.println("    O quarto " + numQuarto + " foi definido como SUJO! ");
    System.out.println("        AGUARDANDO LIMPEZA           ");
    System.out.println("==========================================");
    System.out.println(" --- Pressione ENTER para continuar --- ");
    teclado.nextLine();
    teclado.nextLine();
    
} // Fechamento do realizarCheckout(); 

static void realizarLimpeza() {
    
    quartos[posicao].iniciarLimpeza();
    
    System.out.println("=========== A T E N Ç Ã O ================");
    System.out.println("A limpeza do quarto " + numQuarto + " foi INICIADA ");
    System.out.println("    AGUARDANDO LIBERAÇÃO DA CAMAREIRA     ");
    System.out.println("==========================================");
    System.out.println(" --- Pressione ENTER para continuar --- ");
    teclado.nextLine();
    teclado.nextLine();
    
} // Fechamento realizarLimpeza();

static void realizarCheckin() {
    
    quartos[posicao].realizarCheckin();
    
    System.out.println("=========== A T E N Ç Ã O ================");
    System.out.println("O quarto " + numQuarto + " está OCUPADO ");
    System.out.println("=========================================");
    System.out.println(" --- Pressione ENTER para continuar --- ");
    teclado.nextLine();
    teclado.nextLine();
    
} // Fechamento realizarCheckin(); 

static void arrumacaoQuarto() {
    
    quartos[posicao].solicitarArrumacao();
    
    System.out.println("=========== A T E N Ç Ã O ================");
    System.out.println("O quarto " + numQuarto + " está com ARRUMAÇÃO PENDENTE");
    System.out.println("    AGUARDANDO INICIO DA LIMPEZA     ");
    System.out.println("==========================================");
    System.out.println("--- Pressione ENTER para continuar ---");
    teclado.nextLine();
    teclado.nextLine();
} // Fechamento arrumacaoQuarto(); 

static void realizarRevisao() {
    
    quartos[posicao].solicitarRevisaoGeral();
    
    System.out.println("=========== A T E N Ç Ã O ================");
    System.out.println("O quarto " + numQuarto + " precisa de REVISÃO DE LONGA DATA ");
    System.out.println("     AGUARDANDO INICIO DA LIMPEZA         ");
    System.out.println("==========================================");
    System.out.println(" --- Pressione ENTER para continuar --- ");
    teclado.nextLine();
    teclado.nextLine();
    
} // Fechamento realizarRevisao();

static void manutencaoTec() {
    
    quartos[posicao].bloquearManutencao();
    
    System.out.println("=========== A T E N Ç Ã O ================");
    System.out.println("Foi identificado um problema no quarto " + numQuarto );
    System.out.println("  QUARTO BLOQUEADO PARA MANUTENÇÃO TÉCNICA ");
    System.out.println("===========================================");
    System.out.println(" --- Pressione ENTER para continuar --- ");
    teclado.nextLine();
    teclado.nextLine();
    
    
} // Fechamento manutencaoTec();

static void manutencaoGer() {
    
    if (quartos[posicao].getStatus() == 7 || quartos[posicao].getStatus() == 8) {
        
        System.out.println(" === CONCLUSÃO DE MANUTENÇÃO DO QUARTO " + numQuarto + " === ");
        System.out.println("1. Manutenção em quarto COM HÓSPEDE ");
        System.out.println("2. Manutenção em quarto VAZIO ");
        System.out.println("3. Manutenção concluída ");
        System.out.println("");
        System.out.println("INDIQUE A OPÇÃO ADEQUADA: ");
        opcaoManut = teclado.nextInt();
        teclado.nextLine();
        
        switch (opcaoManut) { 
            
            case 1: 
                quartos[posicao].realizarCheckin();
                
                System.out.println("=========== S U C E S S O ================");
                System.out.println("       MANUTENÇÃO FINALIZADA              ");
                System.out.println("==========================================");
                System.out.println(" --- Pressione ENTER para continuar --- ");
                teclado.nextLine();
                
            break;
            
            case 2: 
                quartos[posicao].liberarQuarto();
                
                System.out.println("=========== S U C E S S O ================");
                System.out.println("       MANUTENÇÃO FINALIZADA              ");
                System.out.println("==========================================");
                System.out.println(" --- Pressione ENTER para continuar --- ");
                teclado.nextLine();
                
            break; 
            
            case 3: 
                quartos[posicao].solicitarRevisaoPosManutencao();
                
                System.out.println("=========== S U C E S S O ================");
                System.out.println("       MANUTENÇÃO FINALIZADA              ");
                System.out.println("==========================================");
                System.out.println("=========== A T E N Ç Ã O ================");
                System.out.println("    AGUARDANDO INSPEÇÃO DA GOVERNANÇA     ");
                System.out.println("==========================================");
                teclado.nextLine();
                
            break;
            
            default: System.out.println("ERRO: Verifique a opção digitada e tente novamente ");
                
        } // Fechamento switch              
    } // Fechamento if inicial    
} // Fechamento manutencaoGer();

static void checkListRapido() {
    
    System.out.println("==========================================");
    System.out.println("          INSPEÇÃO DE GOVERNANÇA          ");
    System.out.println("      - ARRUMAÇÃO DE QUARTO OCUPADO -     ");
    System.out.println("==========================================");
    
    do { 
        System.out.print("[ ] Arrumação da CAMA OK? (S/N) ..........: ");
        cama = teclado.next();
    } while (!cama.equalsIgnoreCase("S") && !cama.equalsIgnoreCase("N")); 
    
    do {
        System.out.print("[ ] Troca de ENXOVAL OK? (S/N) .........: ");
        enxoval = teclado.next();
    } while (!enxoval.equalsIgnoreCase("S") && !enxoval.equalsIgnoreCase("N")); 
    
    do {
        System.out.print("[ ] Troca de TOALHAS OK? (S/N) .........: ");
        toalha = teclado.next();
    } while (!toalha.equalsIgnoreCase("S") && !toalha.equalsIgnoreCase("N"));
    
    do {
        System.out.print("[ ] Limpeza do BANHEIRO OK? (S/N) ......: ");
        banheiro = teclado.next();
    } while (!banheiro.equalsIgnoreCase("S") && !banheiro.equalsIgnoreCase("N"));
    
    do {
        System.out.print("[ ] Retirada do LIXO OK? (S/N) .........: ");
        lixo = teclado.next();
    } while (!lixo.equalsIgnoreCase("S") && !lixo.equalsIgnoreCase("N"));
    
    do {
        System.out.print("[ ] Teste do FRIGOBAR OK? (S/N) ........: ");
        frigobar = teclado.next();
    } while (!frigobar.equalsIgnoreCase("S") && !frigobar.equalsIgnoreCase("N"));
    
    do {
        System.out.print("[ ] Teste do AR CONDICIONADO OK? (S/N) ..: ");
        arCondicionado = teclado.next();
    } while (!arCondicionado.equalsIgnoreCase("S") && !arCondicionado.equalsIgnoreCase("N"));
    
    do {
        System.out.print("[ ] Teste da TELEVISÃO OK? (S/N) ........: ");
        televisao = teclado.next();
    } while (!televisao.equalsIgnoreCase("S") && !televisao.equalsIgnoreCase("N"));
    
    System.out.println("");
    System.out.println("==========================================");
    System.out.println("          CHECK LIST CONCLUÍDO!           ");
    System.out.println("==========================================");
    System.out.println(" --- Pressione ENTER para continuar --- ");
    teclado.nextLine();
            
} // Fechamento checkListtRapido(); 

static void checkListGeral() {
    
    System.out.println("==========================================");
    System.out.println("          INSPEÇÃO DE GOVERNANÇA          ");
    System.out.println("        - REVISÃO GERAL DETALHADA -       ");
    System.out.println("==========================================");
    
    do {
        System.out.print("[ ] JANELAS/CORTINAS (S/N) .........: ");
        cortina = teclado.next();
    } while (!cortina.equalsIgnoreCase("S") && !cortina.equalsIgnoreCase("N"));
        
    do {
        System.out.print("[ ] HIGIENIZAÇÃO COLCHÃO (S/N) .....: ");
        cama = teclado.next();
    } while (!cama.equalsIgnoreCase("S") && !cama.equalsIgnoreCase("N")); 
    
    do {
        System.out.print("[ ] TESTE LÂMPADAS/TOMADAS (S/N) ...: ");
        lampada = teclado.next();        
    } while (!lampada.equalsIgnoreCase("S") && !lampada.equalsIgnoreCase("N"));
    
    do {
        System.out.print("[ ] TESTE AR CONDICIONADO (S/N) ....: ");
        arCondicionado = teclado.next();
    } while (!arCondicionado.equalsIgnoreCase("S") && !arCondicionado.equalsIgnoreCase("N"));
    
    do {
        System.out.print("[ ] TESTE TELEVISÃO (S/N) ..........: ");
        televisao = teclado.next();
    } while (!televisao.equalsIgnoreCase("S") && !televisao.equalsIgnoreCase("N"));
    
    do {
        System.out.print("[ ] TESTE FRIGOBAR (S/N) ...........: ");
        frigobar = teclado.next();
    } while (!frigobar.equalsIgnoreCase("S") && !frigobar.equalsIgnoreCase("N"));
    
    System.out.println("");
    System.out.println("==========================================");
    System.out.println("          CHECK LIST CONCLUÍDO!           ");
    System.out.println("==========================================");
    System.out.println(" --- Pressione ENTER para continuar --- ");
    teclado.nextLine();
    
} // Fechamento checkListGeral();

static void realizarCheckList() {
    
    System.out.println("==========================================");
    System.out.println("          INSPEÇÃO DE GOVERNANÇA          ");
    System.out.println("  -  ARRUMAÇÃO DE QUARTO PÓS CHECK-OUT  - ");
    System.out.println("==========================================");
    
    do { 
        System.out.print("[ ] Frigobar OK? (S/N) .............: ");
        frigobar = teclado.next();
    } while (!frigobar.equalsIgnoreCase("S") && !frigobar.equalsIgnoreCase("N"));
    
    do {
        System.out.print("[ ] Ar Condicionado OK? (S/N) ......: ");
        arCondicionado = teclado.next();
    } while (!arCondicionado.equalsIgnoreCase("S") && !arCondicionado.equalsIgnoreCase("N"));
    
    do {
        System.out.print("[ ] Televisão OK? (S/N) ..........: ");
        televisao = teclado.next();
    } while (!televisao.equalsIgnoreCase("S") && !televisao.equalsIgnoreCase("N"));
    
    do {
        System.out.print("[ ] Cama/Enxoval OK? (S/N) .......: ");
        cama = teclado.next();
    } while (!cama.equalsIgnoreCase("S") && !cama.equalsIgnoreCase("N"));
    
    do {
        System.out.print("[ ] Toalhas OK? (S/N) ............: ");
        toalha = teclado.next();
    } while (!toalha.equalsIgnoreCase("S") && !toalha.equalsIgnoreCase("N"));
    
    System.out.println("");
    System.out.println("==========================================");
    System.out.println("          CHECK LIST CONCLUÍDO!           ");
    System.out.println("==========================================");
    System.out.println(" --- Pressione ENTER para continuar --- ");
    teclado.nextLine();
    
} // Fechamento realizarCheckList();

static void realizarInspecao() {
    
    int statusAnterior = quartos[posicao].getStatusAnterior();
    
    System.out.println("Deseja iniciar a INSPEÇÃO do quarto " + numQuarto + " ? (S/N) ");
    resposta = teclado.next();
    
        if (resposta.equalsIgnoreCase("S")) {
            if (quartos[posicao].getStatus() == 9) {
                checkListGeral();
                if (frigobar.equalsIgnoreCase("N") ||
                    arCondicionado.equalsIgnoreCase("N") ||
                    televisao.equalsIgnoreCase("N"))  {
                    quartos[posicao].bloquearManutencao();
                    System.out.println("=========== A T E N Ç Ã O ================");
                    System.out.println("DEFEITO TÉCNICO DETECTADO APÓS MANUTENÇÃO ");
                    System.out.println("QUARTO IRÁ RETORNAR PARA MANUTENÇÃO TÉCNICA ");
                    System.out.println("===========================================");
                    System.out.println(" --- Pressione ENTER para continuar --- ");
                    teclado.nextLine();
                    teclado.nextLine();
                }    
             
            } else 
                switch (statusAnterior) {
                    case 2: 
                        realizarCheckList();
                        if (frigobar.equalsIgnoreCase("N") ||
                            arCondicionado.equalsIgnoreCase("N") ||
                            televisao.equalsIgnoreCase("N")) {
                            quartos[posicao].bloquearManutencao();
                            System.out.println("=========== A T E N Ç Ã O ================");
                            System.out.println("DEFEITO TÉCNICO DETECTADO DURANTE CHECK-OUT");
                            System.out.println("QUARTO EM MANUTENÇÃO - AGUARDANDO TÉCNICO");
                            System.out.println("===========================================");
                            System.out.println(" --- Pressione ENTER para continuar --- ");
                            teclado.nextLine();
                            teclado.nextLine();
                        }
                        break;
                    case 5: 
                        checkListRapido();
                        if (frigobar.equalsIgnoreCase("N") || 
                            arCondicionado.equalsIgnoreCase("N") ||
                            televisao.equalsIgnoreCase("N")) {
                            quartos[posicao].solicitarManutencaoUrgente();
                            System.out.println("=========== A T E N Ç Ã O ================");
                            System.out.println("DEFEITO TÉCNICO DETECTADO DURANTE ARRUMAÇÃO");
                            System.out.println("QUARTO EM MANUTENÇÃO - URGENTE - ");
                            System.out.println("===========================================");
                            System.out.println(" --- Pressione ENTER para continuar --- ");
                            teclado.nextLine();
                            teclado.nextLine();
                        }
                        break;
                    case 6: 
                        checkListGeral();
                        if (frigobar.equalsIgnoreCase("N") || 
                            arCondicionado.equalsIgnoreCase("N") ||
                            televisao.equalsIgnoreCase("N")) {
                            quartos[posicao].bloquearManutencao();
                            System.out.println("=========== A T E N Ç Ã O ================");
                            System.out.println("DEFEITO TÉCNICO DETECTADO DURANTE INSPEÇÃO");
                            System.out.println("QUARTO EM MANUTENÇÃO - AGUARDANDO TÉCNICO ");
                            System.out.println("===========================================");
                            System.out.println(" --- Pressione ENTER para continuar --- ");
                            teclado.nextLine();
                            teclado.nextLine();
                        }
                        break;            
              }
         if (quartos[posicao].getStatus() != 7 && quartos[posicao].getStatus() != 8) {
             System.out.println("Finalizar limpeza e liberar o quarto " + numQuarto + " ? (S/N) ");
             resposta = teclado.next();
                if (resposta.equalsIgnoreCase("S")) {
                    if (statusAnterior == 5) {
                        quartos[posicao].realizarCheckin();
                        System.out.println("=========== A T E N Ç Ã O ================");
                        System.out.println("Check-out NÃO DETECTADO! Quarto segue OCUPADO ");
                        System.out.println("===========================================");
                        System.out.println(" --- Pressione ENTER para continuar --- ");
                         teclado.nextLine();
                         teclado.nextLine();
                    } else { 
                             quartos[posicao].liberarQuarto();
                             System.out.println("=========== A T E N Ç Ã O ================");
                             System.out.println("O quarto " + numQuarto + " agora está DISPONÍVEL ");
                             System.out.println("===========================================");
                             System.out.println(" --- Pressione ENTER para continuar --- ");
                             teclado.nextLine();
                             teclado.nextLine(); }
                } else {
                         System.out.println("=========== A T E N Ç Ã O ================");
                         System.out.println("AVISO: Limpeza não finalizada! Quarto permanece EM LIMPEZA ");
                         System.out.println("===========================================");
                         System.out.println(" --- Pressione ENTER para continuar --- ");
                         teclado.nextLine();
                         teclado.nextLine(); }
                }                       
        }  else {
             System.out.println("=========== A T E N Ç Ã O ================");
             System.out.println("Check-list NÃO iniciado! ");
             System.out.println("===========================================");
             System.out.println(" --- Pressione ENTER para continuar --- ");  
             teclado.nextLine();
             teclado.nextLine();
        }
 
} // Fechamento realizarInspecao();


    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
    inicializarQuartos(); 
     do {
        cabecalhoInicio();
        exibirQuartos();
        exibirMenu();
        
        System.out.print("Selecione a opção: ");
        try {
            opcao = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("=========== A T E N Ç Ã O ================");
            System.out.println("ERRO: Digite apenas números! ");
            System.out.println("==========================================");
            System.out.println(" --- Pressione ENTER para continuar --- ");
        teclado.next(); 
        teclado.nextLine();
        teclado.nextLine();
        opcao = -1;
}
        
        solicitarDados();
        validarTrava();
        
        switch (opcao) {
            case 1: realizarCheckout(); break;
            case 2: arrumacaoQuarto(); break;
            case 3: realizarLimpeza(); break;
            case 4: realizarInspecao(); break;
            case 5: realizarCheckin(); break;
            case 6: realizarRevisao(); break;
            case 7: manutencaoTec(); break;
            case 8: manutencaoGer(); break;
            case 0: System.out.println("SISTEMA ENCERRADO"); break;
        }       
    } while (opcao != 0);

    
    } // Fechamento do main    
} // Fechamento public class Hotel Governance System