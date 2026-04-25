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
    static String cama, enxoval, toalha, banheiro, lixo, cortina;
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
}

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
}

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
}

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
}
    
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
        
        switch (opcao) {
            case 1: System.out.println("CHECK-OUT RELIZADO"); break;
            case 2: System.out.println("LIMPEZA INICIADA"); break;
            case 3: System.out.println("CHECK-LIST INICIADO"); break;
            case 4: System.out.println("CHECK-IN REALIZADO"); break;
            case 5: System.out.println("ARRUMAÇÃO SOLICITADA"); break;
            case 6: System.out.println("REVISÃO PENDETE "); break;
            case 7: System.out.println("MANUTENÇÃO EM ANDAMENTO"); break;
            case 8: System.out.println("LIBERAR QUARTO PÓS MANUTENÇÃO"); break;
            case 0: System.out.println("SISTEMA ENCERRADO"); break;
        }       
    } while (opcao != 0);

    
    }   
}