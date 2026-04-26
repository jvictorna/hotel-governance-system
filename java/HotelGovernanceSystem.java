package hotelgovernancesystem;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Sistema de Governança Hoteleira
 * Controle de status e limpeza de quartos
 * Desenvolvido como projeto prático do curso de ADS
 * 
 * @author João Adorno
 * @version 2.0
 */
public class HotelGovernanceSystem {
    
    static int[] statusQuartos = new int[38];
    static int[] statusAnterior = new int[38];
    static int[] numerosQuartos = new int[38];

    static int opcao, numQuarto, opcaoManut, posicao;

    static String frigobar, arCondicionado, televisao;
    static String cama, enxoval, toalha, banheiro, lixo, lampada, cortina;
    static String resposta;

    static Scanner teclado = new Scanner(System.in);
       
    
static void inicializarQuartos() {
        
numerosQuartos[0] = 2;
numerosQuartos[1] = 3;
numerosQuartos[2] = 4;
numerosQuartos[3] = 5;
numerosQuartos[4] = 101;
numerosQuartos[5] = 102;
numerosQuartos[6] = 103;
numerosQuartos[7] = 104;
numerosQuartos[8] = 105;
numerosQuartos[9] = 106;
numerosQuartos[10] = 107;
numerosQuartos[11] = 108;
numerosQuartos[12] = 109;
numerosQuartos[13] = 110;
numerosQuartos[14] = 111;
numerosQuartos[15] = 112;
numerosQuartos[16] = 201;
numerosQuartos[17] = 202;
numerosQuartos[18] = 203;
numerosQuartos[19] = 204;
numerosQuartos[20] = 205;
numerosQuartos[21] = 206;
numerosQuartos[22] = 207;
numerosQuartos[23] = 208;
numerosQuartos[24] = 209;
numerosQuartos[25] = 210;
numerosQuartos[26] = 211;
numerosQuartos[27] = 301;
numerosQuartos[28] = 302;
numerosQuartos[29] = 303;
numerosQuartos[30] = 304;
numerosQuartos[31] = 305;
numerosQuartos[32] = 306;
numerosQuartos[33] = 307;
numerosQuartos[34] = 308;
numerosQuartos[35] = 309;
numerosQuartos[36] = 310;
numerosQuartos[37] = 311;

Arrays.fill(statusQuartos, 1);
Arrays.fill(statusAnterior, 0);        
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
       System.out.print("Quarto " + numerosQuartos[i] +":" );
       switch (statusQuartos[i]) {
           case 1: System.out.println(" DISPONÍVEL"); break;
           case 2: System.out.println(" SUJO - Aguardando limpeza (II)"); break;
           case 3: System.out.println(" EM LIMPEZA - Aguardando finalização"); break;
           case 4: System.out.println(" OCUPADO - Não incomodar"); break;
           case 5: System.out.println(" ARRUMAÇÃO PENDENTE - Aguardando limpeza (I)"); break;
           case 6: System.out.println(" REVISÃO DE LONGA DATA - Aguardando limpeza (III)"); break;
           case 7: System.out.println(" EM MANUTENÇÃO - Aguardando liberação técnica"); break;
           case 8: System.out.println(" MANUTENÇÃO URGENTE - Acionar equipe"); break;
           case 9: System.out.println(" REVISÃO PÓS MANUTENÇÃO - Aguardando inspeção"); break;       
       }
   }
       System.out.println("========================================="); 
       System.out.println("              1º A N D A R               ");
       System.out.println("========================================="); 
    for (int i = 4; i < 16; i++) {
        System.out.print("Quarto " + numerosQuartos[i] + ":");
        switch (statusQuartos[i]) {
           case 1: System.out.println(" DISPONÍVEL"); break;
           case 2: System.out.println(" SUJO - Aguardando limpeza (II)"); break;
           case 3: System.out.println(" EM LIMPEZA - Aguardando finalização"); break;
           case 4: System.out.println(" OCUPADO - Não incomodar"); break;
           case 5: System.out.println(" ARRUMAÇÃO PENDENTE - Aguardando limpeza (I)"); break;
           case 6: System.out.println(" REVISÃO DE LONGA DATA - Aguardando limpeza (III)"); break;
           case 7: System.out.println(" EM MANUTENÇÃO - Aguardando liberação técnica"); break;
           case 8: System.out.println(" MANUTENÇÃO URGENTE - Acionar equipe"); break;
           case 9: System.out.println(" REVISÃO PÓS MANUTENÇÃO - Aguardando inspeção"); break;  
    }    
        }
       System.out.println("========================================="); 
       System.out.println("              2º A N D A R               ");
       System.out.println("========================================="); 
    for (int i = 16; i < 27; i++) {
        System.out.print("Quarto " + numerosQuartos[i] + ":");
        switch (statusQuartos[i]) {
           case 1: System.out.println(" DISPONÍVEL"); break;
           case 2: System.out.println(" SUJO - Aguardando limpeza (II)"); break;
           case 3: System.out.println(" EM LIMPEZA - Aguardando finalização"); break;
           case 4: System.out.println(" OCUPADO - Não incomodar"); break;
           case 5: System.out.println(" ARRUMAÇÃO PENDENTE - Aguardando limpeza (I)"); break;
           case 6: System.out.println(" REVISÃO DE LONGA DATA - Aguardando limpeza (III)"); break;
           case 7: System.out.println(" EM MANUTENÇÃO - Aguardando liberação técnica"); break;
           case 8: System.out.println(" MANUTENÇÃO URGENTE - Acionar equipe"); break;
           case 9: System.out.println(" REVISÃO PÓS MANUTENÇÃO - Aguardando inspeção"); break;  
        }        
    }

       System.out.println("========================================="); 
       System.out.println("              3º A N D A R               ");
       System.out.println("========================================="); 
    for (int i = 27; i <= 37; i++) {
        System.out.print("Quarto " + numerosQuartos[i] + ":");
        switch (statusQuartos[i]) {
           case 1: System.out.println(" DISPONÍVEL"); break;
           case 2: System.out.println(" SUJO - Aguardando limpeza (II)"); break;
           case 3: System.out.println(" EM LIMPEZA - Aguardando finalização"); break;
           case 4: System.out.println(" OCUPADO - Não incomodar"); break;
           case 5: System.out.println(" ARRUMAÇÃO PENDENTE - Aguardando limpeza (I)"); break;
           case 6: System.out.println(" REVISÃO DE LONGA DATA - Aguardando limpeza (III)"); break;
           case 7: System.out.println(" EM MANUTENÇÃO - Aguardando liberação técnica"); break;
           case 8: System.out.println(" MANUTENÇÃO URGENTE - Acionar equipe"); break;
           case 9: System.out.println(" REVISÃO PÓS MANUTENÇÃO - Aguardando inspeção"); break;  
        }        
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

static void solicitarDados(){ 
    if (opcao >= 1 && opcao <= 8) {
        System.out.print("Digite o número do quarto: ");
        numQuarto = teclado.nextInt();
        
        posicao = -1;
        for (int i = 0; i < 38; i++) {
            if (numerosQuartos[i] == numQuarto) {
                posicao = i;     
            }
        }
         if (posicao == -1) {
             System.out.println("QUARTO INVÁLIDO — verifique o número e tente novamente");
             opcao = -1;
         }     
    }
    
} // Fechamento solicitarDados();
    
static void validarTrava() {
    if (opcao == -1 || posicao == -1) return;
    
    if (opcao == 1) {
        if (statusQuartos[posicao] != 4) {
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
        if (statusQuartos[posicao] != 2) {
            if (statusQuartos[posicao] != 5) {
                if (statusQuartos[posicao] != 6) {
                    if (statusQuartos[posicao] != 9) {
            System.out.println("=========== A T E N Ç Ã O ================");
            System.out.println("ERRO: A limpeza não pode ser iniciada agora!");
                       if (statusQuartos[posicao] == 4) {
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
        if (statusQuartos[posicao] != 3) {
            if (statusQuartos[posicao] != 9) {
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
        if (statusQuartos[posicao] != 4) {
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
        if (statusQuartos[posicao] != 1) {
            System.out.println("=========== A T E N Ç Ã O ================");
            System.out.println("ERRO: Check-in não permitido! ");
            if (statusQuartos[posicao] == 4) {
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
        if (statusQuartos[posicao] != 1) {
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
        if (statusQuartos[posicao] == 7 || statusQuartos[posicao] == 8) {
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
        if (statusQuartos[posicao] != 7 && statusQuartos[posicao] != 8) {
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
    
    statusQuartos[posicao] = 2;
    System.out.println("=========== A T E N Ç Ã O ================");
    System.out.println("    O quarto " + numQuarto + " foi definido como SUJO! ");
    System.out.println("        AGUARDANDO LIMPEZA           ");
    System.out.println("==========================================");
    System.out.println(" --- Pressione ENTER para continuar --- ");
    teclado.nextLine();
    teclado.nextLine();
    
} // Fechamento do realizarCheckout(); 

static void realizarLimpeza() {
    
    statusAnterior[posicao] = statusQuartos[posicao];
    statusQuartos[posicao] = 3;
    System.out.println("=========== A T E N Ç Ã O ================");
    System.out.println("A limpeza do quarto " + numQuarto + " foi INICIADA ");
    System.out.println("    AGUARDANDO LIBERAÇÃO DA CAMAREIRA     ");
    System.out.println("==========================================");
    System.out.println(" --- Pressione ENTER para continuar --- ");
    teclado.nextLine();
    teclado.nextLine();
    
} // Fechamento realizarLimpeza();

static void realizarCheckin() {
    
    statusQuartos[posicao] = 4;
    System.out.println("=========== A T E N Ç Ã O ================");
    System.out.println("O quarto " + numQuarto + " está OCUPADO ");
    System.out.println("=========================================");
    System.out.println(" --- Pressione ENTER para continuar --- ");
    teclado.nextLine();
    teclado.nextLine();
    
} // Fechamento realizarCheckin(); 

static void arrumacaoQuarto() {
    
    statusQuartos[posicao] = 5;
    System.out.println("=========== A T E N Ç Ã O ================");
    System.out.println("O quarto " + numQuarto + " está EM ARRUMAÇÃO ");
    System.out.println("    AGUARDANDO LIBERAÇÃO DA CAMAREIRA     ");
    System.out.println("==========================================");
    System.out.println("--- Pressione ENTER para continuar ---");
    teclado.nextLine();
    teclado.nextLine();
} // Fechamento arrumacaoQuarto(); 

static void realizarRevisao() {
    
    statusAnterior[posicao] = statusQuartos[posicao];
    statusQuartos[posicao] = 6;
    System.out.println("=========== A T E N Ç Ã O ================");
    System.out.println("O quarto " + numQuarto + " precisa de REVISÃO DE LONGA DATA ");
    System.out.println("     AGUARDANDO INICIO DA LIMPEZA         ");
    System.out.println("==========================================");
    System.out.println(" --- Pressione ENTER para continuar --- ");
    teclado.nextLine();
    teclado.nextLine();
    
} // Fechamento realizarRevisao();

static void manutencaoTec() {
    
    statusQuartos[posicao] = 7; 
    System.out.println("=========== A T E N Ç Ã O ================");
    System.out.println("Foi identificado um problema no quarto " + numQuarto );
    System.out.println("  QUARTO BLOQUEADO PARA MANUTENÇÃO TÉCNICA ");
    System.out.println("===========================================");
    System.out.println(" --- Pressione ENTER para continuar --- ");
    teclado.nextLine();
    teclado.nextLine();
    
    
} // Fechamento manutencaoTec();

static void manutencaoGer() {
    
    if (statusQuartos[posicao] == 7 || statusQuartos[posicao] == 8) {
        System.out.println(" === CONCLUSÃO DE MANUTENÇÃO DO QUARTO " + numQuarto + " === ");
        System.out.println("1. Manutenção em quarto COM HÓSPEDE ");
        System.out.println("2. Manutenção em quarto VAZIO ");
        System.out.println("3. Manutenção concluída ");
        System.out.println("");
        System.out.println("INDIQUE A OPÇÃO ADEQUADA: ");
        opcaoManut = teclado.nextInt();
        
        switch (opcaoManut) { 
            case 1: 
                statusQuartos[posicao] = 4; 
                System.out.println("=========== S U C E S S O ================");
                System.out.println("       MANUTENÇÃO FINALIZADA              ");
                System.out.println("==========================================");
                System.out.println(" --- Pressione ENTER para continuar --- ");
                teclado.nextLine();
                teclado.nextLine();
            break;
            case 2: 
                statusQuartos[posicao] = 1; 
                System.out.println("=========== S U C E S S O ================");
                System.out.println("       MANUTENÇÃO FINALIZADA              ");
                System.out.println("==========================================");
                System.out.println(" --- Pressione ENTER para continuar --- ");
                teclado.nextLine();
                teclado.nextLine();
            break; 
            case 3: 
                statusAnterior[posicao] = statusQuartos[posicao]; 
                statusQuartos[posicao] = 9;
                System.out.println("=========== S U C E S S O ================");
                System.out.println("       MANUTENÇÃO FINALIZADA              ");
                System.out.println("==========================================");
                System.out.println("=========== A T E N Ç Ã O ================");
                System.out.println("    AGUARDANDO INSPEÇÃO DA GOVERNANÇA     ");
                System.out.println("==========================================");
                teclado.nextLine();
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
        System.out.print("[ ] TESTE AR CONDICIONADO (S/N) ....: ");
        arCondicionado = teclado.next();
    } while (!arCondicionado.equalsIgnoreCase("S") && !arCondicionado.equalsIgnoreCase("N"));
    
    do {
        System.out.print("[ ] HIGIENIZAÇÃO COLCHÃO (S/N) .....: ");
        cama = teclado.next();
    } while (!cama.equalsIgnoreCase("S") && !cama.equalsIgnoreCase("N")); 
    
    do {
        System.out.print("[ ] TESTE LÂMPADAS/TOMADAS (S/N) ...: ");
        lampada = teclado.next();        
    } while (!lampada.equalsIgnoreCase("S") && !lampada.equalsIgnoreCase("N"));
    
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
    teclado.nextLine();
    
} // Fechamento realizarCheckList();

static void realizarInspecao() {
    
    System.out.println("Deseja iniciar a INSPEÇÃO do quarto " + numQuarto + " ? (S/N) ");
    resposta = teclado.next();
        if (resposta.equalsIgnoreCase("S")) {
            if (statusQuartos[posicao] == 9) {
                checkListGeral();
                if (frigobar.equalsIgnoreCase("N") ||
                    arCondicionado.equalsIgnoreCase("N") ||
                    televisao.equalsIgnoreCase("N"))  {
                    statusQuartos[posicao] = 7;
                    System.out.println("=========== A T E N Ç Ã O ================");
                    System.out.println("DEFEITO TÉCNICO DETECTADO APÓS MANUTENÇÃO ");
                    System.out.println("QUARTO IRÁ RETORNAR PARA MANUTENÇÃO TÉCNICA ");
                    System.out.println("===========================================");
                    System.out.println(" --- Pressione ENTER para continuar --- ");
                    teclado.nextLine();
                    teclado.nextLine();
                }    
             
            } else 
                switch (statusAnterior[posicao]) {
                    case 2: 
                        realizarCheckList();
                        if (frigobar.equalsIgnoreCase("N") ||
                            arCondicionado.equalsIgnoreCase("N") ||
                            televisao.equalsIgnoreCase("N")) {
                            statusQuartos[posicao] = 7;
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
                            statusQuartos[posicao] = 8;
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
                            statusQuartos[posicao] = 7;
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
         if (statusQuartos[posicao] != 7 && statusQuartos[posicao] != 8) {
             System.out.println("Finalizar limpeza e liberar o quarto " + numQuarto + " ? (S/N) ");
             resposta = teclado.next();
                if (resposta.equalsIgnoreCase("S")) {
                    if (statusAnterior[posicao] == 5) {
                        statusQuartos[posicao] = 4;
                        System.out.println("=========== A T E N Ç Ã O ================");
                        System.out.println("Check-out NÃO DETECTADO! Quarto segue OCUPADO ");
                        System.out.println("===========================================");
                        System.out.println(" --- Pressione ENTER para continuar --- ");
                         teclado.nextLine();
                         teclado.nextLine();
                    } else { 
                             statusQuartos[posicao] = 1;
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
             System.out.println("Check-list não iniciado! ");
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
        opcao = teclado.nextInt();
        
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